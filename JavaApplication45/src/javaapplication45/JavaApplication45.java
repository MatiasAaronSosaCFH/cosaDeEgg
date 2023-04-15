/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leyending = new Scanner(System.in).useDelimiter("\n");

        String palabra;
        int cont1 = 0;
        int cont2 = 0;
        boolean verdad = true;

        do {

            System.out.println("Ingrese una palabra, con un maximo de 5 caracteres");
            palabra = leyending.next();

            if (palabra.length() == 5) {
                if ("X".equals(palabra.substring(0, 1)) && palabra.endsWith("O")) {
                    cont1++;
                } else {
                    cont2++;
                }
                if (palabra.equals("&&&&&")) {
                    verdad = false;
                }
            } else {
                System.out.println("La palabra ingresada tiene mas de 5 caracteres");
            }

        } while (verdad);

        System.out.println("La cantidad de cadenas correctas es " + cont1);
        System.out.println("La cantidad de cadenas incorrectas es " + cont2);

    }

}
