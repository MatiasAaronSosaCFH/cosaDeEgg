/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicasstatic;

import entidad.Empleado;

/**
 *
 * @author 54117
 */
public class PracticasStatic {

    public static void main(String[] args) {
        
        Empleado trabajador1 = new Empleado();
        Empleado trabajador2 = new Empleado();
        Empleado trabajador3 = new Empleado();
        
        
        System.out.println(trabajador1);
        System.out.println(trabajador2);
        System.out.println(trabajador3);
        System.out.println(Empleado.getIdGeneral());
    }
}
