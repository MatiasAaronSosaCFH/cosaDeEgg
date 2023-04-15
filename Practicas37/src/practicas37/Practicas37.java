/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas37;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 numeros para el Array");

        int num = 0;

        for (int i = 0; i < 5; i++) {

            numeros[i] = leer.nextInt();

        }
        
        for(int number : numeros){
            
            num = num + number;
        }
        
        System.out.println("La suma de los numeros es " + num);
    }

}
