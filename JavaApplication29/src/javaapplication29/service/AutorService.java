/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication29.service;

import java.util.Scanner;
import javaapplication29.entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author 54117
 */
public class AutorService {
    
    
    private final static EntityManager em = Persistence.createEntityManagerFactory("JavaApplication29PU").createEntityManager();
    
    protected static Autor crearAutor(){
        Autor autor = new Autor();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el nombre de el autor ?");
        autor.setNombre(leer.next());
        autor.setAlta(true);
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        return autor;
    }
}
