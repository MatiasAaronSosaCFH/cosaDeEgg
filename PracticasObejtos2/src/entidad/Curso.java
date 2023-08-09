/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class Curso {
    
    private String nombre;
    private double duracion;
    private String[] alumnos;
    
    public Curso(){
        alumnos = new String[1];
    }
    
    public Curso(String nombre, double duracion, String[] alumnos){
        this.nombre = nombre;
        this.duracion = duracion;
        this.alumnos = alumnos;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", duracion=" + duracion + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
    
    
}
