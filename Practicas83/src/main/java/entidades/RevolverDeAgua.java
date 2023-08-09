/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        posicionActual = (int) Math.round(Math.random()*6 + 1);
        posicionAgua = (int) Math.round(Math.random()*6 + 1);
        System.out.println("Revolver Cargado");
    }
    
    public boolean mojar(){
        boolean mojar = false;
        
        if(posicionAgua == posicionActual) mojar = true;
        
        return mojar;
    }
    
    public void siguienteChorro(){
        
        if(posicionActual < 6){
            posicionActual = posicionActual + 1;
            System.out.println("clic!!!");
        }else{
            posicionActual = 1;
            System.out.println("clic!!");
        }
        
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + " posicionActual = " + posicionActual + ", posicionAgua = " + posicionAgua + '}';
    }
}
