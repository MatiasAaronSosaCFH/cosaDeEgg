/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Cadena;
import java.util.Scanner;
/**
 *
 * @author 54117
 */
public class Principal {
    
    public static void main(String[] args){
                
        Cadena cadena1 = new Cadena();
        Scanner escanear = new Scanner(System.in);
    
        System.out.println("Ingrese una frase: ");
        
        cadena1.setFrase(escanear.nextLine());
        cadena1.setLongitud(cadena1.getFrase().length());
        
        cadena1.mostrarVocales();            
    }    
}