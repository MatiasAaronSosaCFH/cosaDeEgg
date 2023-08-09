/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author 54117
 */
public class Alquiler {
    
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionXAmarre, posicionYAmarre;
    private Amarre amarre = new Amarre();
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int dniCliente, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int psocionX, int posicionY, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionXAmarre = psocionX;
        this.posicionYAmarre = posicionY;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPsocionX() {
        return posicionXAmarre;
    }

    public void setPsocionX(int psocionX) {
        this.posicionXAmarre = psocionX;
    }

    public int getPosicionY() {
        return posicionYAmarre;
    }

    public void setPosicionY(int posicionY) {
        this.posicionYAmarre = posicionY;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", psocionXAmarre=" + posicionXAmarre + ", posicionYAmarre=" + posicionYAmarre + ", barco=" + barco + '}';
    }
}
