/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class Ahorcado {

    private String[] palabra;
    private int letrasEncontradas;
    private int jugadas;

    public Ahorcado() {
        letrasEncontradas = 0;
    }

    public Ahorcado(String[] palabra, int jugadas) {
        this.palabra = palabra;
        this.jugadas = jugadas;
        letrasEncontradas = 0;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado: " + "palabra=" + Arrays.toString(palabra)
                + "\n" + ", letrasEncontradas=" + letrasEncontradas
                + "\n" + ", jugadas=" + jugadas + '}';
    }

}
