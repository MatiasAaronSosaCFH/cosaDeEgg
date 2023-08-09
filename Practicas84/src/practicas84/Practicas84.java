/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas84;

import entidades.Perro;
import entidades.Persona;
import java.util.Arrays;
import static services.PersonaAdoptaService.*;

/*

*/
public class Practicas84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona sebastian = crearPersona();
        Persona sandra = crearPersona();
        Persona matias = crearPersona();
        
        Perro blas = crearPerro();
        Perro cristina = crearPerro();
        Perro venty = crearPerro();
        
        Persona[] personas = {sebastian,sandra,matias};
        Perro[] perros = {blas,cristina,venty};
        
        System.out.println("1. " + personas[0] + "\n2. " + personas[1] + "\n3. " + personas[2]);
        
        veterinaria(personas, perros);
        
        System.out.println("1. " + personas[0] + "\n2. " + personas[1] + "\n3. " + personas[2]);
    }
    
}
