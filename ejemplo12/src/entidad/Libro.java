/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Libro {
    
    private int ISBN;
    private int numeroDePaginas;
    private String autor;
    private String titulo;
    
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
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    public void setNumPag(int numPag){
        this.numeroDePaginas = numPag;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public static void cargarLibro(Libro elcuervo){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cual es el numero ISBN del libro ?");
        elcuervo.setISBN(leer.nextInt());
        System.out.println("Cuantas paginas tiene el libro ?");
        elcuervo.setNumPag(leer.nextInt());
        System.out.println("Cual es el autor ?");
        elcuervo.setAutor(leer.next());
        System.out.println("Cual es el titulo del libro ?");
        elcuervo.setTitulo(leer.next());
    }
    
    @Override
    public String toString(){
        return "Libro{" + "ISBN = "+ ISBN + " Numero de paginas = " + numeroDePaginas + " Autor = " + autor + " Titulo = " + titulo;
    }
}
