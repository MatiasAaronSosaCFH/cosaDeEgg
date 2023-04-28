/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas51;

import entidad.Puntos;
import static entidad.Puntos.crearPuntos;
import static entidad.Puntos.distanciaPuntos;

/**
 *
 * @author 54117
 */
public class Practicas51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puntos puntos = new Puntos();
        
        crearPuntos(puntos);
        distanciaPuntos(puntos);
        
    }
    
}
