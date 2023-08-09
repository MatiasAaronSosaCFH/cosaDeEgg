/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Asiento {
    
    private Espectador espectador;
    private Boolean ocupado = false;
    private String nombreAsiento;

    public Asiento() {
        this.ocupado = false;
    }
    
    public Asiento(String nombreAsiento) {
        this.ocupado = false;
        this.nombreAsiento = nombreAsiento;
    }


    public Asiento(Espectador espectador, String nombreAsiento) {
        this.espectador = espectador;
        this.ocupado = true;
        this.nombreAsiento = nombreAsiento + "X";
    }

    public String getNombreAsiento() {
        return nombreAsiento;
    }

    public void setNombreAsiento(String nombreAsiento) {
        this.nombreAsiento = nombreAsiento;
    }

    
    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "espectador = " + espectador + "\n"
                +"ocupado=" + ocupado + '}';
    }
    
    
    
}
