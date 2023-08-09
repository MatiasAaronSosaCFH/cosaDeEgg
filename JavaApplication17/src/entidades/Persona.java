/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Persona {
    
    private int[] edad = new int[2];
    private String nombre;
    private int dni;

    public Persona() {
    }

    public Persona(int[] edad, String nombre, int dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int[] getEdad() {
        int[] numeros = new int[edad.length];
        
        for (int i = 0; i < edad.length; i++) {
            int aux = edad[i];
            numeros[i] = aux;
        }
        return numeros;
    }

    public void setEdad(int[] edad) {
       this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
