/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 54117
 */
public class ModificacionDeFicheros {
    
    /**
     * En este metodo usamos el objeto FileReader para 
     * leer ficheros existentes
     * 
     */
    public void lee(){
        
        try {
            FileReader entrada = new FileReader("C:\\Users\\54117\\Desktop\\leyendo.txt");
            int c = 0;
            //FileReader.read retorna caracter a caracter, es un iterator
            while(c!=-1){
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);
            }
            System.out.println();
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    /**
     * En este metodo utilizmos la clase FileWriter para crear
     * y sobreescribir un fichero
     */
    public void escribir(){
        
        String frase = "Esto es una prueba de escritura";
        
        try {//El constructor de filewriter esta sobrecargado, puede recibir 1 o 2 parametros
            //el que recibe 1 parametro crea el fichero y el que recibe 2 modifica
            //recibe una direccion en un String y un boolean si existe o no el archivo
            FileWriter escritura = new FileWriter("C:\\Users\\54117\\Desktop\\nuevoArchivo.txt", true);
            
            //el metodo write escribe caracter a caracter otro iterador
            for (int i = 0; i < frase.length(); i++) {
                
                escritura.write(frase.charAt(i));
            }
            escritura.close();
                    } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
     public void leeConBuffer(){
        
        try {
            FileReader entrada = new FileReader("C:\\Users\\54117\\Desktop\\leyendo.txt");
            
            BufferedReader miBufer = new BufferedReader(entrada);
            
            String linea = "";
            
            while(linea!=null){
                
                linea = miBufer.readLine();
                if(linea!=null) System.out.println(linea);
                
            }
            System.out.println();
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
     
     public void escribirConBuffer(){
         
         String frase = "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura"
                 + "Esto es una prueba de escritura";
        
        try {
            FileWriter escritura = new FileWriter("C:\\Users\\54117\\Desktop\\nuevoArchivo.txt", true);
            BufferedWriter miBuffer = new BufferedWriter(escritura);
            
            
            for (int i = 0; i < frase.length(); i++) {
                
                miBuffer.write(frase);
            }
            escritura.close();
                    } catch (IOException ex) {
            ex.printStackTrace();
        }
     }
}
