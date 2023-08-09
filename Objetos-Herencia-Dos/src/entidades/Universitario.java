/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import interfaces.HacerCosas;

public class Universitario extends Estudiante implements HacerCosas{
    
    private String parcial;

    public Universitario() {
    }

    public Universitario(String parcial) {
        this.parcial = parcial;
    }

    public String getParcial() {
        return parcial;
    }

    public void setParcial(String parcial) {
        this.parcial = parcial;
    }

    @Override
    public void hacer(Estudiante estu) {
        System.out.println(estu.getNota());
    }
}
