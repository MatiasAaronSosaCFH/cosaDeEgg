/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas27;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 2 numeros y te diremos si el primero" + "\n" + "es multiplo del segundo" );
        System.out.print("primero "); int numero1 = scan.nextInt();
        System.out.println("segundo "); int numero2 = scan.nextInt();
        
        if(comprovacion(numero1, numero2)){
            
            System.out.println("El primer numero es multiplo del segundo");
        }
    }

    public static boolean comprovacion(int num1, int num2) {

        boolean esONoEs;

        if (num1 % num2 == 0) {

            esONoEs = true;
        } else {

            esONoEs = false;
        }

        return esONoEs;
    }

}
