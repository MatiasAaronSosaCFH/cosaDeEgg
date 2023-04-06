/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import principal.Paattern;

/**
 *
 * @author 54117
 */
public class Cadena {
    
    /**
     * Constructores
     */
    public Cadena(){        
    }
    
    public Cadena(String frase, int longitud){        
        this.frase = frase;
        this.longitud = longitud;        
    }
    
    /**
     * Getters y setters
     */
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    public String getFrase(){
        return frase;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    
    
    /**
     * Metodos de la clase
     */
    
    public void mostrarVocales(){
        
        int cont = 0;
        for(int i = 0; i < this.longitud; i++){
            
            if(Paattern.useRegex(this.frase.substring(i, i+1))){
                cont += 1;
            }else{}
        }
        
        System.out.println("La cantidad de vocales es: " + cont);
    }
    
    
    /**
     * Atributos
     */
    private String frase;
    private  int longitud;
    
}
