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
public class Velero extends Barco{
    
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, int eslora, LocalDate anhoDeFabricacion) {
        super(matricula, eslora, anhoDeFabricacion);
        this.mastiles = mastiles;
        System.out.println("Transformando a velero...");
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + " " + super.toString();
    }

//    @Override
//    public void arrancaMotor(String ruido) {
//        System.out.println(ruido);
//    }
    
    
}
