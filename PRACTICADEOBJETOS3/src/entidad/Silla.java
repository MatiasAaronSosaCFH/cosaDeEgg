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
public class Silla {
    
    private String color;
    private int patas;
    private boolean barnisada;
    private boolean deMadera;

    public Silla() {
    }

    public Silla(String color, int patas, boolean barnisada, boolean deMadera) {
        this.color = color;
        this.patas = patas;
        this.barnisada = barnisada;
        this.deMadera = deMadera;
    }

    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isBarnisada() {
        return barnisada;
    }

    public void setBarnisada(boolean barnisada) {
        this.barnisada = barnisada;
    }

    public boolean isDeMadera() {
        return deMadera;
    }

    public void setDeMadera(boolean deMadera) {
        this.deMadera = deMadera;
    }

    @Override
    public String toString() {
        return "Silla{" + "color=" + color + ", patas=" + patas + ", barnisada=" + barnisada + ", deMadera=" + deMadera + '}';
    }
    
    public static Comparator<Silla> compararSillas = new Comparator<Silla>(){
        
        @Override
        public int compare(Silla sillaUno, Silla sillaDos){
               return sillaUno.getColor().compareTo(sillaDos.getColor());
           }
        };
    
    
}
