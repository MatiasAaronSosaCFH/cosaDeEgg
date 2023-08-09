
package service;

import entidad.Cadena;

public class CadenaService {
    
    
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
    
    public static void invertirFrase(Cadena cadena){
        StringBuilder strbld = new StringBuilder(cadena.getFrase());
        
        
        String nuevaFrase = strbld.reverse().toString();
        
        System.out.println(nuevaFrase);
    }
    
    
}
