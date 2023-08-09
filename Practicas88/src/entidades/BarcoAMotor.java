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
public class BarcoAMotor extends Barco{
    
    private int potCv;
    
    public BarcoAMotor() {
    }

    public BarcoAMotor(int potCv, String matricula, int eslora, LocalDate anhoDeFabricacion) {
        super(matricula, eslora, anhoDeFabricacion);
        this.potCv = potCv;
        System.out.println("Transformando a barco a motor...");
    }

    public int getPotCv() {
        return potCv;
    }

    public void setPotCv(int potCv) {
        this.potCv = potCv;
    }

    @Override
    public void setAnhoDeFabricacion(LocalDate anhoDeFabricacion) {
        super.setAnhoDeFabricacion(anhoDeFabricacion);
    }

    @Override
    public LocalDate getAnhoDeFabricacion() {
        return super.getAnhoDeFabricacion();
    }

    @Override
    public void setEslora(int eslora) {
        super.setEslora(eslora);
    }

    @Override
    public int getEslora() {
        return super.getEslora();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    
    @Override
    public String toString() {
        return "BarcoAMotor{" + "potCv=" + potCv + " " + super.toString();
    }

//    @Override
//    public void arrancaMotor(String ruido){
//        System.out.println(ruido);
//    }
    
    
}
