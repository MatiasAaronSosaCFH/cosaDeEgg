/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Vehiculos;

/**
 *
 * @author 54117
 */
public interface Clasificacion <T extends Vehiculos>{
    
    String clasificarVehiculos(T t);
    
}
