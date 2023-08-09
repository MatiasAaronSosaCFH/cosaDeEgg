/*
Se necesita una aplicación para una tienda en la 
cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, 
modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de
valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package practicas76;

import java.util.HashMap;
import static service.ServiceProducto.menuPrincipal;

/**
 *
 * @author 54117
 */
public class Practicas76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        HashMap<String, Double> mapaProductos = new HashMap();
//        
//        mapaProductos.put("Harina",300.50);
//        mapaProductos.put("Levadura",150.50);
//        mapaProductos.put("Salsa", 260.50);
//        
//        
//        System.out.println(mapaProductos);}
    
          menuPrincipal();
    }
    
}
