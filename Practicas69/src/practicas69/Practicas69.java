/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas69;

import entidad.Ahorcado;
import static service.AhorcadoService.*;

public class Practicas69 {

    public static void main(String[] args) {
        
        Ahorcado juego = new Ahorcado();
        Ahorcado[] jueguito = new Ahorcado[3];
        juego(juego);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(jueguito[i].toString());
        }
        
    }
    
}
