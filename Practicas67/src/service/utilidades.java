/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class utilidades {

    public static String[] cargarArray() {
        String[] retorno = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        return retorno;
    }

    public static void adivinando(String[] array, String mesSecreto) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean salir = false;
        do {
            System.out.println("Adivine el mes secreto ?¿");
            String mesito = leer.next();
            
            if (mesito.equalsIgnoreCase(mesSecreto)) {
                System.out.println("ACERTASTE!!!!");
                salir = true;
            }else{
                System.out.println("TE EQUIVOCASTE... quieres intentarlo denuvo ? (S/N)");
                String resp = leer.next();
                
                if (resp.equalsIgnoreCase("n")) {
                    salir = true;
                }else if(resp.equalsIgnoreCase("s")){
                    System.out.println("Suerte en tu proximo intento!!");
                }else {
                    System.out.println("Caracter incorrecto el programa se ejecutara denuevo");
                }
            }
        } while (!salir);

    }
}
