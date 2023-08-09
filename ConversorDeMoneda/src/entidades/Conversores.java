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
public class Conversores{
    
    private static Integer posicionIndex = 0;
    private Double cambio;
    private Integer posicion;
    private String nombreDivisa;

    public Conversores() {
    }

    public Conversores(Double cambio, String nombreDivisa) {
        this.cambio = cambio;
        this.posicion = posicionIndex;
        this.nombreDivisa = nombreDivisa;
        posicionIndex++;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public void setNombreDivisa(String nombreDivisa) {
        this.nombreDivisa = nombreDivisa;
    }

    @Override
    public String toString() {
        return "Conversores{" + "cambio=" + cambio + ", posicion=" + posicion + ", nombreDivisa=" + nombreDivisa + '}';
    }
    
    public static Comparator<Conversores> comparaPosiciones = new Comparator<Conversores>(){
        @Override
        public int compare(Conversores converUno, Conversores converDos){
            return converUno.getPosicion().compareTo(converDos.getPosicion());
        }
    };
}
