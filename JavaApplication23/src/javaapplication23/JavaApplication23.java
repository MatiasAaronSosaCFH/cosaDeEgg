/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leyendo = new Scanner(System.in);

        System.out.println("Ingrese la clase de el socio");

        System.out.println("Socio clase 'A' "
                + "Socio clase 'B'"
                + "Socio Clase 'C'");

        String clase = leyendo.nextLine();

        System.out.println("Ingrese el monto a pagar");

        double pago = leyendo.nextInt();

        switch (clase) {
            case "A":
                System.out.println("Debe abonar: " + pago / 2);
                break;
            case "B":
                System.out.println("Debe abonar " + pago * 0.65 );
                break;
            case "C":
                System.out.println("Debe abonar " + pago);
                break;
        }
    }
}
