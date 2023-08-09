/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication29.service;

import java.util.Scanner;
import javaapplication29.entidades.Libro;
import static javaapplication29.service.AutorService.*;
import static javaapplication29.service.EditorialService.crearEditorial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 54117
 */
public class LibroService {

    //private final static EntityManager em = Persistence.createEntityManagerFactory("JPAParteUnoPU").createEntityManager();
    public static Libro crearLibro() {
        if(Persistence.createEntityManagerFactory("JavaApplication29PU") == null){
            System.out.println("No entra");
        }else{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication29PU");
         EntityManager em2= emf.createEntityManager();
        }
        EntityManager em = null;
        
        Libro librito = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el titulo del libro ?");
        librito.setTitulo(leer.next());
        System.out.println("Cual es el año de escritura del libro ?");
        librito.setAnio(leer.nextInt());
        librito.setAlta(true);
        librito.setAutor(crearAutor());
        librito.setEditorial(crearEditorial());
        System.out.println("Cuantos ejemplares existen ?");
        librito.setEjemplares(leer.nextInt());
        librito.setEjemplaresRestantes(librito.getEjemplares());
        librito.setEjemplaresPrestados(0);
        em.getTransaction().begin();
        em.persist(librito);
        em.getTransaction().commit();
        return librito;
    }

    public static Libro prestamo() {
        EntityManager em = Persistence.createEntityManagerFactory("JPAParteUnoPU").createEntityManager();
        System.out.println("Que libro queres sacar ?");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombreLibro = leer.next();

        Libro libro = (Libro) em.createQuery("SELECT * FROM libro WHERE titulo =" + nombreLibro)
                .getSingleResult();
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
        return libro;
    }

}