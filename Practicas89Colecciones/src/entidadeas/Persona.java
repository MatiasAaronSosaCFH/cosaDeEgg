/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadeas;

import java.util.Comparator;

/**
 *
 * @author 54117
 */
public class Persona {
    
    private Integer edad;
    private String nombre;
    private Double sueldo;

    public Persona() {
    }

    public Persona(Integer edad, String nombre, Double sueldo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    /**
     Este Metodo retorna una cadena de caracteres con todas las propiedades de este objeto
     */
    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    public static Comparator<Persona> compararEdad = new Comparator<Persona>() {
        @Override
        public int compare(Persona peliUno, Persona peliDos) {
            return peliUno.getEdad().compareTo(peliDos.getEdad());
        }
    };
    
    Comparator comparador  = new Comparator() {
        @Override
        public int compare(Object t, Object t1) {
            return 1;
        }
    };
    
    
}

