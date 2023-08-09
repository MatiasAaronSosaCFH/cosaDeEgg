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
    private int letras;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantJugadas) {
        this.palabra = palabra;
        this.cantJugadas = cantJugadas;
        this.letras = palabra.length;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", letras=" + letras + ", cantJugadas=" + cantJugadas + '}';
    }
}
