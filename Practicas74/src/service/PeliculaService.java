package service;

import entidad.Pelicula;
import static entidad.Pelicula.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    public static Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Cual es el titulo de la pelicula ?");
        String titulo = leer.next();
        System.out.println("Quien es el director de la pelicula ?");
        String director = leer.next();
        System.out.println("Cuanto dura la pelicula ?");
        double duracion = leer.nextDouble();
        Pelicula peli = new Pelicula(titulo, director, duracion);
        return peli;
    }

    public static void guardarPeliculas(ArrayList<Pelicula> peliculas) {
        boolean salir = false;
        Scanner leerDos = new Scanner(System.in).useDelimiter("\n");
        do {
            peliculas.add(crearPelicula());
            System.out.println("Quieres agregar otra pelicula ? (S/N)");
            String resp = leerDos.next();
            if (resp.equalsIgnoreCase("n")) {
                System.out.println("Gracias por usar nuestro sofware");
                salir = true;
            } else if (resp.equalsIgnoreCase("s")) {
                System.out.println("Bien continuamos con el programa");
            } else {
                System.out.println("Caracter incorrecto, el programa se repetira");
            }
        } while (!salir);
    }

    public static void ordenarPeliculas(ArrayList<Pelicula> peliculas) {

        imprimirLista(peliculas);

        Collections.sort(peliculas, compararDuracion);

        System.out.println("Lista de peliculas con duracion mayor a 1 hora");
        System.out.println("-------------------------");
        imprimirLista(peliculas);

        Collections.sort(peliculas, compararDuracionDos);

        System.out.println("Lista de peliculas de mayor a menor duracion");
        System.out.println("-------------------------");
        imprimirLista(peliculas);

        Collections.sort(peliculas, compararDuracionTres);

        System.out.println("Lista de peliculas de menor a mayor duracion");
        System.out.println("-------------------------");
        imprimirLista(peliculas);

        Collections.sort(peliculas, comprarTitulo);

        System.out.println("Lista ordenada alf por Titulo");
        System.out.println("-------------------------");
        imprimirLista(peliculas);

        Collections.sort(peliculas, comprarDirector);

        System.out.println("Lista ordenada alf por Director");
        System.out.println("-------------------------");
        imprimirLista(peliculas);
    }

    public static void imprimirLista(ArrayList<Pelicula> peliculas) {
        peliculas.forEach((peli) -> {
            System.out.println(peli);
        });
    }
}
