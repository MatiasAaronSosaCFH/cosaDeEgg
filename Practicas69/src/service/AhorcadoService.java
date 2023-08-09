/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas 
máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si 
la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que
se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

Método juego(): el método juego se encargará de llamar todos los métodos previamente 
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin 
intentos. Este método se llamará en el main.
 */
package service;

import entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class AhorcadoService {
    
    public static void crearJuego(Ahorcado juego) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la palabra a completar");
        String palabra = leer.next();
        String[] array = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            array[i] = palabra.substring(i, i + 1);
        }
        System.out.println("Cuantas oportunidades tenes ? ");
        juego.setJugadas(leer.nextInt());
        juego.setPalabra(array);

    }

    public static void longitud(Ahorcado juego) {

        System.out.println("La longitud de la palabra es: " + juego.getPalabra().length);
    }

    public static boolean buscar(Ahorcado juega) {
        boolean está = false;
        int cont = 0;
        int letras = 0;
        String[] arrayPar = new String[juega.getPalabra().length];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //foreach no se puede usar para modificar un arreglo
        System.out.println("Ingrese la letra");
        String letrita = leer.next();
        
        for (String letra : juega.getPalabra()) {

            if (letra.equals(letrita)) {
                está = true;
                letras++;
                arrayPar[cont] = juega.getPalabra()[cont];
            }

            cont++;
        }
        
        juega.setLetrasEncontradas(juega.getLetrasEncontradas() + letras);

        return está;
    }
    
    public static void encontradas(Ahorcado juego){
        
        if(buscar(juego)){
            System.out.println("La letra si estaba");
        }else{
            System.out.println("No se encontro la letra ");
            juego.setJugadas(juego.getJugadas()-1);
        }
        System.out.println("Encontraste "+ juego.getLetrasEncontradas() + " letras");
        System.out.println("Te faltan " + (juego.getPalabra().length-juego.getLetrasEncontradas()));
    }
    
    public static void intentos(Ahorcado juego){
        System.out.println("Te quedan " + juego.getJugadas() + " intentos");
    }
    
    public static void juego(Ahorcado juego){
        
        crearJuego(juego);
        
        while(juego.getJugadas()>0){
            
            encontradas(juego);
            longitud(juego);
            intentos(juego);
            
            if(juego.getJugadas()==0){
                System.out.println("TE QUEDASTE SIN INTENTOS!!! juego terminado");
            }
        }
    }
}
