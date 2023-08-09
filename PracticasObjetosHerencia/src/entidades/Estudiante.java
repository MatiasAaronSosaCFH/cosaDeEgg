/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfacesHerenciaObjetos.Matematica;

/**
 *
 * @author 54117
 */
public class Estudiante extends Persona implements Matematica{
    
    private String escuela;
    private int nota;
    
    public Estudiante() {
    }

    public Estudiante(String escuela, int nota, String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.escuela = escuela;
        this.nota = nota;
        System.out.println("Creando estudiante");
    }

    @Override
    public void comer(){
        System.out.println("Desayuna");
    }
    
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "escuela = " + escuela + ", nota = " + nota + this.nombre +'}';
    }

    @Override
    public void imprimirNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcular() {
         
    }

    @Override
    public void multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
