/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int nota;

        do {            
            
            System.out.println("Ingresa una nota ");
            nota = leer.nextInt();
            
            if(nota > 10 || nota < 0){
                System.out.println("La nota ingresada no esta entre 0 y 10");
            }
        } while (nota > 10 || nota < 0);
        
        System.out.println("la nota ingresada es: "+ nota);
    }
}
