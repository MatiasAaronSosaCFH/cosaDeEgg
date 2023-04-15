/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas41;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Practicas41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] sopa = new String[20][20];
        
    }
    
    public static void rellenando(String[][] matriz){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("A continuacion te pediremos 5 palabras, si no tienen los parametros requeridos" + "\n"
                + "la palabra no sera tomada en cuenta y pediremos otra");
        
        String palabra = "";
        int cont = 0;
        
        for(int i = 0; i < 20; i++){
            
            for(int j = 0; j < 20; j++){
                
                boolean salir = true;
                do {   
                    
                    if(cont == 5){
                        break;
                    }
                    
                    System.out.println("Ingrese una palabra que tenga entre 3 y 5 caracteres ");
                    palabra = leer.next();
                    
                    if(palabra.length() < 5 && palabra.length() > 3 ){
                        salir = false;
                        cont++;
                    }
                    
                } while (salir);
                if(cont <= 5){
                    matriz[i][(int)(Math.round(Math.random()*20))] = palabra.substring(i, i+1);
                }else if(matriz[i][j] == null){
                    matriz[i][j] = (int)((Math.round(Math.random()*9))) + "";
                }
                
            }
        }
    }
    
}
