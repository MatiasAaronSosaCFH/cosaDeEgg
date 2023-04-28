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

    private static final Scanner scanCuentaService = new Scanner(System.in).useDelimiter("\n");

    public static CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("ingrese su DNI");
        cuenta1.setDniCliente(scanCuentaService.nextLong());
        System.out.println("Ingrese numero de cuenta");
        cuenta1.setNumeroCuenta(scanCuentaService.nextInt());
        System.out.println("Ingrese el saldo inicial de la cuenta");
        cuenta1.setSaldoActual(scanCuentaService.nextDouble());

        return cuenta1;
    }

    public static void ingresar(double ingresos, CuentaBancaria cuenta) {

        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingresos);

    }

    public static void retirar(double retiro, CuentaBancaria cuenta) {

        double retiros = cuenta.getSaldoActual() - retiro;
        if (retiros < 0) {
            retiros = 0;
        }
        cuenta.setSaldoActual(retiros);
    }

    public static void extraccionRapida(CuentaBancaria cuenta) {

        System.out.println("Cuanto vas a retirar ?");
        double retiro = scanCuentaService.nextDouble();

        if (retiro > cuenta.getSaldoActual() * 0.2) {

            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            System.out.println("No se puede hacer una extraccion rapida mayor al 20% del saldo actual");
        }

    }
    public static String  consultarSaldo(CuentaBancaria cuenta){
        return "El saldo actual es: " + cuenta.getSaldoActual();
    }
    
    public static void consultarDator(CuentaBancaria cuenta){
        System.out.println(cuenta.toString());
    }
}
