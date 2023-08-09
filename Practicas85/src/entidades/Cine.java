/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Cine {
    
    private Pelicula peli;
    private Double precioEntrada;
    private Sala sala;

    public Cine() {
    }

    public Cine(Pelicula peli, Double precioEntrada, Sala sala) {
        this.peli = peli;
        this.precioEntrada = precioEntrada;
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "peli = " + peli + "\n"
                +"precioEntrada = " + precioEntrada +"\n"
                +"sala = " + sala + '}';
    }
}
