/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina 
el número o se queda sin intentos. Registra el número de intentos necesarios 
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Juego {
    
    
    public static void iniciarJuego(){
        
        
        Scanner scaneando = new Scanner(System.in).useDelimiter("\n");
        boolean salir = true;
        int cont = 5;
        
        System.out.println("Va a comenzar el juego!!" + "\n"
                + "Introdusca el numero a adivinar y en la segunda parte " + "\n"
                + "le pediremos al segundo jugador que adivine el numero!");
        int num = scaneando.nextInt();
        int numAd = 0;
        
        do {
            System.out.println("Te quedan " + cont + " intentos");
            
            System.out.println("Adivina el numero ingresado anteriormente");
            numAd = scaneando.nextInt();
            
            if(numAd < num){
                System.out.println("El numero ingresado es menor al que tenemos que adivinar");
                
            }else if(numAd > num){
                System.out.println("El numero ingresado es mayor al que tenemos que adivinar");
            }else{
                System.out.println("Adivinaste!!");
                salir = false;
            }
            
            cont--;
            
            if(cont == 0 && numAd != num){
                System.out.println("Se te terminaron los intentos PERDISTE!!");
                salir = false;
            }
            
            
        } while (salir);
    }
}
