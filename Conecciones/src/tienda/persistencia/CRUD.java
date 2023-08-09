/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.persistencia;

import java.util.List;

/**
 *
 * @author 54117
 * @param <T>
 */
public interface CRUD<T> {
    
    List<T> leer() throws Exception;
    T leerPorId(int id) throws Exception;
    void registrar(T t) throws Exception;
    void actualizar(T t) throws Exception;
    void eliminar(T t) throws Exception;
}
