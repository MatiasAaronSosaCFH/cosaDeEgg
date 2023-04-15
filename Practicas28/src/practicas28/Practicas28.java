/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas28;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leyendo = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que pensas ?...");
        String frase = leyendo.nextLine();

        verificacionYImpresion(frase);

    }

    public static void verificacionYImpresion(String frase) {

        boolean salir = false;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (!salir) {

            if (frase.endsWith(".")) {

                System.out.println(codificacion(frase));
                salir = true;
            } else {
                
                System.out.println("Tu frase no termina en punto");
                System.out.println("Deseas intentarlo denuevo ? (S/N)");
                String leido = leer.nextLine();
                
                if("s".equals(leido)){
                    
                    System.out.println("Que pensas ?...");
                    frase = leer.nextLine();
                }
                else if("n".equals(leido)){
                    
                    System.out.println("Cerrando programa");
                    salir = true;
                    break;
                }else{
                    System.out.println("Caracter no valido el programa se reiniciara");
                }
                
            }

        }

    }

    public static String codificacion(String frase) {

        String nuevaFrase = "";

        for (int i = 0; i < frase.length(); i++) {

            switch (frase.substring(i, i+1)) {

                case "a":
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case "e":
                    nuevaFrase = nuevaFrase.concat("o");
                    break;
                case "i":
                    nuevaFrase = nuevaFrase.concat("a");
                    break;
                case "o":
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                case "u":
                    nuevaFrase = nuevaFrase.concat("*");
                    break;
                case "A":
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case "E":
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                case "I":
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                case "O":
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                case "U":
                    nuevaFrase = nuevaFrase.concat("*");
                    break;
                default:
                    nuevaFrase = nuevaFrase.concat(frase.substring(i, i + 1));
                    break;
            }
        }

        return nuevaFrase;
    }
}
