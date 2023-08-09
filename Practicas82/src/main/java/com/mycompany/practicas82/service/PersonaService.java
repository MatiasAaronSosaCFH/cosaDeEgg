/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas82.service;

import com.mycompany.practicas82.entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class PersonaService {
    
    private static  Scanner leerServicePersona = new Scanner(System.in).useDelimiter("\n");
    
    public static void cargarNotas(Persona personaUno){
        
        System.out.println("Cuantas notas tienes ?");
        
        int cantNot = leerServicePersona.nextInt();
        
        int[] notas = new int[cantNot];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota n°" + (i+1));
            notas[i] = leerServicePersona.nextInt();
        }
        
        personaUno.setNotas(notas);
    }
    
    public static Persona crearPersona(){
        Persona personaUno = new Persona();
        
        System.out.println("Cual es tu nombre ?");
        personaUno.setNombre(leerServicePersona.next());
        System.out.println("Que edad tenes ?");
        personaUno.setEdad(leerServicePersona.nextInt());
        System.out.println("Ingresa tu dni");
        personaUno.setDni(leerServicePersona.nextLong());
        cargarNotas(personaUno);
        
        return personaUno;
    }
    
    public static void esMayor(Persona personaUno){
        
        if(personaUno.getEdad()>17){
            System.out.println("Es mayor, puede manejar");
        }else{
            System.out.println("No es mayor, no puede manejar");
        }
        
    }
    
    
    public static void dniMayor(Persona personaUno){
        
        if(personaUno.getDni() > 40000000){
            System.out.println("Su edad es menor a 30 ");
        }else{
            System.out.println("Su edad es mayor a 30");
        }
    }
}
