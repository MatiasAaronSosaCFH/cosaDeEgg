/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas49;

import entidad.Cuenta;

/**
 *
 * @author 54117
 */
public class Practicas49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(5000.0, "Matias");
        
        cuenta.retirarDinero();
    }
    
}
