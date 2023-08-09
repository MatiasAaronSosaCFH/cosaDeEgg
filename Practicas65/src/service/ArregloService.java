/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class ArregloService {
    
    public static void inicializarA(double[] array){
        
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random()*100;
        }
    }
    
    public static void mostrarArray(double[] array){
        
        int cont = 0;
        
        System.out.println("Mostrando Array");
        for(double num : array){
            if(cont > 5){
                cont = 0;
            }
            if(cont == 5){
                System.out.println(num);
            }else{
                System.out.print(num+"  ");
            }
            cont++;
        }
        System.out.println("");
        System.out.println("Termina muestra de array");
        System.out.println("");
    }
    
    public static void ordenarArray(double[] array){
        
        Arrays.sort(array);
    }
    
    public static void inicializarB(double[] arrayA,double[] arrayB){
        
        for(int i = 0; i < arrayB.length; i++){
            if(i<10){
                arrayB[i] = arrayA[i];
            }else{
                arrayB[i] = 0.5;
            }
            
        }
    }
}
