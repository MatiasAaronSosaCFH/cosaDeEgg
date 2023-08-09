/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Estudiante;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class EstudianteService {

    public static void cargarNotas(Estudiante[] alumnos) {

        for (int i = 0; i < 8; i++) {

            Estudiante estudiante = new Estudiante();

            estudiante.setNota(Math.round(Math.random() * 5 + 3));
            alumnos[i] = estudiante;

        }
    }

    public static void cargarNombres(Estudiante[] alumnos) {

        alumnos[0].setNombre("German");
        alumnos[1].setNombre("Matias");
        alumnos[2].setNombre("Araceli");
        alumnos[3].setNombre("Paula");
        alumnos[4].setNombre("Sandra");
        alumnos[5].setNombre("Marcos");
        alumnos[6].setNombre("Lorena");
        alumnos[7].setNombre("Juan");

    }

    public static Estudiante[] retornaLista(Estudiante[] alumnos) {
        cargarNotas(alumnos);
        cargarNombres(alumnos);

        return alumnos;
    }

    public static double calcularPromedio(Estudiante[] alumnos) {

        double promedio = 0;

        for (int i = 0; i < 8; i++) {

            promedio = promedio + alumnos[i].getNota();
        }

        promedio = Math.round(promedio / 8);

        return promedio;
    }

    public static String[] mostrarMayProme(Estudiante[] alumnos) {

        double promedio = calcularPromedio(alumnos);
        int cont = 0;
        int[] posiciones = new int[8];

        for (int i = 0; i < 8; i++) {
            if (alumnos[i].getNota() > promedio) {
                cont++;
                posiciones[i] = i;
            }
        }
        
        String[] alumnosMejores = new String[cont];
        int contador = 0;
        
        for (int i = 0; i < 8; i++) {

            if (alumnos[i].getNota() > promedio) {
                alumnosMejores[contador] = alumnos[i].getNombre();
                contador++;
            }
            
        }
        return alumnosMejores;
    }

    public static void mostrarPromedios(String[] alumnos, Estudiante[] promedio) {

        System.out.println("El promedio del curso es = " + calcularPromedio(promedio));
        System.out.println("Los alumnos que estuvieron por arriba del promedio fueron = " + Arrays.toString(alumnos));

    }
}
