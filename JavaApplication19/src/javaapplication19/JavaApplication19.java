/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Connection conexion = null;
        try {
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria","root","root");
            
//            Statement declaracion = conexion.createStatement();
//            
//            ResultSet resultado = declaracion.executeQuery("SELECT * FROM producto");
//            
//            while(resultado.next()){
//                System.out.println(resultado.getString("nombre") + " " + resultado.getString("codigo_producto") + " " + resultado.getString("precio_venta"));
//            }
            
        } catch (SQLException ex) {
            System.out.println("NO CONECTA!!");
            //Logger.getLogger(JavaApplication19.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        String consulta = "SELECT nombre FROM producto WHERE precio_venta >100";
        
        try {
            
            PreparedStatement declaracionDos = conexion.prepareStatement("SELECT nombre,codigo_producto,proveedor FROM producto WHERE precio_venta > ? AND cantidad_en_stock > ? ");
            
            declaracionDos.setInt(1, 100);
            declaracionDos.setInt(2, 1);
            
            ResultSet resultadoDos = declaracionDos.executeQuery();
            
            while(resultadoDos.next()){
                System.out.println(resultadoDos.getString(1) +
                        " " +
                        resultadoDos.getString(2) +
                        " " +
                        resultadoDos.getString(3));
            }
            resultadoDos.close();
            
            System.out.println("");
            System.out.println("EJECUCION SEGUNDA CONSULTA-------------------------------------------------");
            System.out.println("");
            
            
            declaracionDos.setInt(1, 50);
            declaracionDos.setInt(2, 4);
            
            resultadoDos = declaracionDos.executeQuery();
            
            while(resultadoDos.next()){
                System.out.println(resultadoDos.getString(1) +
                        " " +
                        resultadoDos.getString(2) +
                        " " +
                        resultadoDos.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication19.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
