/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpaparteuno.service;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpaparteuno.entidades.Autor;

/**
 *
 * @author 54117
 */
public class AutorService {
    
    
    private final static EntityManager em = Persistence.createEntityManagerFactory("JPAParteUnoPU").createEntityManager();
    
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
