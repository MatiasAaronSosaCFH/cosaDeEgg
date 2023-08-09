/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas63;

import entidad.Curso;
import static service.CursoService.*;

/**
 *
 * @author 54117
 */
public class Practicas63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso primeroA = new Curso();
        
        crearCurso(primeroA);
        
        calcularGananciaSemanal(primeroA);
        
    }
    
}
