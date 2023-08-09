/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpaparteuno.service;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpaparteuno.entidades.Editorial;

/**
 *
 * @author 54117
 */
public class EditorialService {
    
    
    private final static EntityManager em = Persistence.createEntityManagerFactory("JPAParteUnoPU").createEntityManager();
    
    public static Editorial crearEditorial(){
        Editorial edit = new Editorial();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cual es el nombre de la editorial ?");
        edit.setNombre(leer.next());
        edit.setAlta(true);
        em.getTransaction().begin();
        em.persist(edit);
        em.getTransaction().commit();
        return edit;
    }
}
