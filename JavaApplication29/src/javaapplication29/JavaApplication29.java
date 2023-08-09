/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

import javaapplication29.entidades.Libro;
import static javaapplication29.service.LibroService.crearLibro;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author 54117
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro = crearLibro();
    }
    
}
