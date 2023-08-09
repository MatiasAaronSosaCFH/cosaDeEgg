/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Perro;
import entidades.Persona;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class PersonaAdoptaService {
    
    public static Persona crearPersona(){
        Persona personaUno = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es tu nombre ?");
        personaUno.setNombre(leer.next());
        System.out.println("Cual es tu apellido ?");
        personaUno.setApellido(leer.next());
        System.out.println("Que edad tenes ?");
        personaUno.setEdad(leer.nextInt());
        System.out.println("Ingrese su dni:");
        personaUno.setDni(leer.nextLong());
        
        return personaUno;
    }
    
    
    public static Perro crearPerro(){
        Perro perrin = new Perro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Como es el nombre de el perro ?");
        perrin.setNombre(leer.next());
        System.out.println("Que edad tiene el perro ?");
        perrin.setEdad(leer.nextInt());
        System.out.println("A que raza pertenece el perro ?");
        perrin.setRaza(leer.next());
        System.out.println("De que tamaño es el perro ? (pequeño/mediano/grande)");
        perrin.setTamaño(leer.next());
        
        return perrin;
    }
    
    public static void adoptarPerro(Persona personaUno, Perro perrin){
        personaUno.setPerro(perrin);
    }
    
    public static void veterinaria(Persona[] personas, Perro[] perros){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont = 1;
        for(Persona personaUno : personas){
            System.out.println(personaUno.getNombre() + " Que perro te gustaria adoptar ?");
            System.out.println("1. " + perros[0] + "\n2. " + perros[1] + "\n3. " + perros[2]);
            System.out.println("Podes Elegir del primera al tercero con numero (1,2,3)");
            int resp = leer.nextInt();
            if(resp>3 && resp<1){
                System.out.println("Respuesta no valida, se termina el programa");
                break;
            }
            
            adoptarPerro(personaUno, perros[resp-1]);
            perros[resp-1] = null;
        }
    }
}
