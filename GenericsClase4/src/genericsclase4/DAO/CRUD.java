/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package genericsclase4.DAO;

import java.util.List;

/**
 *
 * @author 54117
 */
public interface CRUD <T>{
    
    List<T> findAll();
    T findByID(int id);
    void update(T t);
    void delete(T t);
    void save(T t);
    
}
