/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas89colecciones;

import entidadeas.Persona;
import static entidadeas.Persona.compararEdad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author 54117
 */
public class Practicas89Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Persona> personas = new ArrayList();
        
        
        Persona matias = new Persona(50,"Matias",10000.50);
        Persona mercedez = new Persona(26,"Mercedes",3000.50);
        Persona julian = new Persona(15,"Julian",300000.50);
        
//        System.out.println(personas);
//        
//        Collections.sort(personas, compararEdad);
//        
//        System.out.println(personas);
        
        int finali = compararEdad.compare(julian, julian);
        int semiss = compararEdad.compare(matias, mercedez);
        int csi = compararEdad.compare(julian, mercedez);
        
        System.out.println(finali);
        System.out.println(csi);
        System.out.println(semiss);
    }
    
}
