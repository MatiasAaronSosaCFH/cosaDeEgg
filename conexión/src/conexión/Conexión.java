/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexión;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class Conexión {

    public static void main(String[] args) {

        //todo el codigo va dentro de un try/cath para evitar excepciones
        
        try {
            /**
             * Aca generas una conexion creando un objeto de tipo Connection
             */
            String driver = "com.mysql.jdbc.Driver";//rutadriver
            String dataBase = "ruta Base de datos";
            String usuario = "usuario";
            String pasword = "contraseña";
            
            //creamos objeto Connection igualado a null para checkear mediante try/catch si la coneccion funciona
            Connection conexion = null;
            try {
                
                //ingresamos los valores previamente generados
                Class.forName(driver);
                conexion = DriverManager.getConnection(dataBase, usuario, pasword);
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //CREATE
            //Usamos un objeto de tipo PreparedStatement para generar una consulta, las consultas son strings con la sintaxis de Sql
            String consulta = "INSERT INTO doctor (nombre_apellido, usuario, contraseña, nivel) VALUES (?,?,?,?)";
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            
            
            //Seteamos la consulta que usamos operadores comodin (´?´) es el signo de interrogacion, cada valor equivale a la posicion de 
            //la cadena de operadores comodines 
            declaracion.setString(1, "Matias Sosa");
            declaracion.setString(2, "akucfh");
            declaracion.setString(3, "conejito");
            declaracion.setInt(4, 1);
            declaracion.execute();
            
            //READE
            //leemos la tabla doctor(previamente generada en la base de datos)
            String consulta2 = "SELECT * FROM doctor";

             declaracion = conexion.prepareStatement(consulta2);
            
            //Usamos el objeto resulset para imprimir el resultado en string
            ResultSet resultado = declaracion.executeQuery();

            while (resultado.next()) {
                System.out.println(resultado.getString("nombre_apellido"));
                System.out.println(resultado.getInt("nivel"));
            }
            
            
            //UPDATE
            //modificamos el el valor donde vamos a modificar el id
            String cambio = "nombre_apellido";
            
            String consulta3 = "UPDATE doctor SET " + cambio + " = ? WHERE id = 6";

            declaracion = conexion.prepareStatement(consulta3);
            declaracion.setString(1, "Mauri piolita");
            declaracion.execute();
            
            
            declaracion = conexion.prepareStatement(consulta2);
            
            
            resultado = declaracion.executeQuery();
            
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre_apellido"));
                System.out.println(resultado.getInt("nivel"));
            }
            
            
            //DELETE
            //Borramos el registro donde el id sea = a 1 
            String consulta4 = "DELETE FROM doctor WHERE id = 1";
            
            declaracion = conexion.prepareStatement(consulta4);
            declaracion.execute();
            
            
            resultado.close();
            declaracion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
