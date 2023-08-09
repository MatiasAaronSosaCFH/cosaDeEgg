/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.Conexion;
import tienda.persistencia.DAOFabricante;

/**
 *
 * @author 54117
 */
public class DAOFabricanteImpl extends Conexion implements DAOFabricante{

    @Override
    public List<Fabricante> leer() throws Exception {
        List<Fabricante> lista = null;
        
        try{
            
            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT * FROM fabricante");
            ResultSet resultado = declaracion.executeQuery();
            
            while(resultado.next()){
                Fabricante fab = new Fabricante();
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));
                lista.add(fab);
            }
            declaracion.close();
            resultado.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.desconectar();
        }
        return lista;
    }

    @Override
    public Fabricante leerPorId(int PK) throws Exception {
        
        Fabricante fab = new Fabricante();
        try{
            
            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("SELECT * FROM fabricante WHERE codigo = ?");
            
            declaracion.setInt(1, PK);
            
            ResultSet resultado  = declaracion.executeQuery();
            
            while(resultado.next()){
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));
            }
            declaracion.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.desconectar();
        }
        return fab;
    }

    @Override
    public void registrar(Fabricante t) throws Exception{
        
        try{
            
            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("INSERT INTO fabricante"
                                                                         + "(codigo,nombre) VALUES (?,?)");
            declaracion.setInt(1, t.getCodigo());
            declaracion.setString(2, t.getNombre());
            declaracion.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.desconectar();
        }
    }

    @Override
    public void actualizar(Fabricante t) throws Exception{
       
        try{
            
            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("UPDATE fabricante set "
                                                                                    + "nombre = ?,"
                                                                                    + "WHERE id = ?");
            
            declaracion.setString(1, t.getNombre());
            declaracion.setInt(2, t.getCodigo());
            declaracion.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Fabricante t) throws Exception{
        
        try{
            
            this.conectar();
            PreparedStatement declaracion = this.conexion.prepareStatement("DELETE FROM fabricante WHERE codigo = ?");
            
            declaracion.setInt(1, t.getCodigo());
            declaracion.close();
        }catch(Exception ex){
            throw ex;
        }finally{
            this.desconectar();
        }
    }
    
}
