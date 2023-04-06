/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String fraseReal, fraseIngr;

        System.out.println("Ingrese una frase");
        fraseIngr = scan.nextLine();
        fraseReal = "eureka";
        fraseIngr = fraseIngr.toLowerCase();

        if (fraseIngr.equals(fraseReal)) {

            System.out.println("Correcto!!");
        } else {

            System.out.println("Incorrecto");
        }
    }

}
