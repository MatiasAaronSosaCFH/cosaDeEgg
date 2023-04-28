/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class CuentaBancariaService {
    
    private final  Scanner leerCuentaBancaria = new Scanner(System.in).useDelimiter("\n");
    
    public void crearCuenta(CuentaBancaria cuenta1){
        
        System.out.println("Ingrese el numero de cuenta ");
        cuenta1.setNumeroCuenta(leerCuentaBancaria.nextInt());
        System.out.println("Ingra el dni del cliente ");
        cuenta1.setDniCliente(leerCuentaBancaria.nextLong());
        System.out.println("Cual es el saldo inicial de la cuenta ?");
        cuenta1.setSaldoActual(leerCuentaBancaria.nextDouble());
        
    }
    
    public void ingresar(CuentaBancaria cuenta1){
        
        System.out.println("Cuanto deseas ingresar en tu cuenta ?");
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+leerCuentaBancaria.nextDouble());
    }
    
    public void retirar(CuentaBancaria cuenta1){
        
        System.out.println("Cuanto vas a retirar de tu cuenta ?");
        double retiro = leerCuentaBancaria.nextDouble();
        
        if(retiro > cuenta1.getSaldoActual()){
            System.out.println("No tienes saldo suficiente para ese retiro, se retira todo lo que hay en cuenta");
            System.out.println("Se retirara " + cuenta1.getSaldoActual());
            cuenta1.setSaldoActual(0);
        }else{
            System.out.println("Se retirara " + retiro);
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retiro);
            System.out.println("Tu saldo actual es: " + cuenta1.getSaldoActual());
        }
    }
    
    public CuentaBancaria extraccionRapida(CuentaBancaria cuenta){
        
        System.out.println("Cuanto vas a retirar de tu cuenta ?(extraccion rapida - del 20%)");
        double retiro = leerCuentaBancaria.nextDouble();
        
        if(retiro > cuenta.getSaldoActual()*0.2){
            
            System.out.println("No se puede sacar mas del 20% del saldo actual");
        }else{
            
            System.out.println("Se retiro " + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
            System.out.println("Tu saldo restante es: " + cuenta.getSaldoActual());
        }
        
        return cuenta;
    }
    
    public double consultarSaldo(CuentaBancaria cuenta){
        return cuenta.getSaldoActual();
    }
    
    public String consultarDatos(CuentaBancaria cuenta){
        return cuenta.toString();
    }
}
