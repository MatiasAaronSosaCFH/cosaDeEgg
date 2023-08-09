/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Coche;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class CocheService {
    
    public static void ingresarCoche(Coche coche){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cual es la marca de tu coche ? ");
        coche.setMarca(leer.next());
        System.out.println("Cual es el modelo de tu coche ?");
        coche.setModelo(leer.next());
        System.out.println("Cual es el precio actual de tu coche ?");
        coche.setPrecio(leer.nextDouble());
        
        
    }
    
    public static void mostrarCoche(Coche coche){
        
        System.out.println(coche.toString());
    }
}
