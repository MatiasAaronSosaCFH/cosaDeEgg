/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas40;

import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class Practicas40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        int sumaTodo = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j <4; j++){
                matriz[i][j] = (int)(Math.round(Math.random()*10));
                
                sumaTodo += matriz[i][j];
            }
            
        }
        for(int[] k : matriz){
            
            System.out.println(Arrays.toString(k));
        }
        
        System.out.println("Rellenamos una matriz y sumamos sus elementos, dan como resultado: " + sumaTodo);
    }
    
}
