/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas36;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int[][] cuadradoMagico = new int[3][3];
        
        System.out.println("Ingrese 9 (del 1 - 9) numeros para rellenar el cuadrado magico ");
        
                for(int i = 0; i < 3; i++){              
                    for(int j = 0; j < 3; j++){
                        
                        int num = leer.nextInt();
                        if(num<10 && num>0){
                            cuadradoMagico[i][j] = num;
                        }
                        else{
                            System.out.println("Intentalo de nuevo, el caracter no es un numero entre el 1-9");
                            j--;
                        }
                    }
                }
        
        for(int[] numero : cuadradoMagico){
            
            System.out.println(Arrays.toString(numero));
        }
        
        if(comprovacion(cuadradoMagico)){
            
            System.out.println("El cuadrado si es magico");
        }else{
            System.out.println("El cuadrado no es magico");
        }
    }
    
    public static boolean comprovacion(int[][] matriz){
        
        boolean esONoEs = false;
        int columna = 0;
        int fila = 0;
        int diagonal = 0;
        
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++){
                
                if(i == 0){
                    columna = columna + matriz[j][i];
                }
                if(i == 1){
                    fila = fila + matriz[i][j];
                }
                
                
                if(i == j){
                    diagonal = diagonal + matriz[i][j];
                }
            }
            
        }
        
        if(columna == fila && fila == diagonal){
            esONoEs = true;
        }
        
        return esONoEs;
    }
}
