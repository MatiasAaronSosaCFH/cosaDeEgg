/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas38;

/**
 *
 * @author 54117
 */
public class Practicas38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int[] number = new int[5];
        
        for(int i = 0; i < 5; i++){
            
            numeros[i] = (int) (Math.round(Math.random()*10));
            number[i] = (int) (Math.round(Math.random()*10));
        }
        
        for(int i = 0; i < 5; i++){
            
            System.out.print(numeros[i]);
        }
        System.out.println("");
        for(int i = 0; i < 5; i++){
            System.out.print(number[i]);
        }
        System.out.println("");
        
        if(comparativa(numeros, number)){
            System.out.println("Si son iguales ambos vectores");
        }else{
            System.out.println("No son iguales");
        }
        
    }
    
    public static boolean comparativa(int[] array1, int[] array2){
        
        boolean siEs = true;
        
        for(int i = 0; i < 5; i++){
            
            if(array1[i] != array2[i]){
                siEs = false;
                break;
            }
        }
        
        return siEs;
    }
    
}
