/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas62;

import entidad.ParDeNumeros;
import static service.ParDeNumerosService.*;

/**
 *
 * @author 54117
 */
public class Practicas62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParDeNumeros pares = new ParDeNumeros();
        
        calcularRaiz(pares);
        calcularPotencia(pares);
        mostrarValores(pares);
        
    }
    
}
