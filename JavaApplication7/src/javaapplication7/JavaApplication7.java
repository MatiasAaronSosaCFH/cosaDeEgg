/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa 2 numeros enteros");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        if(num1 > 25 && num2 >25){
            
            System.out.println("Ambos son mayores que 25");
        }else if(num1 >25){
            
            System.out.println(num1 +" es mayor que 25, "+ num2 +" no lo es");
        }else if(num2 >25){
            
            System.out.println(num2 +" es mayor que 25, "+ num1 +" no lo es");
        }else{
            
            System.out.println(num1 + " y "+ num2 +" no son mayores que 25");
        }
    }
    
}
