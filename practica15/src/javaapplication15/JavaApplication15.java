/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scaneando = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un limite para la suma");
        int numFin = scaneando.nextInt();
        int suma = 0;

        do {

            System.out.println("Ingrese un numero para agregar a la suma");
            int digitIngr;
            digitIngr = scaneando.nextInt();
            suma += digitIngr;

        } while (suma <= numFin);

        if(suma > numFin){
            
            System.out.println("La suma supero el limite, la suma es: " + suma);
        }else{
            
            System.out.println("Llegaste a el limte de la suma = " + suma);
        }
        
    }
}
