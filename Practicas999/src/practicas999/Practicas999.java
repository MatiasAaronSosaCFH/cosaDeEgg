/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas999;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 54117
 */
public class Practicas999 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String patron = "@";
        String mail = "matiasaaronsosa@1996gmail.com";
        Pattern exprexion = Pattern.compile(patron, Pattern.CASE_INSENSITIVE);
        Matcher matchs  = exprexion.matcher(mail);
        System.out.println(matchs.end());
        // ^ empieza con
        // $ termina en
        // [] dentro van patrones como 0-9 que indica que pueden ser numeros de 0 a 9
        // {} cantidad de los patrones en corchetes
        // * busca 0 o mas
        // + busca 1 o mas
        // ? puede o no estar el patron anterior 
        // (abc|def) busca abc o def si encuentra cualquiera de los 2 da true
        // . cualquier caracter
        // \\ caracter de escape eje: +\\. que siga con un punto
       
    }
    
}
