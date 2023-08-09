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
public  class Barco {
    
    private String matricula;
    private int eslora;
    private LocalDate anhoDeFabricacion;

    //public abstract void arrancaMotor(String ruido);
    
    public Barco() {
        System.out.println("Generando barco...");
    }

    public Barco(String matricula, int eslora, LocalDate anhoDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhoDeFabricacion = anhoDeFabricacion;
        System.out.println("Generando barco...");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnhoDeFabricacion() {
        return anhoDeFabricacion;
    }

    public void setAnhoDeFabricacion(LocalDate anhoDeFabricacion) {
        this.anhoDeFabricacion = anhoDeFabricacion;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora + ", anhoDeFabricacion=" + anhoDeFabricacion + '}';
    }
    
    
}
