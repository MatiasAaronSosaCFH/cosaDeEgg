/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Silla;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class SillasService {
    
    private static Scanner leerServiceSillas = new Scanner(System.in).useDelimiter("\n");

    public static Silla crearSilla() {
        Silla silla = new Silla();
        System.out.println("De color es tu silla ?");
        silla.setColor(leerServiceSillas.next());
        System.out.println("Cuantas patas tiene tu silla?");
        silla.setPatas(leerServiceSillas.nextInt());
        System.out.println("Tu mesa esta barnisada ? (S/N)");
        silla.setBarnisada(leerServiceSillas.next().equalsIgnoreCase("s"));
        System.out.println("Tu mesa es de madera ? (S/N)");
        silla.setDeMadera(leerServiceSillas.next().equalsIgnoreCase("s"));
        return silla;
    }
    
    public static ArrayList<Silla> cantidadDeSillas(){
        ArrayList<Silla> sillas = new ArrayList();
        String resp = "";
        do {            
            sillas.add(crearSilla());
            System.out.println("Queres seguir agregando mesas ?");
             resp = leerServiceSillas.next();
        } while (resp.equalsIgnoreCase("s"));
        return sillas;
    }

    public static void revisionDeCalidad(Silla silla) {

        if (silla.isBarnisada()) {
            System.out.println("Nuestra silla esta barnisada");
            if (silla.getColor().equalsIgnoreCase("Marron")) {
                System.out.println("Nuestra silla esta correctamente pintada");
                if (silla.getPatas() > 4) {
                    System.out.println("Nuestro silla tiene la cantidad correcta de patas");
                    if (silla.isDeMadera()) {
                        System.out.println("Nuestra silla no es de madera, no es adecuada");
                        System.out.println("Nuestra silla esta correctamente construida");
                    } else {
                        System.out.println("Nuestra silla no paso el control de circunferencia, no es adecuada");
                    }
                } else {
                    System.out.println("Nuestra silla no paso el control de cantidad de patas, no es adecuada");
                }
            } else {
                System.out.println("Nuestra silla no paso el control de color, no es adecuada");
            }
        } else {
            System.out.println("Nuestra silla no paso el control de barnisada, no es adecuada");
        }
    }
}