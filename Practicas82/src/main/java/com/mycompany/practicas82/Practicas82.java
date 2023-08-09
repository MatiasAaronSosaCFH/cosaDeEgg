/*
 */

package com.mycompany.practicas82;

import com.mycompany.practicas82.entidad.Persona;
import static com.mycompany.practicas82.service.PersonaService.*;

/**
 *
 * @author 54117
 */
public class Practicas82 {

    public static void main(String[] args) {
        
        Persona matias = crearPersona();
        
        esMayor(matias);
        dniMayor(matias);
        
        System.out.println(matias);
    }
}
