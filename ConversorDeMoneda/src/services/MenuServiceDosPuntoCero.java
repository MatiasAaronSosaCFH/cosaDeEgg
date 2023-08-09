/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entidades.Conversores;
import java.util.ArrayList;
import enums.*;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author 54117
 */
public class MenuServiceDosPuntoCero {
    
    private static Conversores crearDivisaConCambio(){
        Conversores convertito = new Conversores();
        
        String[] valores = new String[LISTA_DE_NOMBRES_DIVISAS.size()];
        cargaValores(valores);
        JComboBox comboxing = new JComboBox(valores);
        
        String tipoDivisa = JOptionPane.showInputDialog("Cual es el nombre de la divisa que quieres agregar ?");
        
        JOptionPane.showOptionDialog(null,comboxing,"A cual de las divisas que existen quieres compararla ?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        
        int posicionVector = comboxing.getSelectedIndex();
        Double cambio = Double.parseDouble(JOptionPane.showInputDialog("Ingerese cuando vale una unidad de " + tipoDivisa + " a " + valores[posicionVector]));
        
        LISTA_DE_NOMBRES_DIVISAS.add(tipoDivisa);
        
        convertito.setCambio(cambio);
        convertito.setNombreDivisa(tipoDivisa + " a " + valores[posicionVector]);
        convertito.setPosicion(indexDentroDeMiLista); indexDentroDeMiLista++;
        
        return convertito;
    }
    
    private static void cargaValores(String[] lista){
        
        Iterator iterador = LISTA_DE_NOMBRES_DIVISAS.iterator();
        int cont = 0;
        
        while(iterador.hasNext()){
            
            lista[cont] = (String) iterador.next();
            cont++;
        }
        
        
    }
    
    private static final ArrayList<Conversores> LISTA_DE_CONVERSORES = new ArrayList<>();
    private static final ArrayList<String> LISTA_DE_NOMBRES_DIVISAS = new ArrayList<>();
    private static int indexDentroDeMiLista = 30;
    
    private static void primerasDivisas(){
        
        LISTA_DE_CONVERSORES.add(new Conversores(0.00378,0,"Peso Argentino a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00336,1,"Peso Argentino a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00288,2,"Peso Argentino a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.52276,3,"Peso Argentino a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(4.78483,4,"Peso Argentino a Won Sur-Coreano"));
        
        LISTA_DE_CONVERSORES.add(new Conversores(264.678,5,"Dolar a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.89045,6,"Dolar a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.76366,7,"Dolar a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(138.787,8,"Dolar a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1268.14,9,"Dolar a Won Sur-Coreano"));
        
        LISTA_DE_CONVERSORES.add(new Conversores(296.172,10,"Euro a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.12245,11,"Euro a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.85705,12,"Euro a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(155.787,13,"Euro a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1423.43,14,"Euro a Won Sur-Coreano"));
        
        LISTA_DE_CONVERSORES.add(new Conversores(347.029,15,"Libra Esterlina a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.30918,16,"Libra Esterlina a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.16594,17,"Libra Esterlina a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(181.704,18,"Libra Esterlina a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1660.23,19,"Libra Esterlina a Won Sur-Coreano"));
        
        LISTA_DE_CONVERSORES.add(new Conversores(1.91261,20,"Yen Japones a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0072,21,"Yen Japones a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00641,22,"Yen Japones a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0055,23,"Yen Japones a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(9.13636,24,"Yen Japones a Won Sur-Coreano"));
        
        LISTA_DE_CONVERSORES.add(new Conversores(0.2087,25,"Won Sur-Coreano a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00079,26,"Won Sur-Coreano a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0007,27,"Won Sur-Coreano a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0006,28,"Won Sur-Coreano a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.10924,29,"Won Sur-Coreano a Yen Japones"));
        
        LISTA_DE_NOMBRES_DIVISAS.add("Peso Argentino");
        LISTA_DE_NOMBRES_DIVISAS.add("Dolar");
        LISTA_DE_NOMBRES_DIVISAS.add("Euro");
        LISTA_DE_NOMBRES_DIVISAS.add("Libra Esterlina");
        LISTA_DE_NOMBRES_DIVISAS.add("Yen Japones");
        LISTA_DE_NOMBRES_DIVISAS.add("Won Sur-Coreano");
    }
}
