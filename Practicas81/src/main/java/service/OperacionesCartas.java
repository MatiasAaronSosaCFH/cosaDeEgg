/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidad.Baraja;
import entidad.Carta;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author 54117
 */
public class OperacionesCartas {
    
    public static Baraja crearBaraja(){
        Baraja baraja = new Baraja();
        String palo = "";
        
        for (int i = 0; i < 4; i++) {
            switch(i){
                case 0:
                    palo = "Basto";
                    break;
                case 1:
                    palo = "Espada";
                    break;
                case 2:
                    palo = "Copa";
                    break;
                case 3:
                    palo = "Oro";
                    break;
            }
            for (int j = 1; j < 13; j++) {
                
                if(j == 8 || j == 9){
                    continue;
                }
                Carta carta = new Carta(palo, j);
                baraja.getMazo().add(carta);
            }
        }
        return baraja;
    }
    
    public static void barajar(Baraja baraja){
        Collections.shuffle(baraja.getMazo());
    }
    
    public static Carta siguienteCarta(Baraja baraja){
        Iterator<Carta> iterador = baraja.getMazo().iterator();
        if(iterador.hasNext()){
            iterador.remove();
            return (Carta) iterador.next();
            
        }else{
            System.out.println("No hay mas cartas");
            return null;
        }
    }
    
    public static void cartasDisponibles(Baraja baraja){
        System.out.println("Las cartas disponibles son: " + baraja.getMazo().size());
    }
}
