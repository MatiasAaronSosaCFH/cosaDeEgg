/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas58;

import entidad.NIF;
import java.util.ArrayList;
import static service.NIFService.*;
import service.NIFService;

/**
 *
 * @author 54117
 */
public class Practicas58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIF nif = new NIF();
        String[] palabras = new String[4];
        
        NIFService nif2 = new NIFService();
        
        rellenarLista(palabras);
        
      }
    
}
