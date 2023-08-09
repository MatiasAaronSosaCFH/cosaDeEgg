/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import entidades.Persona;

public class JavaApplication17 {

    public static void main(String[] args) {
        
        Persona pUno = new Persona();
        
        int[] numeros  = pUno.getEdad();
        
        numeros[0] = 500;
        
        System.out.println(pUno.getEdad()[0]);
    }
    
}
