
package service;

import entidad.Cadena;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CadenaService {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void mostrarVocales(Cadena cadena){
        
        int cont = 0;
        
        for (int i = 0; i < cadena.getLongitud() ; i++) {
            
            String letra = cadena.getFrase().substring(i, i + 1);
            
            if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u"))  {
                
                cont++;
            }
        }
        
        System.out.println("La cantidad de vocales en la frase es: " + cont);
    }
    
    public static String invertirFrase(Cadena cadena){
        String fraseFinal ="";
        String[] array = new String[cadena.getLongitud()];
        
        for (int i = 0; i < cadena.getLongitud() ; i++) {
            
            array[i] = cadena.getFrase().substring(i, i+1);
            fraseFinal = fraseFinal.concat(array[i]);
        }
        Arrays.sort(array, 18, 0);
        
        for (String array1 : array) {
            
            fraseFinal = fraseFinal.concat(array1);
        }
        return fraseFinal;
    }
    
    
}
