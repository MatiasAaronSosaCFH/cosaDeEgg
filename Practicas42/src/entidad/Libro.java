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
public class Libro {
    
    public Libro(){}
    
    public Libro(int ISBN, int numPag, String autor, String titulo){
        this.ISBN = ISBN;
        this.numeroDePaginas = numPag;
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public int getISBN(){
        return this.ISBN;
    }
    public int getNumPag(){
        return this.numeroDePaginas;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void serISBN(int isbn){
        this.ISBN = isbn;
    }
    public void serNumPag(int numPag){
        this.numeroDePaginas = numPag;
    }
    public void serAutor(String autor){
        this.autor = autor;
    }
    public void serTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", numeroDePaginas=" + numeroDePaginas + ", autor=" + autor + ", titulo=" + titulo + '}';
    }
    
    
    private int ISBN;
    private int numeroDePaginas;
    private String autor;
    private String titulo;
}
