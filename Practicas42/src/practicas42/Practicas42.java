/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas42;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro librito = new Libro();
        
        librito = rellenarLibro();
        
        System.out.println(librito.toString());
        
    }
    
    public static Libro rellenarLibro(){
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int pagLib = 0;
        int iSbN = 0;
        String autor = "";
        String titu = "";
        
        for (int i = 0; i < 4; i++) {
            if(i == 0){
                System.out.println("Cuantas paginas tiene tu libro?");
                pagLib = leer.nextInt();
            }else if(i == 1){
                System.out.println("Ingrese el numero ISBM del libro");
                iSbN = leer.nextInt();
            }else if(i == 2){
                System.out.println("Cual es el autor del libro");
                autor = leer.next();
            }else if(i == 3){
                System.out.println("Cual es el titulo ?");
                titu = leer.next();
            }
        }
        Libro librito = new Libro(iSbN, pagLib, autor, titu);
        return librito;
    }
}
