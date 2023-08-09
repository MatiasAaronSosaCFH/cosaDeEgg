/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Mesa {
    
    private String color;
    private int patas;
    private boolean barnisada;
    private double alto;
    private double peso;
    
    public Mesa(){}
    
    public Mesa(String color, int patas, boolean barnisada, double alto, double peso){
        this.alto = alto;
        this.peso = peso;
        this.patas = patas;
        this.color = color;
        this.barnisada = barnisada;
    }
    
    public String getColor (){
        return color;
    }
    
    public void setColor(String color){
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

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mesa{" + "color=" + color + ", patas=" + patas + ", barnisada=" + barnisada + ", alto=" + alto + ", peso=" + peso + '}';
    }
    
    
}
