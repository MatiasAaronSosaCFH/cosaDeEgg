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
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void cargarAlumnos(Curso curso){
        String[] alumnos = curso.getAlumnos();
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese nombre del alumno");
            alumnos[i] = leer.next();
        }
        curso.setAlumnos(alumnos);
    }
    
    public static void crearCurso(Curso curso){
        System.out.println("Cual es el nombre del curso ?");
        curso.setNombreCurso(leer.next());
        System.out.println("Cuantas horas por dia lleva el curso ?");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Cuantos dias a la semana conlleva el curso ?");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Que turno es ?");
        curso.setTurno(leer.next());
        System.out.println("Cuanto es el precio por hora del curso ?");
        curso.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(curso);
    }
    
    public static void calcularGananciaSemanal(Curso curso){
        
        double gananciaSemanal = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * 5;
        
        System.out.println("La ganancia  total semanal por este curso es: " + gananciaSemanal);
        
    }
}
