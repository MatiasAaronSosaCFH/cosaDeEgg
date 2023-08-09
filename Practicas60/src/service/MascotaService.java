/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Mascota;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class MascotaService {
    
    //este metodo crea una mascota a travez de recibir informacion por consola
    public static void crearMascota(Mascota masco){
        
        Scanner scaneando = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cual es el nombre de tu mascota ?");
        masco.setNombre(scaneando.next());
        System.out.println("Que edad tiene tu mascota ? ");
        masco.setEdad(scaneando.nextInt());
        System.out.println("Que tipo de animal es ? (Perro-Gato-Hamster)");
        masco.setTipo(scaneando.next());
        System.out.println("Que raza es tu mascota ?");
        masco.setRaza(scaneando.next());
        
    }
    
    public static void mostrarMascota(Mascota masco){
        
        System.out.println(masco.toString());
    }
    
    public static void cumplirAnios(Mascota masco){
        
        masco.setEdad(masco.getEdad()+1);
    }
}
