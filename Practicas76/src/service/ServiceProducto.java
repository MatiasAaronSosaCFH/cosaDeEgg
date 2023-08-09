/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class ServiceProducto {

    public static void ingresarProductos(HashMap<String, Double> mapa) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        do {
            System.out.println("Cual es el nombre de el producto a ingresar ?");
            String product = leer.next();
            System.out.println("Cual es el precio de el producto ?");
            Double precio = leer.nextDouble();

            mapa.put(product, precio);

            System.out.println("Queres seguir agregando productos ? (S/N)");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Seguimos agregando productos...");
            } else if (resp.equalsIgnoreCase("n")) {
                System.out.println("Gracias por traer los productos");
                salir = true;
            } else {
                System.out.println("Caracter no valido el programa terminara");
                salir = true;
            }
        } while (!salir);
    }

    public static void modificarPrecio(HashMap<String, Double> mapa) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que producto queres cambiar el precio ?");
        String product = leer.next();
        if (!mapa.containsKey(product)) {
            System.out.println("El producto no esta en el stock");
        } else {
            System.out.println("Ingrese el precio nuevo");
            Double precioNuevo = leer.nextDouble();

            mapa.replace(product, mapa.get(product), precioNuevo);
        }

        System.out.println("Queres modificar otro producto ?");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            modificarPrecio(mapa);
        } else if (resp.equalsIgnoreCase("n")) {
            System.out.println("Gracias por usar nuestro software");
        } else {
            System.out.println("Precios actualizados correctamente ");
        }

    }

    public static void removerProducto(HashMap<String, Double> mapa) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Que producto desea remover ?");
        String product = leer.next();

        if (!mapa.containsKey(product)) {
            System.out.println("El producto no esta");
        }else{
            mapa.remove(product);
            System.out.println("Se removio el producto exitosamente!!");
        }
        
        System.out.println("Queres remover otro producto ?");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("s")) {
            removerProducto(mapa);
        } else if (resp.equalsIgnoreCase("n")) {
            System.out.println("Gracias por usar nuestro software");
        } else {
            System.out.println("Precios actualizados correctamente ");
        }

    }
    
    public static void mostrarStock(HashMap<String, Double> mapa){
        
        for(Map.Entry<String, Double> product : mapa.entrySet()){
            System.out.println("Producto: " + product.getKey() + "\n" 
                    + "Precio: " + product.getValue());
        }
        
    }
    
    public static void menuPrincipal(){
        HashMap<String, Double> mapa = new HashMap<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean salir = false;
        do {            
            System.out.println("Bienvenido a nuestro supermercado!!"
                    +"\n" +"Que opcion vas a elegir ? ");
            
            System.out.println("1.Agregar producto"
                    +"\n"+ "2.Modificar precio"
                    +"\n"+ "3.Eliminar producto"
                    +"\n"+ "4.Mostrar productos"
                    +"\n"+ "5.Salir");
            int resp = leer.nextInt();
            
            switch(resp){
                case 1:
                    ingresarProductos(mapa);
                    break;
                case 2:
                    modificarPrecio(mapa);
                    break;
                case 3:
                    removerProducto(mapa);
                    break;
                case 4:
                    mostrarStock(mapa);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar MatsSoftware");
                    salir = true;
                    break;
                default:
                    System.out.println("El programa se reiniciara...");
            }
            
        } while (!salir);
    }
}
