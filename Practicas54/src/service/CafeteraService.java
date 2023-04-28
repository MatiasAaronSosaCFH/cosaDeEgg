/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Cafetera;

/**
 *
 * @author 54117
 */
public class CafeteraService {

    public static void llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCantidadMaxima());
    }

    public static void servirTaza(int capTaza, Cafetera caf) {

        if (capTaza > caf.getCantidadActual()) {

            System.out.println("La cafetera no tenia tanto cafe, se lleno con " + (capTaza * caf.getCantidadActual() / 100) + "%" );
            caf.setCantidadActual(0);
        } else {
            
            System.out.println("Se lleno la taza por completo!!");
            caf.setCantidadActual(caf.getCantidadActual() - capTaza);
        }
    }

    public static void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
    }

    public static void agregarCafe(int cafe, Cafetera caf) {
        
        if(cafe > caf.getCantidadMaxima()){
            System.out.println("Esa camtidad es mayor al maximo "
                    + "\n" +"se lleno la cafetera al maximo = " + caf.getCantidadMaxima() + "ml");
            llenarCafetera(caf);
        }else{
            
            caf.setCantidadActual(caf.getCantidadActual() + cafe);
            System.out.println("La cantidad actual es = " + caf.getCantidadActual());
        }
        
    }
}
