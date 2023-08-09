/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Empleado {
    
    private static int idGeneral = 1;
    private String nombre;
    private int id;
    
    public Empleado() {
        id = idGeneral;
        idGeneral++;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        id = idGeneral;
        idGeneral++;
    }

    public static int getIdGeneral(){
        return idGeneral;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    
    
    
}
