/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa 2 numeros enteros positivos ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean salir = false;

        do {

            System.out.println("MENU");

            System.out.println("1.Sumar" + "\n"
                    + "2.Restar" + "\n"
                    + "3.Multiplicar" + "\n"
                    + "4.Dividir" + "\n"
                    + "5.salir" + "\n");

            int decision = leer.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Estas seguro que desea salir de lprograma (S/N) ?");
                    String resp = leer.nextLine();

                    if (resp.toUpperCase() == "S") {

                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Caracter no valido");
            }
            System.out.println("--------------------------------------");
        } while (!salir);
    }
}
