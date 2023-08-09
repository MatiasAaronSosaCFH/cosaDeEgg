/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas73;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author 54117
 */
public class Practicas73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<String> map = new HashSet();
        map.add("Matias");
        map.add("German");
        map.add("Araceli");
        TreeSet mapa = new TreeSet(map);
        
        System.out.println(mapa);
    }
    
}
