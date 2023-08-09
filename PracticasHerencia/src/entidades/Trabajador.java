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
    
    private double salario;
    private int id;

    public Trabajador() {
    }

    public Trabajador(double salario, int id, String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.salario = salario;
        this.id = id;
    }

    @Override
    public void trabajar(){
        System.out.println("Picando cemento....");
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "salario=" + salario + ", id=" + id  + 
                "\n" + "nombre = " + super.nombre + "edad = " + super.edad + 
                "\n" + "dni = " + super.dni+'}';
    }
    
    
    
}
