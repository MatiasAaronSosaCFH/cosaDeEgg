/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leyending = new Scanner(System.in);

        System.out.println("Cuantas personas vamos a medir hoy ? ");
        int cantPersonas = leyending.nextInt();
        double suma = 0;
        double suma2 = 0;
        int cont = 0;
        int cont2 = 0;

        do {
            System.out.println("ingresa la estatura de la persona " + cont2 + 1);
            Double altura = leyending.nextDouble();

            if (altura < 1.60) {

                suma += altura;
                cont += 1;
            }
            
            suma2 += altura;
            
            cont2 += 1;
        } while (cont2 < cantPersonas);

        System.out.println("El promedio de estaturas generales es: " + (suma2 / cantPersonas) );
        System.out.println("El promedio de estaturas menores a 1,60 es: " + (suma / cont) );
    }
}
