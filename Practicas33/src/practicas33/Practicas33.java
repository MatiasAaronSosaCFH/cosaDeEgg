/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas33;

/**
 *
 * @author 54117
 */
public class Practicas33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] hastaElCien = new int[100];
        
        for(int i = 0; i < 100; i++ ){
            
            hastaElCien[i] = i + 1;
        }
        
        for(int num : hastaElCien){
            System.out.println(num);
        }
    }
    
}
