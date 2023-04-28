/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("No se puede tener saldo negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero() {

        Scanner leyending = new Scanner(System.in).useDelimiter("\n");

        do {
            System.out.println("Hola " + this.titular + " tu saldo es " + this.saldo);
            System.out.println("Ingresa el importe a retirar");
            double retiro = leyending.nextInt();

            if (retiro > this.saldo) {
                System.out.println("Tu saldo no es suficiente");
            } else {
                this.saldo -= retiro;
                System.out.println("Tu saldo restante es " + this.saldo);
            }

            System.out.println("Deseas volver a retirar ? (si,no)");
            String resp = leyending.next();

            if (resp.equalsIgnoreCase("no")) {
                break;
            } else if (resp.equalsIgnoreCase("si")) {
                System.out.println("Reiniciando");
            } else {
                System.out.println("Caracter incorrecto se terminara el programa");
                break;
            }
        } while (true);

    }
}
