/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericsclase3;

import interfaces.Utilidad;
import java.util.ArrayList;

/**
 *
 * @author 54117
 */
public class Perro<T> implements Utilidad<String>{

    private String nombre;
    private Integer edad;
    private T juguete;
            
    @Override
    public boolean comparar(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList agregar(String t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public T getJuguete() {
        return juguete;
    }

    public void setJuguete(T juguete) {
        this.juguete = juguete;
    }
    
}
