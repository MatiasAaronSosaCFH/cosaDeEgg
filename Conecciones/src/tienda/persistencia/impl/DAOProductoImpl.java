/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.Conexion;
import tienda.persistencia.DAOProducto;

/**
 * @author 54117
 */
public class DAOProductoImpl extends Conexion implements DAOProducto {

    @Override
    public List<Producto> leer() throws Exception {
        List<Producto> lista = null;

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT * FROM producto");
            ResultSet resultado = declaracion.executeQuery();

            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt("codigo"));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                lista.add(prod);
            }
            declaracion.close();
            resultado.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
        return lista;
    }

    @Override
    public Producto leerPorId(int PK) throws Exception {

        Producto produ = new Producto();
        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT * FROM producto WHERE codigo = ?");

            declaracion.setInt(1, PK);

            ResultSet resultado = declaracion.executeQuery();

            while (resultado.next()) {
                produ.setCodigo(resultado.getInt("codigo"));
                produ.setNombre(resultado.getString("nombre"));
                produ.setPrecio(resultado.getDouble("precio"));
                produ.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
            }
            declaracion.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
        return produ;
    }

    @Override
    public void registrar(Producto t) throws Exception {

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("INSERT INTO producto"
                    + "(codigo,nombre,precio,codigo_fabricante) VALUES (?,?,?,?)");
            declaracion.setInt(1, t.getCodigo());
            declaracion.setString(2, t.getNombre());
            declaracion.setDouble(3, t.getPrecio());
            declaracion.setInt(4, t.getCodigoFabricante());
            declaracion.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void actualizar(Producto t) throws Exception {

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("UPDATE producto set "
                    + "nombre = ?,"
                    + "precio = ?"
                    + "codigo_fabricante"
                    + "WHERE id = ?");

            declaracion.setString(1, t.getNombre());
            declaracion.setDouble(2, t.getPrecio());
            declaracion.setInt(3, t.getCodigoFabricante());
            declaracion.setInt(4, t.getCodigo());
            declaracion.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Producto t) throws Exception {

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("DELETE FROM producto WHERE codigo = ?");

            declaracion.setInt(1, t.getCodigo());
            declaracion.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Double traerPromedioPrecio() throws SQLException, Exception {
        double num = 0.0;

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT AVG(precio) AS precio FROM producto");
            ResultSet resultado = declaracion.executeQuery();

            if (resultado.next()) {
                num = resultado.getDouble("precio");
            }

            declaracion.close();
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }

        return num;
    }

    @Override
    public List<Producto> retornandoRegistros(String query) throws SQLException, Exception {

        ArrayList<Producto> productos = new ArrayList();

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement(query);
            ResultSet resultado = declaracion.executeQuery();

            while (resultado.next()) {

                Producto prod = new Producto(resultado.getInt(1),
                        resultado.getString(2),
                        resultado.getDouble(3),
                        resultado.getInt(4));

                productos.add(prod);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
        return productos;
    }

    @Override
    public boolean isPresent(Producto product) throws Exception {
        boolean isPresent = false;

        try {

            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT * FROM product");
            ResultSet resultado = declaracion.executeQuery();

            while (resultado.next()) {

                Producto prod = new Producto(resultado.getInt(1),
                        resultado.getString(2),
                        resultado.getDouble(3),
                        resultado.getInt(4));

                isPresent = prod.equals(product);
                
                if(isPresent) break;
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            this.desconectar();
        }
        return isPresent;
    }

    
    
}
