/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoAMotor;
import interfaces.CalcularAlquiler;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class AlquilerBarcoAMotor extends AlquilerBarco implements CalcularAlquiler<Alquiler,BarcoAMotor>{

    public BarcoAMotor crearBarcoAMotor(){
        BarcoAMotor barquito = new BarcoAMotor();
        Barco barcoChiquito = super.crearBarco();
        System.out.println("Transformando a barco a motor...");
        barquito.setAnhoDeFabricacion(barcoChiquito.getAnhoDeFabricacion());
        barquito.setEslora(barcoChiquito.getEslora());
        barquito.setMatricula(barcoChiquito.getMatricula());
        
        Scanner leerBarcoAMotor = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es la potencia cv de este barco ?");
        barquito.setPotCv(leerBarcoAMotor.nextInt());
        
        return barquito;
    }
    @Override
    public double calcularAlquiler(Alquiler t, BarcoAMotor e) {
        long diasOcupado = (t.getFechaDeAlquiler().toEpochDay()-t.getFechaDeDevolucion().toEpochDay());
        double valorModulo = (e.getEslora()*10);
        double valorAlquiler = diasOcupado*valorModulo+e.getPotCv();
        return valorAlquiler;
    }
    
    
}
