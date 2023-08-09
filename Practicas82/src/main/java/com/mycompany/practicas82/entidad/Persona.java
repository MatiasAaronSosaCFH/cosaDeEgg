/*
*/
package com.mycompany.practicas82.entidad;

import java.util.Arrays;
/*
*/
public class Persona {

    private String nombre;
    private int edad;
    private long dni;
    private int[] notas;

    public Persona() {
    }

    public Persona(String nombre, int edad, long dni, int[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.notas = notas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equalsIgnoreCase("caca")) {
            System.out.println("Inapropiado no se puede poner ese nombre");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + 
                "\n" + "nombre=" + nombre + 
                "\n" +", edad=" + edad +
                "\n" + "dni=" + dni + 
                "\n"+"notas="+ Arrays.toString(notas) +'}';
    }
}
