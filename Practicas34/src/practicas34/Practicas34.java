/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas34;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que tan grande va a ser el vector ?");
        int tamanho = leer.nextInt();
        int[] vec = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {

            vec[i] = Math.round((int) (10 * Math.random()));
        }

        System.out.println("Que numero estas buscando ?");
        int number = leer.nextInt();
        int cont = 0;
        int posicion = 0;

        for (int num = 0; num < tamanho; num++) {

            if (number == vec[num]) {
                cont++;

                if (cont == 1) {
                    posicion = num;
                }
            }

            if (num == tamanho - 1 && cont > 0) {
                System.out.println("El numero se encuentra en la posicion "
                        + posicion + "\n"
                        + "Se encuentra repetido "
                        + cont + " cantidad de veces");
            } else if (num == tamanho - 1) {
                System.out.println("El numero no se encuentra en el vector");
            }

        }
    }

}
