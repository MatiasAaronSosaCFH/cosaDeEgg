/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tienda.persistencia;

import java.sql.SQLException;
import java.util.List;
import tienda.entidades.Producto;

/**
 *
 * @author 54117
 */
public interface DAOProducto extends CRUD<Producto>{
    
    Double traerPromedioPrecio()throws SQLException,Exception;
    List<Producto> retornandoRegistros(String query)throws SQLException,Exception;
    boolean isPresent(Producto prod)throws Exception;
    
}
