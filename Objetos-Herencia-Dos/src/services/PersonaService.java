/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Persona;
import java.util.Scanner;

public class PersonaService {
    
    public Persona crearPersona(Persona persona){
        
        Scanner leerPersona = new Scanner(System.in).useDelimiter("\n");
        Persona perUno = persona;
        
        System.out.println("Cual es el nombre de esta persona?");
        perUno.setNombre(leerPersona.next());
        System.out.println("Cual es la edad de esta persona ?");
        perUno.setEdad(leerPersona.nextInt());
        System.out.println("Ingrese el dni ");
        perUno.setDni(leerPersona.nextInt());
        
        return perUno;
    }
    
}
