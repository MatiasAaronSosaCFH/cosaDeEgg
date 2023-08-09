/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Comparator;

/**
 *
 * @author 54117
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> comprarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peliUno, Pelicula peliDos) {
            return peliUno.getTitulo().compareTo(peliDos.getTitulo());
        }
    };

    public static Comparator<Pelicula> comprarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peliUno, Pelicula peliDos) {
            return peliUno.getDirector().compareTo(peliDos.getDirector());
        }
    };

    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peliUno, Pelicula peliDos) {
            return peliUno.getDuracion().compareTo(peliDos.getDuracion());
        }
    };
}
