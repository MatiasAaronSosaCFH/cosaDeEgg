/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author 54117
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int var = 0;
        int var2 = 2;
        try{
            System.out.println(var2/var);
        }catch(ArithmeticException exception){
            System.out.println(exception.toString());
        }
        
        
        System.out.println("Hola como estas ?");
    }
    
}
