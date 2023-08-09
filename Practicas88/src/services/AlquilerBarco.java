/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Barco;
import interfaces.CalcularAlquiler;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class AlquilerBarco{
    
    public Barco crearBarco(){
        Barco barquito = new Barco();
        Scanner leerAlquilerBarco = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cual es el numero de matricula del barco ?");
        barquito.setMatricula(leerAlquilerBarco.next());
        
        System.out.println("Cuanto es el diametro de la eslora en metros ?");
        barquito.setEslora(leerAlquilerBarco.nextInt());
        
        System.out.println("Ingrese el año de fabricacion de el barco");
        int anhoDeFabricacion = leerAlquilerBarco.nextInt();
        System.out.println("ahora ingrese el mes (en numeros : eje 12'diciembre' o 4'abril')");
        int mesDeFabricacion = leerAlquilerBarco.nextInt();
        System.out.println("ahora ingrese el dia (con el mismo formato que el mes en numeros)");
        int diaDeFabricacion = leerAlquilerBarco.nextInt();
        barquito.setAnhoDeFabricacion(LocalDate.of(diaDeFabricacion,mesDeFabricacion,anhoDeFabricacion));
        
        return barquito;
    }
    
}
