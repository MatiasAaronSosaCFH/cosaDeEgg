/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package genericsclase4.DAO;

import genericsclase4.entidades.Persona;

/**
 *
 * @author 54117
 */
public interface PersonaDAO extends CRUD<Persona>{

    void adoprat(<? extends T>);
}
