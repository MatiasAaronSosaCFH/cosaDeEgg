/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.NIF;

/**
 *
 * @author 54117
 */
public class NIFService {

    private String[] listaLetra = new String[22];

    public static void rellenarLista(String[] lista) {
        for (int i = 0; i < 22; i++) {
            switch (i) {
                case 0:
                    lista[i] = "T";
                    break;
                case 1:
                    lista[i] = "R";
                    break;
                case 2:
                    lista[i] = "W";
                    break;
                case 3:
                    lista[i] = "A";
                    break;
                case 4:
                    lista[i] = "G";
                    break;
                case 5:
                    lista[i] = "M";
                    break;
                case 6:
                    lista[i] = "Y";
                    break;
                case 7:
                    lista[i] = "F";
                    break;
                case 8:
                    lista[i] = "P";
                    break;
                case 9:
                    lista[i] = "D";
                    break;
                case 10:
                    lista[i] = "X";
                    break;
                case 11:
                    lista[i] = "B";
                    break;
                case 12:
                    lista[i] = "N";
                    break;
                case 13:
                    lista[i] = "J";
                    break;
                case 14:
                    lista[i] = "Z";
                    break;
                case 15:
                    lista[i] = "S";
                    break;
                case 16:
                    lista[i] = "Q";
                    break;
                case 17:
                    lista[i] = "V";
                    break;
                case 18:
                    lista[i] = "H";
                    break;
                case 19:
                    lista[i] = "L";
                    break;
                case 20:
                    lista[i] = "C";
                    break;
                case 21:
                    lista[i] = "K";
                    break;
                case 22:
                    lista[i] = "E";
                    break;
                default:
                    System.out.println("Caracter no valido");

            }
        }
    }

    public String crearNif(NIF nif) {

        rellenarLista(listaLetra);
        String letra = "";
        int i = (int)nif.getDNI() % 23;
        letra = listaLetra[i];
        
        return letra;
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDNI() + crearNif(nif));
    }
}
