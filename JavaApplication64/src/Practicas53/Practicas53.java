/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas53;

import entidad.CuentaBancaria;
import static service.CuentaBancariaService.ingresar;

/**
 *
 * @author 54117
 */
public class Practicas53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria German = new CuentaBancaria();
        ingresar(2000, German);
        
        
    }
    
}
