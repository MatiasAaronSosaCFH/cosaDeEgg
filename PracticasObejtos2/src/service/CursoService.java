/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class CursoService {
    
    public static Curso crearCurso(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Curso cursote = new Curso();
        System.out.println("Ingrese el nombre del curso");
        cursote.setNombre(leer.next());
        
        return cursote;
    }
}
