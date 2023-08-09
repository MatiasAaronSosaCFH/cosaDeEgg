/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas999;

/**
 *
 * @author 54117
 */
public class OtrasPracticas {
    
    // Patron para validar email"[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"
    // Prtron para validad numeros de telefono "\\+\\d{1,2}\\s\\(\\d{3}\\)\\s\\d{3}-\\d{4}"
    // Patron para validad ips "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b"
    // Matcher.start() la posicion donde inicia la coincidencia, 
    // Matcher.end() - 1 la posicion donde termina la coincidencia
    // Matcher.group(1) extrae el grupo de coincidencia 1 y lo retorno como string  eje: "^(.+)@(.+)$"
    // Patron para encontrar palabras repetidas "\\b(\\w*(\\)\\2\\2*\\b"
    // validacion de contraseña "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\w\\d\\s]).+$"
    //          primer termino (?=.*[a-z]) evalua que tenga una o mas minusculas
    //          segundo termino (?=.*[A-Z]) evalua que tenga una o mas mayusculas
    //          tercer termino (?=.*\\d) evalua que tenga uno o mas numeros
    //          cuarto termino (?=.*[^\\w\\d\\s]) evalua que tenga uno o mas caracteres

}   
