/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class EstudianteService {
    
    
    public static void crearEstudiante(Estudiante estu){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su nombre de estudiante");
        estu.setNombre(scan.next());
        System.out.println("Que edad tienes ? ");
        estu.setEdad(scan.nextInt());
        System.out.println("Cual es su nota media ?");
        estu.setNotaMedia(scan.nextDouble());
        
        
    }
    
    public static void mostrarAlumno(Estudiante estu){
        
        System.out.println(estu.toString());
    }
    
    public static void aprobo(Estudiante estu){
        
        if(estu.getNotaMedia() > 6.9 ){
            System.out.println("El estudiante aprobo");
        }else{
            System.out.println("El estudiante no aprobo");
        }
    }
}
