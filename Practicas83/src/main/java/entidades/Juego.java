/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 54117
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(RevolverDeAgua revolver, ArrayList<Jugador> jugadores){
        
        this.jugadores = jugadores;
        this.revolver = revolver;
        System.out.println("Juego LLENO!!!!");
    }
    /*
    public void buscarTarea() {
        
        System.out.println("BUSCAR TAREA:");
        System.out.println("Ingrese la tarea a buscar:");
        String tareaIngresado = leer.next();
        tareaIngresado = tareaIngresado.toUpperCase();
        Iterator<Tarea> it = conjuntoTareas.iterator();
        boolean encontrado = false;
        
        while (it.hasNext()) {
            Tarea tarea = it.next();
            if (tarea.getTitulo().equals(tareaIngresado)) {
                System.out.println(tarea.toString());
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("La tarea no se encuentra en la lista.");
            
        }
        
    }
    
    */
    public void ronda(){
        
        System.out.println("Empezo la ronda!!");
        System.out.println(revolver);
        Iterator<Jugador> iterador = jugadores.iterator();
        
        for (int i = 0; i < 6; i++) {
            
            Jugador jugadorEnRonda = iterador.next();
            if(jugadorEnRonda.disparo(revolver)){
                System.out.println("SE ACABO EL JUEGO!!"
                        + "\n"+"El " +jugadorEnRonda.getNombre()+" se mojo");
                jugadorEnRonda.setMojado(true);
                break;
            }else{
                System.out.println(revolver);
            }
            
            if(!iterador.hasNext()){
                iterador = jugadores.listIterator(0);
            }
        }
//        for (Jugador jugadorEnRonda : jugadores) {
//            if(jugadorEnRonda.disparo(revolver)){
//                System.out.println("SE ACABO EL JUEGO!!"
//                        + "\n"+"El " +jugadorEnRonda.getNombre()+" se mojo");
//                jugadorEnRonda.setMojado(true);
//                break;
//            }else{
//                System.out.println(revolver);
//            }
//        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores="  + ", revolver=" + revolver + '}';
    }
    
    
    
    
    
}
