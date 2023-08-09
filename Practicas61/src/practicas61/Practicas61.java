/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas61;

import entidad.Cadena;
import static service.CadenaService.*;

public class Practicas61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Cadena cadena = new Cadena("Las rosas son rojas y las violetas azules");
        
        mostrarVocales(cadena);
        invertirFrase(cadena);
    }
    
}
