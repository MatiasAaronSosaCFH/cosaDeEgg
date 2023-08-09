/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.ParDeNumeros;

/**
 *
 * @author 54117
 */
public class ParDeNumerosService {
    
    public static void mostrarValores(ParDeNumeros pares){
        System.out.println("Los numeros guardados son: A = " + pares.getNum1() + " B = " + pares.getNum2());
    }
    
    public static double devolverMayor(ParDeNumeros pares){
        double mayor = 0;
        
        if(pares.getNum1() > pares.getNum2()){
            mayor = pares.getNum1();
        }else{
            mayor = pares.getNum2();
        }
        return mayor;
    }
    
    public static double devolverMenor(ParDeNumeros pares){
        double menor = 0;
        
        if(pares.getNum1() < pares.getNum2()){
            menor = pares.getNum1();
        }else{
            menor = pares.getNum2();
        }
        return menor;
    }
    
    public static void calcularPotencia(ParDeNumeros pares){
        double aux = Math.pow(Math.round(devolverMayor(pares)),Math.round(devolverMenor(pares)));
        
        System.out.println("La potencia del numero mayor es: " + aux);
    }
    
    public static void calcularRaiz(ParDeNumeros pares){
        
        double aux = Math.sqrt(Math.abs(devolverMenor(pares)));
        
        System.out.println("La raiz cuadrada de el menor es: " + aux);
    }
}
