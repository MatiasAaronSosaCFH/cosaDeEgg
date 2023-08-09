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

    private static Scanner leerService = new Scanner(System.in).useDelimiter("\n");

    public static void crearJuego(Ahorcado juego) {

        System.out.println("Que palabra vamos a adivinar ?");
        String palabra = leerService.next();
        System.out.println("Cuantas jugadas tenemos ?");
        int jugadas = leerService.nextInt();
        String[] palabraAr = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            palabraAr[i] = palabra.substring(i, i + 1);
        }

        juego.setJugadas(jugadas);
        juego.setPalabra(palabraAr);
    }

    public static void longitud(Ahorcado juego) {

        System.out.println("La longitud de la palabra a adivinar es : "
                + juego.getPalabra().length);
    }

    public static boolean buscar(Ahorcado juego,String[] encontradas) {
        boolean retorno = false;

        System.out.println("Ingrese una letra");
        String letra = leerService.next();
        int cont = 0;
        
        for (int i = 0; i < juego.getPalabra().length; i++) {

            if (encontradas[i] == null) {
                if (juego.getPalabra()[i].equalsIgnoreCase(letra)) {
                    retorno = true;
                    cont++;
                    encontradas[i] = juego.getPalabra()[i];
                }
            }
        }
//        for(String letraEncontrada : palabraEncontrada){
//            if(letraEncontrada.equalsIgnoreCase(letra)){
//                cont = 0;
//            }
//        }
        juego.setPalabrasEncontradas(juego.getPalabrasEncontradas() + cont);
        return retorno;
    }

    public static void letrasEncontradas(Ahorcado juego) {

        System.out.println("La cantidad de letras encontradas es: " + juego.getPalabrasEncontradas());
    }

    public static void intentos(Ahorcado juego) {

        System.out.println("Te quedan " + juego.getJugadas() + " juegadas");
    }

    public static void juegar(Ahorcado juego) {

        crearJuego(juego);
        String[] palabraEncontrada = new String[juego.getPalabra().length];
        boolean salir = false;
        do {
            longitud(juego);
            if (buscar(juego, palabraEncontrada)) {
                System.out.println("Encontraste una de las letras!!");
            } else {
                System.out.println("La letra no estaba :( ");
                juego.setJugadas(juego.getJugadas()-1);
            }
            letrasEncontradas(juego);
            intentos(juego);
            
            if(juego.getJugadas() == 0){
                salir = true;
            }else if(juego.getPalabrasEncontradas() == juego.getPalabra().length){
                System.out.println("Encontraste todas las letras de tu palabra!!"
                        + "\n" +"Ganaste!!!");
                salir = true;
            }
        } while (!salir);
    }
}
