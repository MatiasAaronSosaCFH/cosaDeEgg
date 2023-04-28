/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class PersonaService {
    
    private static final Scanner leerPersonaService = new Scanner(System.in).useDelimiter("\n");
    
    public static boolean esMayorDeEdad(Persona persona1){
        
        boolean esMayor = false;
        
        if(persona1.getEdad() > 17){
            esMayor = true;
        }
        
        return esMayor;
    }
    
    public static void crearPersona(Persona persona1){
        
        System.out.println("Cual es tu nombre ?");
        persona1.setNombre(leerPersonaService.next());
        System.out.println("Cual es tu persona ?");
        persona1.setEdad(leerPersonaService.nextInt());
        System.out.println("Cual es tu peso ? ");
        persona1.setPeso(leerPersonaService.nextDouble());
        System.out.println("Cuel es tu altura ?");
        persona1.setAltura(leerPersonaService.nextDouble());
        boolean salir = false;
        
        do {            
            
            System.out.println("Cual es tu sexo ? (h-m-o)");
            persona1.setSexo(leerPersonaService.next());
            
            if(!persona1.getSexo().equalsIgnoreCase("m") || !persona1.getSexo().equalsIgnoreCase("h") || !persona1.getSexo().equalsIgnoreCase("o")) {
                System.out.println("El valor deve ser = 'h' 'm' 'o' ");  
            }
        } while (salir);
    }
    
}
