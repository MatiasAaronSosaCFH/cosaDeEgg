/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiddad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int getNumero1() {
        return this.numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero1(int num1) {
        this.numero1 = num1;
    }

    public void setNumero2(int num2) {
        this.numero2 = num2;
    }

    public int sumar() {
        int sumar = this.numero1 + this.numero2;
        return sumar;
    }

    public int restar() {
        int resta = this.numero1 - this.numero2;
        return resta;
    }

    public int multiplicar() {
        int multiplicacion = 0;
        if (this.numero1 != 0 && this.numero2 != 0) {
            multiplicacion = this.numero1 * this.numero2;
        } else {
            System.out.println("No se puede multiplicar por 0");
        }
        return multiplicacion;
    }

    public double dividir() {
        double dividir = 0;
        if (this.numero1 != 0 && this.numero2 != 0) {
            dividir = this.numero1 / this.numero2;
        } else {
            System.out.println("No se puede divir por 0");
        }
        return dividir;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        this.numero2 = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
}
