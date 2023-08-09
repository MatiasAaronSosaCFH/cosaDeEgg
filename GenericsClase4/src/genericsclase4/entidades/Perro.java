/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericsclase4.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Perro extends Animal{
    
    private Integer Id;
    private String raza;
    @OneToOne
    private Persona dueño;

    public Perro() {
    }

    public Perro(String raza, Persona dueño, String nombre, Integer edad) {
        super(nombre, edad);
        this.raza = raza;
        this.dueño = dueño;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }
    
    
}
