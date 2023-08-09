/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class RuletaRusaService {
    
    public static Jugador crearJugador(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Que id de jugador queres ? (del 1 al 6)");
        int id = leer.nextInt();
        
        Jugador jugador = new Jugador(false,id);
        jugador.setNombre("Jugador " + jugador.getId());
        return jugador;
    }
    
    
    public static ArrayList<Jugador> crearListaDeJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos jugadores van a participar ?");
        int cont = leer.nextInt();
        for (int i = 0; i < cont ; i++) {
            jugadores.add(crearJugador());
        }
        return jugadores;
    }
    
    public static void jugando(){
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        ArrayList<Jugador> lista = crearListaDeJugadores();
        
        Juego jueguito = new Juego();
        jueguito.llenarJuego(revolver,lista);
        
        jueguito.ronda();
    }
}
