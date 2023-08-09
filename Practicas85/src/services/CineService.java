/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class CineService {

    private static long cont = 1;

    public static Espectador crearEspectador() {
        Espectador cliente = new Espectador();
        String nombre = "Cliente n°" + cont;
        cliente.setNombre(nombre);
        cont++;
        cliente.setDineroDisponible((Math.random() * 100) + 1);
        cliente.setEdad((int) Math.round(Math.random() * 80));
        return cliente;
    }

    public static ArrayList<Espectador> filaParaEntrar() {
        ArrayList<Espectador> fila = new ArrayList();

        for (int i = 0; i < 50; i++) {
            fila.add(crearEspectador());
        }

        return fila;
    }

    public static Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del director de la pelicula");
        peli.setDirector(leer.next());
        System.out.println("Ingrese el titulo de la pelicula");
        peli.setTitulo(leer.next());
        System.out.println("Cual es la edad minima ?");
        peli.setEdadMinima(leer.nextInt());
        System.out.println("Cuanto dura ?");
        peli.setDuracion(leer.nextDouble());
        return peli;
    }

    public static boolean puedeEntrar(Cine cine, Espectador cliente) {

        boolean mayor = false;
        boolean tieneDinero = false;
        if (cliente.getEdad() >= cine.getPeli().getEdadMinima()) {
            mayor = true;
        }

        if (cliente.getDineroDisponible() >= cine.getPrecioEntrada()) {
            tieneDinero = true;
        }
        if (mayor && tieneDinero) {
            System.out.println("Puede pasar");
            return true;
        } else {
            System.out.println("No puede pasar");
            return false;
        }
    }

    /*
    public void sentarEspectadores(Espectador[] espectadores, Cine cine) {
        Pelicula pelicula = cine.getPelicula();
        Espectador[][] sala = cine.getSala();
        double precioEntrada = cine.getPrecioEntrada();
        Random random = new Random();
        for (Espectador espectador : espectadores) {
            if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
                int fila, columna;
                do {
                    fila = random.nextInt(sala.length);
                    columna = random.nextInt(sala[0].length);
                } while (sala[fila][columna] != null);

                sala[fila][columna] = espectador;
                espectador.pagar(precioEntrada);
            }
        }
    }
     */
    public static Cine crearCine() {
        Cine cine = new Cine();
        cine.setPeli(crearPelicula());
        cine.setPrecioEntrada(Math.random() * 20);
        cine.setSala(llenarSala());
        return cine;
    }

    public static Sala llenarSala() {
        Sala sala = new Sala();
        String conta = "";
        int contadorDos = 8;
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        conta = "A";
                        break;
                    case 1:
                        conta = "B";
                        break;
                    case 2:
                        conta = "C";
                        break;
                    case 3:
                        conta = "D";
                        break;
                    case 4:
                        conta = "E";
                        break;
                    case 5:
                        conta = "F";
                        break;

                }
                String mensaje = String.format("%d", (contadorDos)) + conta;
                sala.getButacas()[i][j] = new Asiento(" " + mensaje);
            }
            contadorDos--;
        }

        return sala;
    }

    /*for (int i = 0; i < 8; i++) {
                    int contaDos = 0;
                    if (sala.getButacas()[i][contaDos].getOcupado()) {
                        break;
                    }
                    for (int j = 0; j < 6; j++) {
                        contaDos = j;
                        if (!sala.getButacas()[i][j].getOcupado()) {
                            sala.getButacas()[i][j].setEspectador(clienteDos);
                            sala.getButacas()[i][j].setNombreAsiento(sala.getButacas()[i][j].getNombreAsiento() + "X");
                            sala.getButacas()[i][j].setOcupado(true);
                            break;
                        }
                    }
                    
                }*/
    public static void busquedaAsiento(Cine cine) {
        ArrayList<Espectador> fila = filaParaEntrar();
        Iterator<Espectador> iterador = fila.iterator();
        Sala sala = cine.getSala();
        String nombre;
        while (iterador.hasNext()) {
            Espectador clienteDos = iterador.next();
            boolean salir = false;
            if (puedeEntrar(cine, clienteDos)) {
                do {
                    int i = (int) Math.round(Math.random() * 7);
                    int j = (int) Math.round(Math.random() * 5);
                    if (!sala.getButacas()[i][j].getOcupado()) {
                        sala.getButacas()[i][j].setEspectador(clienteDos);
                        sala.getButacas()[i][j].setNombreAsiento(sala.getButacas()[i][j].getNombreAsiento() + "X");
                        sala.getButacas()[i][j].setOcupado(true);
                        salir = true;
                    }
                } while (!salir);
            }
        }
    }

    public static void imprimirMatriz(Cine cine) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getSala().getButacas()[i][j].getNombreAsiento());
            }
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println(" ");
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if(cine.getSala().getButacas()[i][j].getOcupado()){
                    System.out.print(cine.getSala().getButacas()[i][j].getEspectador().getNombre());
                }else{
                    System.out.print(cine.getSala().getButacas()[i][j].getNombreAsiento());
                }
                
            }
            System.out.println(" ");
            System.out.println("------------------");
            System.out.println(" ");
        }
    }

}
