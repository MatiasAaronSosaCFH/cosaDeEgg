/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas29;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leyendo = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame 2 numeros para continuar a las operaciones");
        System.out.println("Primer numero"); int num1 = leyendo.nextInt();
        System.out.println("Segundo numero"); int num2 = leyendo.nextInt();
        
        System.out.println("Que operacion deseas realizar ?");
        System.out.println("1-Suma" + "\n"
                + "2-Resta" + "\n"
                + "3-Multiplicacion" + "\n"
                + "4-Division");
        int resp = leyendo.nextInt();
        
        switch(resp){
            
            case 1:
                System.out.println("La suma de los 2 numeros anteriores es = " + suma(num1, num2));
                break;
                
            case 2:
                System.out.println("La suma de los 2 numeros anteriores es = " + resta(num1, num2));
                break;
                
            case 3:
                System.out.println("La suma de los 2 numeros anteriores es = " + multiplicacion(num1, num2));
                break;
                
            case 4:
                System.out.println("La suma de los 2 numeros anteriores es = " + division(num1, num2));
                break;
            default:
                System.out.println("Caracter no valido, fin del programa");
                
        }
        
    }
    
    public static int suma(int numero1, int numero2){
        
        return numero1 + numero2;
    }
    
    public static int resta(int numero1, int numero2){
        
        return numero1 - numero2;
    }
    
    public static int multiplicacion(int numero1, int numero2){
        
        return numero1 * numero2;
    }
    
    public static double division(int numero1, int numero2){
        
        return numero1 / numero2;
    }
}
