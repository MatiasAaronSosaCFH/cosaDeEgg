/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas44;

import entiddad.Operacion;

/**
 *
 * @author 54117
 */
public class Practicas44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion oppp = new Operacion();
        Operacion op2 = new Operacion();
        Operacion op3 = new Operacion();
        Operacion op4 = new Operacion();
        
        oppp.crearOperacion();
        System.out.println(oppp.sumar());
        
        System.out.println(oppp.toString());
    }
    
}
