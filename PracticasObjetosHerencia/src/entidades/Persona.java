/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public abstract class Persona {
    
    protected String nombre;
    protected int edad;
    protected int dni;

    public Persona() {
    }

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        System.out.println("Creando persona");
    }

    public void comer(){
        System.out.println("Comiendo comida");
    }
    
    public String getNombre() {
        return nombre;
    }
    /**
     * Este metodo setea el nombre de mi objeto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }
    
    public abstract void imprimirNombre();
    
}
