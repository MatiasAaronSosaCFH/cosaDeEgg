/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicasuml;

import entidades.Bicicleta;
import entidades.Coche;

/**
 *
 * @author 54117
 */
public class PracticasUml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche cochecito = new Coche();
        String[] nombresitos = cochecito.getNombres();
        
        
//        cochecito.setNombre("Matias");
//        String nombress = cochecito.getNombre();
//        nombress = "Malevo";
//        
//        System.out.println(nombress);
//        System.out.println(cochecito.getNombre());
//        
//        for (int i = 0; i < 5; i++) {
//            nombresitos[i] = String.valueOf(i);
//        }
//        
//        System.out.println("Imprimiendo valor de array nombresitos");
//        for(String nombre : nombresitos){
//            System.out.println(nombre);
//        }
//        
//        System.out.println("---------------------------------------");
//        
//        
//        System.out.println("Imprimiendo valor de array en coche");
//        for(String nombre : cochecito.getNombres()){
//            System.out.println(nombre);
//        }

          cochecito.setBici(new Bicicleta());
          Bicicleta bici = cochecito.getBici();
          
          System.out.println(cochecito.getBici());
          System.out.println(bici);
          
          
          bici.setColor("Negro");
          bici.setLargo(100);
          
          System.out.println(cochecito.getBici());
          System.out.println(bici);
          
          Bicicleta biciDos = new Bicicleta(50,"Amarillo");
          
          bici = biciDos;
          
          bici.setLargo(50);
          
          System.out.println(bici);
          System.out.println(cochecito.getBici());
          

    }
    
}
