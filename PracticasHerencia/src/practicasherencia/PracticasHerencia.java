/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasherencia;

import entidades.Estudiante;
import entidades.Persona;
import entidades.Profesor;
import entidades.Trabajador;

/**
 *
 * @author 54117
 */
public class PracticasHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona personita = new Persona("Facu", 24, 235248342) {};
        Estudiante estudiantito = new Estudiante(5, "SanMartin","Matias",26,407823749);
        Trabajador trabajadorsito = new Trabajador(150.000, 13, "Matias",30,12365612);
        Profesor profer = new Profesor();
        
        System.out.println("La persona...");
        personita.trabajar();
        System.out.println("El profesor..");
        profer.trabajar();
        System.out.println("El trabajador..");
        trabajadorsito.trabajar();
        System.out.println("El estudiante...");
        estudiantito.trabajar();
        
    }
    
}
