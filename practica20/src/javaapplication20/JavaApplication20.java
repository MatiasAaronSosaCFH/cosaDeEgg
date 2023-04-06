/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author 54117
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A,B,C,D,aux;
        A = 5;
        B = 10;
        C = 15;
        D = 20;
        
        System.out.println("Valores iniciales: " + "\n"
                + "A " + A + "\n"
                + "B " + B +"\n"
                + "C " + C +"\n"
                + "D " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Los valores cambiados son: "+ "\n"
                + "A " + A + "\n"
                + "B " + B +"\n"
                + "C " + C +"\n"
                + "D " + D);
        
    }
}
