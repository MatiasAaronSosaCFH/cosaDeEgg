/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Estudiante;
import entidades.Persona;
import interfaces.HacerCosas;
import java.util.Scanner;


/**
 *
 * @author 54117
 */
public class EstudianteService extends PersonaService {
    
    public Estudiante crearEstudiante(){
        
        Scanner leerEstudiante = new Scanner(System.in).useDelimiter("\n");
        
        Estudiante nuevo =(Estudiante) crearPersona(new Estudiante());
        
        System.out.println("Ingrese la nota del estudiante");
        nuevo.setNota(leerEstudiante.nextInt());
        System.out.println("Cuantas asistencias tiene el estudiante ?");
        nuevo.setAsistencias(leerEstudiante.nextInt());
        
        return nuevo;
    }
    
    public void evaluarEstudiante(Estudiante estu){
        
        estu.setNota((estu.getAsistencias()/3));
        
        System.out.println("La nueva nota de el estudiante " + estu.getNombre() + " es " + estu.getNota());
    }
    
}
