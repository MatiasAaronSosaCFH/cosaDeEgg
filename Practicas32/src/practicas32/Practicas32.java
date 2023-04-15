/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas32;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leyending = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num = leyending.nextInt();
        
        System.out.println(esPrimo(num));
        
    }
    
    public static boolean esPrimo(int numer){
        
        boolean esPrimoONo = false;
        int cont = 0;
        for(int i = 1; i <= numer; i++ ){
            
            if(numer % i == 0){
                cont = cont + 1;
            }
        }
        
        if(cont == 2){
            esPrimoONo = true;
        }
        
        return esPrimoONo;
    }
    
}
