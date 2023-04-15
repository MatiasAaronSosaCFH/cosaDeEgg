/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas31;

/*
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantidad de euros que quiera convertir");
        double cantidad = leer.nextDouble();

        System.out.println("A que moneda desea convertir ?" + "\n"
                + "1- libras" + "\n"
                + "2- Dolares" + "\n"
                + "3- Yenes");
        int moneda = leer.nextInt();
        
        
        cambio(monedita(moneda), cantidad);
    }

    public static void cambio(String moneda, double cantidad) {

        switch (moneda) {

            case "Libras":
                System.out.println("La cantidad de libras serian " + (cantidad * 0.86));
                break;
            case "Dolares":
                System.out.println("La cantidad de Dolares serian " + (cantidad * 1.28611));
                break;
            case "Yenes":
                System.out.println("La cantidad de Yenes serian" + (cantidad * 129.852));
                break;
            default:
                System.out.println("Valores no validos, fin del programa");
        }
    }

    public static String monedita(int moneda) {
        String monedita = "";

        switch (moneda) {
            case 1:
                monedita = "Libras";
                break;
            case 2:
                monedita = "Dolares";
                break;
            case 3:
                monedita = "Yenes";
                break;
            default:
        }

        return monedita;
    }
}
