/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Raices;

/**
 *
 * @author 54117
 */
public class RaicesService {
    
    public static double getDiscriminante(Raices raiz){
        double discriminante =0;
        
        int a = raiz.getA();
        int b = raiz.getB();
        int c = raiz.getC();
        
        discriminante = Math.pow(a, 2) - 4*a*c;
        return discriminante;
    }
    
    public static boolean tieneRaices(Raices raiz){
        boolean tiene = false;
        
        if(getDiscriminante(raiz) >= 0){
            tiene = true;
        }
        return tiene;
    }
    
    public static boolean tieneRaiz(Raices raiz){
        boolean tiene = false;
        
        if(getDiscriminante(raiz) == 0){
            tiene = true;
        }
        return tiene;
    }
    
    
}
