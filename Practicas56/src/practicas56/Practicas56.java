/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas56;

import entidad.Persona;
import java.util.ArrayList;
import static service.PersonaService.*;

/**
 *
 * @author 54117
 */
public class Practicas56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        int[] imcPersonas = new int[4];
        boolean[] sonMayores = new boolean[4];

        ArrayList<Persona> arrayPerson = new ArrayList<Persona>();
        arrayPerson.add(persona1);
        arrayPerson.add(persona2);
        arrayPerson.add(persona3);
        arrayPerson.add(persona4);

        int cont = 0;
        for (Persona per : arrayPerson) {

            crearPersona(per);
            imcPersonas[cont] = (calcularIMC(per));
            sonMayores[cont] = (esMayorDeEdad(per));

            cont++;
        }

        int contMay = 0;
        int contMen = 0;
        
        int contImcMen = 0;
        int contImcIgu = 0;
        int contImcMay = 0;

        for (int i = 0; i < 4; i++) {

            if (sonMayores[i]) {
                contMay++;
            } else {
                contMen++;
            }

            if (imcPersonas[i] == -1) {
                contImcMen++;
            } else if (imcPersonas[i] == 0) {
                contImcIgu++;
            } else {
                contImcMay++;
            }
        }
        
        System.out.println("El porcentaje de imc menor al estandar de las 4 personas es: " + (contImcMen * 100 / 4));
        System.out.println("El porcentaje de imc estandar de las 4 personas es: " + (contImcIgu * 100 / 4));
        System.out.println("El porcentaje de imc mayor al estandar de las 4 personas es: " + (contImcMay * 100 / 4));
        System.out.println("El porcentaje personas mayores de edad de las 4 es: " + (contMay * 100 / 4));
        System.out.println("El porcentaje personas menores de edad de las 4 es: " + (contMen * 100 / 4));
    }
}
