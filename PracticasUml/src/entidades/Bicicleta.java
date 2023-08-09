/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Bicicleta {
    
    private int largo;
    private String color;

    public Bicicleta() {
    }

    public Bicicleta(int largo, String color) {
        this.largo = largo;
        this.color = color;
    }

    
    
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "largo=" + largo + ", color=" + color + '}';
    }
    
    
    
}
