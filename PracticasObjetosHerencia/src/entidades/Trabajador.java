/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Trabajador extends Persona{
    
    private int id;
    private double salario;

    public Trabajador() {
    }

    public Trabajador(int id, double salario, String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.id = id;
        this.salario = salario;
    }

    @Override
    public void comer(){
        System.out.println("Almuerza");
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", salario=" + salario + '}';
    }

    @Override
    public void imprimirNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
