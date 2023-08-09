/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos.herencia.dos;

import entidades.Estudiante;
import static entidades.Estudiante.comparador;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import services.EstudianteService;

/**
 *
 */

public class ObjetosHerenciaDos {

    /**
     * 
     */
    public static void main(String[] args) {
        
        
        //Ejemplo de herencias
        EstudianteService nuevo = new EstudianteService();
        System.out.println("Instanciando primer estudiante");
        Estudiante estu = nuevo.crearEstudiante();
        System.out.println("Instanciando segundo estudiante");
        Estudiante estuDos = nuevo.crearEstudiante();
       
        estu.charla(estuDos);
        
        nuevo.evaluarEstudiante(estu);
        
        
        
        //Ejemplo de relaciones 
        ArrayList<Estudiante> listita = new ArrayList();
        listita.add(estu);
        listita.add(estuDos);
        
        System.out.println(listita);
        //Comparator se relacion indirectamente con estudiante, siendo una clase anonima
        //creada para estudiante
        Collections.sort(listita,comparador);
        
        System.out.println(listita);
    }
    
}
