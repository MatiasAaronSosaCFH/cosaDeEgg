/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Mesa;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class MesaService {

    private static Scanner leerServiceMesas = new Scanner(System.in).useDelimiter("\n");

    public static Mesa crearMesa() {
        Mesa mesa = new Mesa();
        System.out.println("De color es tu mesa ?");
        mesa.setColor(leerServiceMesas.next());
        System.out.println("Cuantas patas tiene tu mesa?");
        mesa.setPatas(leerServiceMesas.nextInt());
        System.out.println("Tu mesa esta barnisada ? (S/N)");
        mesa.setBarnisada(leerServiceMesas.next().equalsIgnoreCase("s"));
        System.out.println("Tu mesa es redonda ? (S/N)");
        mesa.setRedonda(leerServiceMesas.next().equalsIgnoreCase("s"));
        return mesa;
    }
    
    public static ArrayList<Mesa> cantidadDeMesas(){
        ArrayList<Mesa> mesas = new ArrayList();
        String resp = "";
        do {            
            mesas.add(crearMesa());
            System.out.println("Queres seguir agregando mesas ?");
             resp = leerServiceMesas.next();
            
        } while (resp.equalsIgnoreCase("s"));
        return mesas;
    }

    public static void revisionDeCalidad(Mesa mesa) {

        if (mesa.isBarnisada()) {
            System.out.println("Nuestra mesa esta barnisada");
            if (mesa.getColor().equalsIgnoreCase("Marron")) {
                System.out.println("Nuestra mesa esta correctamente pintada");
                if (mesa.getPatas() > 1) {
                    System.out.println("Nuestro mesa tiene la cantidad correcta de patas");
                    if (mesa.isRedonda()) {
                        System.out.println("Nuestra mesa tiene la circunferencia adecuada");
                        System.out.println("Nuestra mesa esta correctamente construida");
                    } else {
                        System.out.println("Nuestra mesa no paso el control de circunferencia, no es adecuada");
                    }
                } else {
                    System.out.println("Nuestra mesa no paso el control de cantidad de patas, no es adecuada");
                }
            } else {
                System.out.println("Nuestra mesa no paso el control de color, no es adecuada");
            }
        } else {
            System.out.println("Nuestra mesa no paso el control de barnisada, no es adecuada");
        }
    }
}
