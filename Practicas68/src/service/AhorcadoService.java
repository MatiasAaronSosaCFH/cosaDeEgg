/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class AhorcadoService {
    
   public static void crearJuego(Ahorcado juego){
       
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("Ingrese la palabra a adivinar");
       String palabrita = leer.next();
       
       juego.setLetras(palabrita.length());
       
       String [] arrayUso = new String[juego.getLetras()];
       System.out.println("Cuantas jugadas tiene antes de perder ?");
       int jugadas = leer.nextInt();
       
       for (int i = 0; i < palabrita.length(); i++) {
           
           arrayUso[i] = palabrita.substring(i, i+1);
           
       }
       
       juego.setPalabra(arrayUso);
       juego.setCantJugadas(jugadas);
   }
   
   public static void longitud(Ahorcado juego){
       
       System.out.println("La palabra a adivinar tiene = "+juego.getPalabra().length+" letras");
   }
   
   public static int buscar(Ahorcado juego){
       int esta = 0;
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("Ingrese una letra");
       String letrita = leer.next();
       String[] arrayUso2 = juego.getPalabra();
       
       for (int i = 0; i < juego.getPalabra().length; i++) {
           
           if (letrita.equalsIgnoreCase(arrayUso2[i])) {
               
               esta++;
               break;
           }else{
               juego.setCantJugadas(juego.getCantJugadas() - 1);
           }
       }
       if(esta > 0){
           System.out.println("La letra pertenece a la palabra");
       }
       return esta;
   }
   
   public static void encontrados(Ahorcado juego){
       
       int letrasEncontradas = buscar(juego);
       
       System.out.println("Encontradas, faltantes : (" + letrasEncontradas + ", " + (juego.getLetras()-letrasEncontradas) + ")");
   }
   
   public static void intentos(Ahorcado juego){
       
       System.out.println("Te quedan = " +juego.getCantJugadas()+ " intentos");
   }
   
   public static void juego(Ahorcado juego){
       
       crearJuego(juego);
       boolean salir = false;
       do {           
           encontrados(juego);
           longitud(juego);
           if(juego.getCantJugadas() < 1){
               break;
           }else{
               intentos(juego);
           }
           
       } while (!salir);
   }
}
