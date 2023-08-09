/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Alumno;
import java.util.HashSet;

/**
 *
 * @author 54117
 */
public class Voto {
    
    private Alumno[] alumnosVotados = new Alumno[3];
    private Alumno alumnoVotante;

    public Voto() {
    }

    public Voto(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public Alumno[] getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(Alumno[] alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnosVotados=" + alumnosVotados + ", alumnoVotante=" + alumnoVotante + '}';
    }
    
    
}
