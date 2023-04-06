/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        int cont = 0;
        
        System.out.println("Ingrese 20 numeros");
        
        for (int i = 0; i <= 20; i++) {

            num = scan.nextInt();

            if (num == 0) {
                System.out.println("Se capturo un cero");
                i = 21;
            } else if (num > 0) {
                cont += num;
            }
        }
        System.out.println(cont);
    }
}
