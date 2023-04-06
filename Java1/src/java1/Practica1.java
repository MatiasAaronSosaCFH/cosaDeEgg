/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase");
        
        Scanner frase = new Scanner(System.in);
        
        String fraseIngr =  frase.nextLine();
        
        System.out.println(fraseIngr.toUpperCase());
        System.out.println(fraseIngr.toLowerCase());
        
    }
 
}

