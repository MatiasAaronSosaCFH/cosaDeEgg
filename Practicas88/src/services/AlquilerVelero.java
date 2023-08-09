/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Alquiler;
import entidades.Barco;
import entidades.Velero;
import interfaces.CalcularAlquiler;
import java.util.Scanner;

/**cannot be inherited with diferent arguments
 *
 * @author 54117
 */
public class AlquilerVelero extends AlquilerBarco implements CalcularAlquiler<Alquiler,Velero>{
    
    public Velero crearVelero(){
        
        Velero velerito = new Velero();
        Barco barquito = super.crearBarco();
        velerito.setAnhoDeFabricacion(barquito.getAnhoDeFabricacion());
        velerito.setEslora(barquito.getEslora());
        velerito.setMatricula(barquito.getMatricula());
        System.out.println("Transformando a velero...");
        
        Scanner leerAlquilerVelero = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cuantos mastiles tiene el velero ?");
        velerito.setMastiles(leerAlquilerVelero.nextInt());
        
        return velerito;
    }
    
    @Override
    public double calcularAlquiler(Alquiler a,Velero v){
        long diasOcupado = (a.getFechaDeAlquiler().toEpochDay()-a.getFechaDeDevolucion().toEpochDay());
        double valorModulo = (v.getEslora()*10);
        double valorAlquiler = diasOcupado*valorModulo+v.getMastiles();
        return valorAlquiler;
    }
    
}
