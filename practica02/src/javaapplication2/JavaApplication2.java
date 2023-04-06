/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author 54117
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa los grados C° a convertir ");
        
        int gradosC = leer.nextInt();
        
        System.out.println("");
        
        int gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println(gradosC + "C° son equivalentes a " + gradosF + "F" );
        
        
    }
    
}
