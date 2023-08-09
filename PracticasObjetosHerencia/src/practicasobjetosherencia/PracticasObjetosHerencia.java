/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasobjetosherencia;

import entidades.Estudiante;
import entidades.Persona;
import entidades.Trabajador;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author 54117
 */
public class PracticasObjetosHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Persona cliente = new Persona() {
//             @Override
//             public void imprimirNombre() {
//                 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//             }
//        };
//        
//        Estudiante mauri = new Estudiante("SanMartin", 10, "Matias", 26, 40872368);
//        Trabajador lucas = new Trabajador();
//        
//        System.out.println(mauri);

        
        String nombre = "matias";
        LocalDate dia = LocalDate.now();
        LocalDate dia2 = LocalDate.of(2023,11,22);
        System.out.println(dia);
        System.out.println(dia2.lengthOfMonth());
        Date diasss = new Date();
       
    }
    
}
