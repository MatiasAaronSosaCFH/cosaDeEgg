/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Raza;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class RazaService {

    public static void agregarRazas(ArrayList<String> razas) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String salir = "";

        do {

            System.out.println("Ingrese una raza de perros");
            razas.add(leer.next());

            System.out.println("desea ingresar otra raza ? (S/N)");
            salir = leer.next();

        } while (salir.equalsIgnoreCase("s"));

        for (String raza : razas) {
            System.out.println(raza);
        }

    }

    public static void removerRazas(ArrayList<String> razas) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";
        Iterator<String> iterador = razas.iterator();

        System.out.println("Que raza desea ELIMINAR de la lista ?");
        String razaBuscada = leer.next();

        while (iterador.hasNext()) {
            if (iterador.next().equalsIgnoreCase(razaBuscada)) {
                iterador.remove();
            }
        }
        
        Comparator cmprtr = null;
        razas.sort(cmprtr);
        
        for (String raza : razas) {
            System.out.println(raza);
        }

    }

}
