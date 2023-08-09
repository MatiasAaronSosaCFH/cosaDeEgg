/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Estudiante extends Persona{
    
    private int libros;
    private String escuela;

    public Estudiante() {
    }

    public Estudiante(int libros, String escuela, String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.libros = libros;
        this.escuela = escuela;
    }

    @Override
    public void trabajar(){
        System.out.println("Leyendo libro....");
    }
    
    public Integer getLibros() {
        return libros;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "libros = " + libros + ", escuela = " + escuela + 
                "\n" + "nombre = " + super.nombre + "edad = " + super.edad + 
                "\n" + "dni = " + super.dni+'}';
    }
    
    
    
}
