/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas85;

import entidades.Cine;
import static services.CineService.*;

/**
 *
 * @author 54117
 */
public class Practicas85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cine cine = crearCine();
        busquedaAsiento(cine);
        
        imprimirMatriz(cine);
    }
    
}
