/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servuce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Service {
    
    public static void cargarPerros(ArrayList<String> razas){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        
        do {            
            
            System.out.println("Escribi el nombre de la raza a agregar");
            razas.add(leer.next());
            
            System.out.println("Queres agregar otra raza a la lista ? (S/N)");
            String resp = leer.next();
            
            if(resp.equalsIgnoreCase("n")){
                salir = true;
            }else if(resp.equalsIgnoreCase("s")){
                System.out.println("Bien Continuemos");
            }else{
                System.out.println("Caracter incorrecto, el programa se reiniciara");
            }
            
        } while (!salir);
        
        for(String raza : razas){
            
            System.out.println("Raza: " +raza);
        }
    }
    
    public static void liquidarPerro(ArrayList<String> razas){
        
        Scanner leerDos = new Scanner(System.in).useDelimiter("\n");
        
        Iterator iterador = razas.iterator();
        
        System.out.println("Que perro deseas LIQUIDAR ???");
        String raza = leerDos.next();
        boolean noEsta = false;
        
        while(iterador.hasNext()){
            
            if(iterador.next().equals(raza)){
                iterador.remove();
                noEsta = true;
            }
        }
        
        if(!noEsta){
            System.out.println("La raza no esta en la lista");
        }
        
        razas.sort(comparaNombres);
        //foreach
        for(String razaDos : razas){
            System.out.println(razaDos);
        }
    }
    
    public static Comparator<String> comparaNombres = new Comparator<String>() {
        
        public int compare(String razaUno,String razaDos) {
            return razaUno.compareTo(razaDos);
        }
    };
}
