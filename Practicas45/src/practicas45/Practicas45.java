/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas45;

import static entidad.Operaciones.suma;
import entidad.Rectangulo;
import static entidad.Rectangulo.crearRectangulo;
/**
 *
 * @author 54117
 */
public class Practicas45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rec = new Rectangulo();
        
        rec = rec.crearRectangulo();
        
        System.out.println(rec.toString());
        
        rec.dibujarRectangulo();
        
        System.out.println("El perimetro es = " + rec.calcularPerimetro());
        System.out.println("La superficie es = " + rec.calcularSuperficie());
        
        
    }
    
}
