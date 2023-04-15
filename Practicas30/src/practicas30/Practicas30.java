/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas30;

import java.util.Random;

/**
 *
 * @author 54117
 */
public class Practicas30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[10000];
        int unDig = 0;
        int dosDig = 0;
        int tresDig = 0;
        int cuatroDig = 0;
        int cincoDig = 0;
        
        for(int i = 0; i < vector.length; i++){
            
            
            vector[i] = (int)Math.round(Math.random()*99999);
        }
        
        for(int number : vector){
            
            if(number <10000 && number > 999){
                cuatroDig++;
            }else if(number <1000 && number > 99){
                tresDig++;
            }else if(number <100 && number > 9){
                dosDig++;
            }else if(number <10){
                unDig++;
            }else{
                cincoDig++;
            }
            
            //System.out.println(number);
        }
        
        System.out.println("Los numeros de 1 digitos fueron " + unDig);        
        System.out.println("Los numeros de 2 digitos fueron " + dosDig);        
        System.out.println("Los numeros de 3 digitos fueron " + tresDig);        
        System.out.println("Los numeros de 4 digitos fueron " + cuatroDig);        
        System.out.println("Los numeros de 5 digitos fueron " + cincoDig);
    }
    
}
