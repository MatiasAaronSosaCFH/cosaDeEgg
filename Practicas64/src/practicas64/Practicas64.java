/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas64;

import entidad.Cadena;
import static service.CadenaService.*;

/**
 *
 * @author 54117
 */
public class Practicas64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cadena frase = new Cadena("Las rosas son rojas");
        
        mostrarVocales(frase);
        invertirFrase(frase);
        
        System.out.println(frase.getFrase());
    }
    
}
