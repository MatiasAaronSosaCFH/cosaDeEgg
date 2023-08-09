package testConnection;

import conexión.Conexión;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {

    public static Connection conexion() {

        // campos de mi objeto conexion. User, password, driver, url a la base de datos
        String driver = "com.mysql.jdbc.Driver";
        String dataBase = "jdbc:mysql://localhost:3306/uba-pacientes";
        String usuario = "root";
        String pasword = "";
        // objeto conexion comienza en null para saber si se conecta
        Connection conexion = null;
        //try catch que de no funcionar la conexion tira una excepcion de tipo NotFoundException
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(dataBase, usuario, pasword);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
        }
        //aca creamos un condicional que si se ejecuta la conexion funciona
        if (conexion != null) {
            System.out.println("Conexion exitosa");
        } else {
            System.out.println("Conexion fallida");
        }
        return conexion;
    }

    public static ResultSet busquedaPorDni(int dni, Connection conexion) throws SQLException {

        String traerPaciente = "SELECT * FROM paciente IF EXISTS WHERE DNI_pasaporte = " + dni;
        PreparedStatement declaracion = conexion.prepareStatement(traerPaciente);

        ResultSet resultado = declaracion.executeQuery();
        return resultado;
    }

    public static void agregarCampo(Connection conexion) {

        try {
            String columna = "nombre_apellido";
            String tipo = "varchar(45)";
            String consulta = "ALTER TABLE paciente ADD COLUMN " + columna + tipo + "NULL";
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void modificarCampo(Connection conexion,String id, String tabla, String campo, String valorDelCampo) {

        try {
            String consulta = "UPDATE " + tabla + " SET " + campo + " = " + valorDelCampo + " WHERE id = " + id;
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void borrarRegistro(Connection conexion,String campo, String tabla, String valorCampo) {

        try {
            String consulta = "DELETE FROM " + tabla + " WHERE " + valorCampo + " = " + valorCampo;
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion = conexion.prepareStatement(consulta);
            declaracion.execute();
        } catch (SQLException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
