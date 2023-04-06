/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa una frase de 8 caracteres");
        String fraseEntr = scan.nextLine();

        if (fraseEntr.length() == 8) {

            System.out.println("Correcto");
        } else {

            System.out.println("Incorrecto");
        }
    }

}
