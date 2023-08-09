/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas67;

import static service.utilidades.*;
import service.utilidades;
import static java.lang.Math.*;
/**
 *
 * @author 54117
 */
public class Practicas67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] meses = cargarArray();
        
        String mesSecreto = meses[(int) Math.round(Math.random()*11)];
        
        adivinando(meses,mesSecreto);
        
        System.out.println("");
        System.out.println(mesSecreto);
        
    }
    
    
}
