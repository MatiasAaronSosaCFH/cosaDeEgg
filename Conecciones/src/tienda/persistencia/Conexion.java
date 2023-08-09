/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 54117
 */
public class Conexion {

    protected static Connection conexion = null;
    
    private final String direccionBBDD = "jdbc:mysql://localhost:3306/tienda";
    private final String usuario = "root";
    private final String contrasenha = "root";
    
    
    public void conectar() throws Exception {

        try {
            conexion = DriverManager.getConnection(direccionBBDD, usuario, contrasenha);
        } catch (SQLException ex) {
            throw ex;
        }

        if (conexion != null) {
            System.out.println("La conexion fue exitosa");
        } else {
            System.out.println("La conexion no tuvo exito");
        }
    }

    public void desconectar() throws SQLException {
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }

//    /**
//     * 
//     * @param consulta Consulta completa que se ejecuta y lleva el valor de los 
//     *              registros a un objeto ResultSet que es el que se retorna
//     * @return
//     * @throws SQLException Este objeto que se retorna es el resultado de la consulta
//     *                      con toda la informacion dee los registros 
//     */
//    public static ResultSet realizarConsulta(String consulta) throws SQLException{
//
//        PreparedStatement declaracion = conexion.prepareStatement(consulta);
//        ResultSet resulta = declaracion.executeQuery();
//        return resulta;
//    }
//
//    /**
//     * Este metodo recibe 4 parametros de tipo String que modifican una consulta
//     * interna que modifica un registro con un nuevo valor
//     * 
//     * 
//     * @param tabla nombre de tabla a modificar su registro
//     * @param columna nombre columna a modificar
//     * @param nuevoValor el valor que va a tener luego de hacer la modificacion
//     * @param condicion un numero dentro de un String que va a ser el determinado 
//     *                  de el registro a modificar
//     * @throws SQLException 
//     */
//    public static void modificarProductos(String tabla, String columna, String nuevoValor,String condicion) throws SQLException{
//        String update = "UPDATE producto SET nombre  = 'Notebook 4.0' WHERE codigo = " + condicion;
//        PreparedStatement declaracion = conexion.prepareStatement(update);
//        declaracion.execute();
//    }
    
}
