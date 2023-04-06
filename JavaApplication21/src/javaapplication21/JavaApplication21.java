/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author 54117
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una letra");
        
        String esONoEsVocal = leer.nextLine();
        
        if(Matches(esONoEsVocal)){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
    
    public static Boolean Matches(final String imput){
        
        final Pattern pattern = Pattern.compile("a+|e+|i+|o+|u+|A+|E+|I+|O+|U+", Pattern.CASE_INSENSITIVE);
        
        final Matcher matcher = pattern.matcher(imput);
        
        return matcher.matches();
    }
    
}
