/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Alumno extends Persona{
    
    public int nota;
    public String escuela;
    public boolean guardaPolvo;

    @Override
    public double multiplicar(int num) {
        return super.multiplicar(num); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + ", escuela=" + escuela + ", guardaPolvo=" + guardaPolvo + '}';
    }
    
    
}
