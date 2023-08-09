/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Simulacion {

    public static String returnNombre(String[] nombres) {
        return nombres[(int) Math.round(Math.random() * 10)];
    }

    public static String returnApellido(String[] apellidos) {
        return apellidos[(int) Math.round(Math.random() * 10)];
    }

    public static Long returnDni(Long[] dnis) {
        return dnis[(int) Math.round(Math.random() * 10)];
    }

    public static String[] daNombres() {
        String[] nombres = {"Matias", "Carmen", "Rocio", "Cecilia", "Marty", "Gonzalo", "Martin", "Analia", "Maria", "Ambar"};
        return nombres;
    }

    public static String[] daApellidos() {
        String[] nombres = {"Sosa", "Muñoz", "Arias", "Arevalos", "Gomez", "Quinteros", "Pisarski", "Petrucci", "Venitez", "Mazza"};
        return nombres;
    }

    public static Long daDni() {
        Long dni = (Long) Math.round(Math.random() * 100000000 + Math.random() * 5000000);

        do {
            while (dni > 99000000) {
                dni = dni / 10;
            }
            while (dni < 10000000) {
                dni = (Long) (dni * 10) + Math.round(Math.random() * 50000);
            }
        } while (dni > 99000000 && dni < 100000000);

        return dni;
    }

    public static Long[] creaListaDnis() {
        Long[] dnis = new Long[10];
        int cont = 0;
        do {
            Long dni = daDni();
            if (!Objects.equals(dnis[cont], dni)) {
                dnis[cont] = dni;
            } else {
                continue;
            }
            cont++;
        } while (dnis[9] == null);
        return dnis;
    }

    public static Alumno crearAlumnoAleatorio(String[] nombres, String[] apellidos, Long[] dnis) {

        Alumno alumnoUno = new Alumno();
        alumnoUno.setNombreCompleto(returnNombre(nombres) + " " + returnApellido(apellidos));
        alumnoUno.setDni(returnDni(dnis));

        return alumnoUno;
    }

    public static ArrayList<Alumno> agruparAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Con cuantos alumnos vamos a trabajar ?");
        int cantAlumnos = leer.nextInt();
        Alumno alumnoDos = crearAlumnoAleatorio(daNombres(), daApellidos(), creaListaDnis());
        for (int i = 0; i < cantAlumnos; i++) {
            Alumno alumnoUno = crearAlumnoAleatorio(daNombres(), daApellidos(), creaListaDnis());

            if (!Objects.equals(alumnoUno.getDni(), alumnoDos.getDni())) {
                alumnos.add(alumnoUno);
            } else {
                continue;
            }
            alumnoDos = alumnoUno;
        }

        return alumnos;
    }

    public static void votando(ArrayList<Alumno> alumnos) {
        Alumno alumnoRepetido = new Alumno();
        HashSet<Voto> votitos = new HashSet();
        for (Alumno alum : alumnos) {
            
            Alumno[] losVotados = new Alumno[3];
            Voto votaso = new Voto();
            votaso.setAlumnoVotante(alum);
            int cont = 0;
            
            do {
                
                int posicion = (int) Math.round(Math.random() * alumnos.size());
                Alumno alumnitoVotado = alumnos.get(posicion);
                
                if (!alumnitoVotado.equals(alumnoRepetido) && !alumnitoVotado.equals(alum)) {
                    
                    losVotados[cont] = alumnitoVotado;
                    alumnos.get(posicion).setCantidadDeVotos(alumnos.get(posicion).getCantidadDeVotos() + 1);
                    cont++;
                    
                }
                
                alumnoRepetido = alumnitoVotado;
                
            } while (cont<4);

            votaso.setAlumnosVotados(losVotados);
            
        }
    }
}
