/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class Sala {
    
    private Asiento[][] butacas = new Asiento[8][6];
    public Sala() {
    }

    public Sala(Asiento[][] butacas) {
        this.butacas = butacas;
    }

    public Asiento[][] getButacas() {
        return butacas;
    }

    public void setButacas(Asiento[][] butacas) {
        this.butacas = butacas;
    }

    @Override
    public String toString() {
        return "Sala{" + "butacas=" + Arrays.toString(butacas) + '}';
    }
    
    
}
