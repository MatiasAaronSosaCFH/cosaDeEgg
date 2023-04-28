/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas55;

import entidad.CuentaBancaria;
import service.CuentaBancariaService;

/**
 *
 * @author 54117
 */
public class Practicas55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        CuentaBancariaService service = new CuentaBancariaService();
        
        service.crearCuenta(cuenta);
        System.out.println("");
        service.ingresar(cuenta);
        System.out.println("");
        cuenta = service.extraccionRapida(cuenta);
        System.out.println("");
        service.retirar(cuenta);
        System.out.println("");
        System.out.println(service.consultarSaldo(cuenta));
        System.out.println("");
        System.out.println(service.consultarDatos(cuenta));
    }
    
}
