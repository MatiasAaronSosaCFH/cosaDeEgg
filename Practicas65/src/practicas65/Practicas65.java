/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas65;
import static service.ArregloService.*;

public class Practicas65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] A = new double[50];
        double[] B = new double[20];
        
        inicializarA(A);
        mostrarArray(A);
        ordenarArray(A);
        inicializarB(A,B);
        mostrarArray(A);
        mostrarArray(B);
        
    }
    
}
