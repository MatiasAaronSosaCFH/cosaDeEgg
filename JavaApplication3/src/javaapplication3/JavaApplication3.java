/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int numeroIni = leer.nextInt();
        double raizCuadrada =  Math.sqrt(numeroIni);
        
        System.out.println("El doble de tu numero es: " + (numeroIni+numeroIni));
        System.out.println("El triple de tu numero es: " + (numeroIni+numeroIni+numeroIni));
        System.out.println("La raiz cuadrada de tu numero es: "+ (Math.sqrt(numeroIni)));
        System.out.println("La raiz cuadrada de tu numero es: "+ raizCuadrada);
    }
    
}
