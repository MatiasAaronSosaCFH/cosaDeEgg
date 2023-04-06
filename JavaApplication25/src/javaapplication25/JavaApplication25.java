/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scaneando = new Scanner(System.in);

        int cont = 0;
        System.out.println("Cuantos numeros vamos a evaluar");
        int cantNum = scaneando.nextInt();
        int numDet, numMax;

        while (cont == cantNum) {

            System.out.println("Ingresa los numeros a evaluar");
            int numScan = scaneando.nextInt();
            numDet = numScan;

            if (numDet > numScan) {

                numMax = numDet;
            }else{
                
                numMin =numDet;
            }

            cont += 1;
        }

    }

}
