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
    
    private Integer edad;
    private String nombre;
    private Long dni;
    private String apellido;
    private Perro perro;

    public Persona() {
    }

    public Persona(Integer edad, String nombre, Long dni, String apellido, Perro perro) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.perro = perro;
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + ", apellido=" + apellido + ", perro=" + perro + '}';
    }

    
    
}
