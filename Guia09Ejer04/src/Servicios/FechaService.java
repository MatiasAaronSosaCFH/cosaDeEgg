/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes 
métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo:
Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author juli
 */
public class FechaService {

    private static Scanner leer = new Scanner(System.in);

    public static Date fechaNacimiento() {

        System.out.println("ingrese dia de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("ingrese mes de su nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("ingrese año de su nacimiento");
        int anio = leer.nextInt();
        Date f = new Date(anio - 1900, mes, dia);
        return f;
    }

    public static Date fechaActual() {
        Date f1 = new Date();
        return f1;
    }

    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
    public static Date diferencia(Date f, Date f1) {
        Date fnew = new Date(f.getYear()-f1.getYear()-1900,f.getMonth()-f1.getMonth(),f.getDay()-f1.getDay());
        return fnew;
    }
}
