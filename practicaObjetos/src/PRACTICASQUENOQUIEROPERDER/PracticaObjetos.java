/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICASQUENOQUIEROPERDER;

import entidad.Mesa;

public class PracticaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mesa mesita = new Mesa();
        
        Mesa mesota = new Mesa("Cafe",4,true,1.2,5.4);
        
        mesita.setColor("Dorado");
        
        System.out.println(mesita.getColor());
        
        System.out.println(mesota.getPatas());
    }
    
}
