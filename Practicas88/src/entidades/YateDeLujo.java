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
public class YateDeLujo extends BarcoAMotor{
    
    private int camarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int camarotes, int potCv, String matricula, int eslora, LocalDate anhoDeFabricacion) {
        super(potCv, matricula, eslora, anhoDeFabricacion);
        this.camarotes = camarotes;
        System.out.println("Mejorando barco a yate de lujo...");
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "YatesDeLujo{" + "camarotes=" + camarotes + " Matricula = " + super.getMatricula() + " eslora = " + super.getEslora() + " año de fabricacion = " + super.getAnhoDeFabricacion().getYear() + " potencia en CV = " + super.getPotCv()+'}';
    }
}
