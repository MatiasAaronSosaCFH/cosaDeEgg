/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *2
 * @author 54117
 */
public class PersonaService {
    
    private static Scanner leerService = new Scanner(System.in).useDelimiter("\n");
    
    public static void crearPersona(Persona persona){
        int dia,mes,anio;
        System.out.println("Cual es su nombre");
        persona.setNombre(leerService.next());
        System.out.println("Ingrese el año de su nacimiento");
        anio = leerService.nextInt();
        System.out.println("Ingrese el mes de su nacimiento(numero)");
        mes = leerService.nextInt();
        System.out.println("Ingrese el dia de su nacimiento(numero)");
        dia = leerService.nextInt();
        
        Date fechas = new Date(anio-1900,mes-1,dia);
        
        persona.setFechaNacimiento(fechas);
    }
    
    public static void calcularEdad(Persona persona) {
        Date f1 = new Date();
        Date fnew = new Date(persona.getFechaNacimiento().getYear()-f1.getYear()-1900,persona.getFechaNacimiento().getMonth()-f1.getMonth(),persona.getFechaNacimiento().getDay()-f1.getDay());
        System.out.println(fnew);
    }
    
    public static void menorQue(Persona persona, Date edad){
        
        if(persona.getFechaNacimiento().before(edad)){
            System.out.println("La persona es mayor");
        }else {
            System.out.println("La persona es menor");
        }
        
    }
    
    public static void mostrarPersona(Persona persona){
        
        System.out.println(persona.toString());
    }
}
