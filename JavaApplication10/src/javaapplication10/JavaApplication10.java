/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int[] numeros = new int[4];
        
        System.out.println("Ingrese 4 numeros (entre 1 y 20) ");

        for (int i = 0; i < 4; i++) {

            int num = scan.nextInt();
            
            if (num < 21 && num > 0) {
                numeros[i] = num;
                
            } else {
                System.out.println("Ese numero no esta entre 1 y 20, intentalo de nuevo");
                break;
            }
        }

        for (int i : numeros) {
            
            System.out.print(i + " ");
            for (int j = 0; j < i; j++) {
                
                System.out.print("*");
            }            
            System.out.println(" ");
        }
    }
}
