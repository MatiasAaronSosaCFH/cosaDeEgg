/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String letra = "A";
        
        System.out.println("Ingrese una frase que comience con 'A' ");
        String oracion = scan.nextLine();
        
        if(oracion.substring(0, 1).toUpperCase().equals(letra)){
            
            System.out.println("CORRECTO!");
        }else{
            
            System.out.println("INCORRECTO");
        }
    }

}
