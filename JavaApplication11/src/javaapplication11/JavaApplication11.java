/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author 54117
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num = Math.random() * 10;
        num = (int)Math.round(num);

        if (num % 2 == 0) {

            System.out.println("El numero " + num + " es Par");
        } else {
            System.out.println("El numero " + num + " es Impar");
        }
    }

}
