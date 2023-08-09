/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author 54117
 */
public class Alumno{
    
    private String nombreCompleto;
    private Long dni;
    private int cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Long dni, int cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cantidadDeVotos=" + cantidadDeVotos + '}';
    }
    
    
}
