/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas74;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import static service.PeliculaService.*;

/**
 *
 * @author 54117
 */
public class Practicas74 {


    public static void main(String[] args) {
        
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        
        guardarPeliculas(peliculas);
        ordenarPeliculas(peliculas);
        
    }
    
}
