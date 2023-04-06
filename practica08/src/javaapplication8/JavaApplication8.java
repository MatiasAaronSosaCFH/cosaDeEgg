/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        boolean salir =false;
        
        do {
            System.out.println("Ingrese el tipo de motor ( 1 - 4) (5 para salir)");
            int tipoMotor = scan.nextInt();
            
            switch(tipoMotor){
            
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            case 5:
                System.out.println("Saliendo del sistema...");
                salir = true;
                break;
            default:
                System.out.println("No existe un valor para ese tipo de bomba");
            }
        } while (!salir);
        
    }
    
}
