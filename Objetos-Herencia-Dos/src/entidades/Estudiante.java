/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author 54117
 */
public class Estudiante extends Persona{
    
    private int nota;
    private int asistencias;

    public Estudiante() {
    }

    public Estudiante(int nota, int asistencias, String nombre, int edad, int dni) {
        super(nombre, edad, dni);
        this.nota = nota;
        this.asistencias = asistencias;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nota=" + nota + ", asistencias=" + asistencias + '}';
    }
    
    @Override
    public void comer(){
        System.out.println("Merendar....");
    }
    
    public void charla(Estudiante estu){
        System.out.println("Hola " + estu.getNombre() + " como estas ?");
    }

    @Override
    public void hacer(Estudiante estu) {
        System.out.println(this.nota + " es diferente de " + estu.getNota());
    }

    @Override
    public void hacer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //Declaramos el comparator, siendo que comparator es una interface y no puede instanciarse, creamos
    // una clase anonima (un tipo de clase interna) para poder instanciar un comparator y utilizarlo como
    // objeto en el orden de una lista, por su metodo de comparacion
    
    public static Comparator<Estudiante> comparador = new Comparator<Estudiante>(){
        
        @Override
        public int compare(Estudiante estUno, Estudiante estDos){
            return estUno.getNombre().compareTo(estDos.getNombre());
        }
    };
}
