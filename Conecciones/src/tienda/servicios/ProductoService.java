/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author 54117
 */
public class ProductoService {
    
    public static Producto crearProducto(){
        
        Producto produ = new Producto();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el codigo del producto");
        produ.setCodigo(leer.nextInt());
        System.out.println("Ingrese el nombre del producto");
        produ.setNombre(leer.next());
        System.out.println("Ingrese el precio");
        produ.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el codigo del fabricante");
        produ.setCodigoFabricante(leer.nextInt());
        
        return produ;
    }
    
}
