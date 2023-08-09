/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicas80;

import entidad.Alumno;
import entidad.Persona;

/**
 *
 * @author 54117
 */
public class Practicas80 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Alumno alumno1 = new Alumno();
        
        persona1.nombre = "Matias";
        alumno1.nombre = "Facu";
        System.out.println(persona1.multiplicar(10));
        System.out.println(alumno1.multiplicar(10));
    }
}
