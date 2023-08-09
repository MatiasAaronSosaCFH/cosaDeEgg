/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import tienda.entidades.Producto;
import tienda.persistencia.DAOFabricante;
import tienda.persistencia.impl.DAOFabricanteImpl;
import tienda.persistencia.DAOProducto;
import tienda.persistencia.impl.DAOProductoImpl;
import static tienda.servicios.ProductoService.*;

/**
 *
 * @author 54117
 */
public class Menu {

    public static void menuInicio() {


    }

    public int eleccion() {

        String[] listaDeOpciones = {"Conocer todos nuestros productos",
            "Ver una lista mas detallada con precios",
            "Productos precio medio",
            "Listar portatiles",
            "Producto en descuento",
            "Agregar productos al stock",
            "Agregar informacion del fabricante",
            "Modificar datos de producto"};

        JComboBox opciones = new JComboBox(listaDeOpciones);

        JOptionPane.showOptionDialog(null, opciones, "Que accion queres realizar ?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.CLOSED_OPTION, null, null, null);

        int seleccion = opciones.getSelectedIndex();

        return seleccion;
    }
    
    public void imprimirListaNombresProductos() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        ArrayList<Producto> productos = (ArrayList)prod.leer();
        
        for(Producto produc : productos){
            System.out.println(produc.getNombre());
        }
    }
    
    public void imprimirListaCompletaProductos() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        ArrayList<Producto> productos = (ArrayList)prod.leer();
        
        for(Producto produc : productos){
            System.out.println(produc.toString());
        }
    }

    public static void imprimirPrecioPromedio() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        double numero = prod.traerPromedioPrecio();
        
        System.out.println(numero);
    }
    
    public static void imprimirPortatiles()throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        ArrayList<Producto> productos = (ArrayList)prod.retornandoRegistros("SELECT * FROM producto WHERE nombre LIKE '%Portátil%'");
        
        productos.forEach((produ) -> System.out.println(produ));
    }
    
    public static void imprimirProductosEnRebaja() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        ArrayList<Producto> productos = (ArrayList)prod.retornandoRegistros("SELECT * FROM producto WHERE precio BETWEEN 120 AND 202");
        
        productos.forEach((produ) -> System.out.println(produ));
    }
    
    
    public static void imprimirProductoBarato() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        ArrayList<Producto> productos = (ArrayList)prod.retornandoRegistros("SELECT * FROM producto WHERE precio = (SELECT MIN(precio) FROM producto)");
        
        productos.forEach((produ) -> System.out.println(produ));
        
    }
    
    public void agregarProducto() throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        prod.registrar(crearProducto());
    }
    
    public void eliminerProducto()throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        System.out.println("Ingrese los datos de el producto a buscar");
        Producto productito = crearProducto();
        
        if(prod.isPresent(productito)) prod.eliminar(productito);
    }
    
    public void modificarProducto()throws Exception{
        
        DAOProducto prod = new DAOProductoImpl();
        
        System.out.println("Ingrese los datos de el producto a buscar");
        Producto productito = crearProducto();
        
        if(prod.isPresent(productito)){
            
            System.out.println("Ingrese los nuevos valores de el producto");
            productito = crearProducto();
            prod.actualizar(productito);
        }
        
    }
}
