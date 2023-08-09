/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ironmanproject;

import entidades.Armadura;
import entidades.Corazon;
import java.math.BigInteger;


/**
 *
 * @author 54117
 */
public class IronManProject {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        Armadura ironMan = new Armadura();
        
        ironMan.setGenerador(new Corazon());
        try{
            System.out.println(ironMan.getGenerador().getBateria());
        }catch(NullPointerException e){
            System.out.println("No esta declarado el generador");
        }
        float bateriaAMedias = (ironMan.getGenerador().getBateria() / 3) / 389;
        float porcentaje = bateriaAMedias / Float.MAX_VALUE * 100;
        System.out.println(Math.round(porcentaje) + "%");
        
        
    }
    
}
