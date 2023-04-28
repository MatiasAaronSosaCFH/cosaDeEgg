/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Cancion {
    
    private String titulo;
    private String autor;
    
    public Cancion(){
        this.autor = "";
        this.titulo = "";
    }
    
    public Cancion(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    
}
