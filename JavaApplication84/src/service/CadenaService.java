/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class CadenaService {

    public void mostrarVocales(Cadena cadena) {

        int cont = 0;

        for (int i = 0; i < cadena.getFrase().length(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")
                    || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("e")
                    || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("i")
                    || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("o")
                    || cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {

                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cont);
    }

    public void invertirFrase(Cadena cadena) {

        StringBuilder str = new StringBuilder(cadena.getFrase());

        String nuevaFrase = str.reverse().toString();

        System.out.println(nuevaFrase);
    }

    public int vecesRepetidas(Cadena cadena) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que letra queres buscar ?");
        String letra = leer.next();
        int cont = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {

                cont++;
            }
        }

        return cont;
    }

    public void unirFrases(Cadena cadena) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        String frasesita = leer.next();

        String nuevaFrase = cadena.getFrase().concat(frasesita);

        System.out.println("La nueva frase es = " + nuevaFrase);
    }

    public void compararLongitud(Cadena cadena) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es la frase que queres comparar ?");
        String fraseAComparar = leer.next();

        if (fraseAComparar.length() > cadena.getLongitud()) {

            System.out.println("La frase nueva es mayor que la guardada");
        } else if (fraseAComparar.length() < cadena.getLongitud()) {

            System.out.println("La frase guardada es mayor a la nueva");
        } else {

            System.out.println("Las frases son iguales en longitud");
        }

    }

    public void reemplazar(Cadena cadena) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que caracter queres usar para reemplazar la 'a' ?");
        String letra = leer.next();
        String nuevaFrase = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {

            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")) {

                nuevaFrase = nuevaFrase.concat(letra);
            } else {

                nuevaFrase = nuevaFrase.concat(cadena.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("La nueva frase es: "
                + "\n" + nuevaFrase);
    }

    public boolean contiene(Cadena cadena) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que letra queres buscar ?");
        String busqueda = leer.next();
        boolean existe = cadena.getFrase().toLowerCase().contains(busqueda);
        return existe;
    }
}
