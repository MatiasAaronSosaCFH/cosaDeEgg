/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cantidad de tiempo en minutos ");
        int minutos = leer.nextInt();

        int horas, dias;
        
        horas = (minutos / 60);
        dias = horas / 24;
        horas = horas % 24;

        System.out.println("esa cantidad de minutos es igual a: " + "dias " + dias + " horas " + horas);
    }

}
