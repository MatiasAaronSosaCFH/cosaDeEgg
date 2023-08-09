/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoAMotor;
import entidades.YateDeLujo;
import interfaces.CalcularAlquiler;

import java.util.Scanner;
/**
 *
 * @author 54117
 */
public class AlquilerYateDeLujo extends AlquilerBarcoAMotor implements CalcularAlquiler<Alquiler, BarcoAMotor>{
    
    public YateDeLujo crearYateDeLujo(){
        YateDeLujo yatesito = new YateDeLujo();
        BarcoAMotor barquito = super.crearBarcoAMotor();
        yatesito.setAnhoDeFabricacion(barquito.getAnhoDeFabricacion());
        yatesito.setEslora(barquito.getEslora());
        yatesito.setMatricula(barquito.getMatricula());
        yatesito.setPotCv(barquito.getPotCv());
        
        System.out.println("Mejorando a yate de lujo...");
        Scanner leerAlquilerYateDeLujo = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos camarotes tiene el yate ?");
        yatesito.setCamarotes(leerAlquilerYateDeLujo.nextInt());
        
        
        return yatesito;
    }
    
    @Override
    public double calcularAlquiler(Alquiler t, BarcoAMotor e) {
        YateDeLujo yatesito = new YateDeLujo();
        if(e instanceof YateDeLujo){
            yatesito = (YateDeLujo) e;
        }
        
        long diasOcupado = (t.getFechaDeAlquiler().toEpochDay()-t.getFechaDeDevolucion().toEpochDay());
        double valorModulo = (yatesito.getEslora()*10);
        double potenciaCv = yatesito.getPotCv();
        double camarotes = yatesito.getCamarotes();
        double valorAlquiler = diasOcupado*valorModulo+potenciaCv+camarotes;
        return valorAlquiler;
    }
}
