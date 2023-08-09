/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpaparteuno;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpaparteuno.entidades.Libro;
import static jpaparteuno.service.LibroService.*;
/**
 *
 * @author 54117
 */
public class JPAParteUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        EntityManager em = Persistence.createEntityManagerFactory("JPAParteUnoPU").createEntityManager();
//        
//        em.createQuery("DROP TABLE autor");

          Date fecha = new Date(99,13,28);

          System.out.println(fecha);
    }
    
}
