/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.Conversores;
import static entidades.Conversores.comparaPosiciones;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author 54117
 */
public class MenuService {

    //----------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------METODO PRINCIPALES-----------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------
    public static void menuInicio() {

        primerasDivisas();

        int eleccion = opcionElegida();
        
        switch (eleccion) {

            case 0:
                System.out.println("Elegio la primera opcion");
                generarCambioDeDivisas();
                break;
            case 1:
                System.out.println("Eligio crear una divisa");
                agregarDivisasALaLista(crearDivisaConCambio());
                break;
        }
        
        int bucle = JOptionPane.showConfirmDialog(null, "Queres volver a empezar ?");
        
        if (bucle == 0) {
            menuInicio();
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema de conversion!!");
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------METODO SECUNDARIOS-----------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------

    private static void agregarDivisasALaLista(Conversores conver){
        LISTA_DE_CONVERSORES.add(conver);
        LISTA_DE_CONVERSORES.sort(comparaPosiciones);
    }
    private static void generarCambioDeDivisas() {
        
        double cambio = metodoConversor(metodoDeSegmentacion());
        String mensajito = "Cuanto de vas a convertir ?";
        
        cambio = cambio * dameCantidad(mensajito);
        JOptionPane.showMessageDialog(null, cambio);
    }

    private static int opcionElegida() {
        String[] opcion = {"Convertir divisa", "Crear nueva conversion"};
        JComboBox<String> opcionesIniciales = new JComboBox<>(opcion);
        JOptionPane.showOptionDialog(null, opcionesIniciales, "Que quieres hacer ? ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        return opcionesIniciales.getSelectedIndex();
    }

    private static double metodoConversor(int eleccion) {
        Double[] listaDeValores = new Double[LISTA_DE_CONVERSORES.size()];
        Iterator iterador = LISTA_DE_CONVERSORES.iterator();
        int cont = 0;
        while (iterador.hasNext()) {
            Conversores conver = (Conversores) iterador.next();
            listaDeValores[cont] = conver.getCambio();
            cont++;
        }
        return listaDeValores[eleccion];
    }

    private static int metodoDeSegmentacion() {
        String[] conversiones = new String[LISTA_DE_CONVERSORES.size()];
        Iterator iterador = LISTA_DE_CONVERSORES.iterator();
        int cont = 0;
        while (iterador.hasNext()) {
            Conversores conver = (Conversores) iterador.next();
            conversiones[cont] = conver.getNombreDivisa();
            cont++;
        }
        JComboBox combito = new JComboBox(conversiones);
        JOptionPane.showOptionDialog(null, combito, "Elige el tipo de cambio que quieres hacer ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        return combito.getSelectedIndex();

    }
    //----------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------METODOS DE CREACION DE NUEVAS DIVISAS----------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------

    private static Conversores crearDivisaConCambio() {

        //Agrega un nuevo objeto de conversion a la lista
        Conversores convertito = new Conversores();

        String[] valores = new String[LISTA_DE_NOMBRES_DIVISAS.size()];
        cargaValores(valores);

        String tipoDivisa = retornaRespuestaNombreDivisa();

        int posicionVector = retornaPosicionElegida(valores);

        String mensaje = "Ingerese cuando vale una unidad de " + tipoDivisa + " a " + valores[posicionVector];
        Double cambio = dameCantidad(mensaje);

        LISTA_DE_NOMBRES_DIVISAS.add(tipoDivisa);

        convertito.setCambio(cambio);
        convertito.setNombreDivisa(tipoDivisa + " a " + valores[posicionVector]);

        return convertito;
    }

    private static String retornaRespuestaNombreDivisa() {

        String resp = JOptionPane.showInputDialog("Cual es el nombre de la divisa que quieres agregar ?");

        if (resp != null) {
            return resp;
        } else {
            System.out.println("El valor ingresado no es valido, intentalo denuevo");
        }
        return retornaRespuestaNombreDivisa();

    }

    private static int retornaPosicionElegida(String[] lista) {

        JComboBox comboxing = new JComboBox(lista);

        JOptionPane.showOptionDialog(null, comboxing, "A cual de las divisas que existen quieres compararla ?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        return comboxing.getSelectedIndex();
    }

    private static void cargaValores(String[] lista) {

        Iterator iterador = LISTA_DE_NOMBRES_DIVISAS.iterator();
        int cont = 0;

        while (iterador.hasNext()) {

            lista[cont] = (String) iterador.next();
            cont++;
        }
    }

    private static Double dameCantidad(String mensaje) {
        try {
            //Ingreso de cantidad
            return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        } catch (NumberFormatException e) {
            System.out.println("Tipo de dato ingresado NO VALIDO, ingrese un numero");
            return dameCantidad(mensaje);
        }
    }
    
//PRUEBAS-----------------------------------------------------------------------
//    public static ArrayList<String> retornarLista() {
//        primerasDivisas();
//        ArrayList<String> listita = new ArrayList<>();
//        Iterator iterador = LISTA_DE_NOMBRES_DIVISAS.iterator();
//        while (iterador.hasNext()) {
//            listita.add((String) iterador.next());
//        }
//        return listita;
//    }
//    private static Integer dameLaDivisa() {
//
//        //Declaracion de tipos de divisas
//        String[] opcionesDeConversion = LISTA_DE_NOMBRES_DIVISAS.toArray(new String[LISTA_DE_NOMBRES_DIVISAS.size()]);
//        JComboBox<String> boxCombo = new JComboBox<>(opcionesDeConversion);
//
//        JOptionPane.showOptionDialog(null, boxCombo, "Selecciona el tipo de cambio",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
//
//        return boxCombo.getSelectedIndex();
//    }
//------------------------------------------------------------------------------
    
    //----------------------------------------------------------------------------------------------------------------------------------
    //---------------------------------------------DECLARACION DE CONSTANTES INICIALES--------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------------------
    private static final ArrayList<Conversores> LISTA_DE_CONVERSORES = new ArrayList<>();
    private static final ArrayList<String> LISTA_DE_NOMBRES_DIVISAS = new ArrayList<>();

    private static void primerasDivisas() {

        LISTA_DE_CONVERSORES.add(new Conversores(0.00378, "Peso Argentino a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00336, "Peso Argentino a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00288, "Peso Argentino a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.52276, "Peso Argentino a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(4.78483, "Peso Argentino a Won Sur-Coreano"));

        LISTA_DE_CONVERSORES.add(new Conversores(264.678, "Dolar a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.89045, "Dolar a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.76366, "Dolar a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(138.787, "Dolar a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1268.14, "Dolar a Won Sur-Coreano"));

        LISTA_DE_CONVERSORES.add(new Conversores(296.172, "Euro a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.12245, "Euro a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.85705, "Euro a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(155.787, "Euro a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1423.43, "Euro a Won Sur-Coreano"));

        LISTA_DE_CONVERSORES.add(new Conversores(347.029, "Libra Esterlina a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.30918, "Libra Esterlina a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(1.16594, "Libra Esterlina a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(181.704, "Libra Esterlina a Yen Japones"));
        LISTA_DE_CONVERSORES.add(new Conversores(1660.23, "Libra Esterlina a Won Sur-Coreano"));

        LISTA_DE_CONVERSORES.add(new Conversores(1.91261, "Yen Japones a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0072, "Yen Japones a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00641, "Yen Japones a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0055, "Yen Japones a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(9.13636, "Yen Japones a Won Sur-Coreano"));

        LISTA_DE_CONVERSORES.add(new Conversores(0.2087, "Won Sur-Coreano a Peso Argentino"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.00079, "Won Sur-Coreano a Dolar"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0007, "Won Sur-Coreano a Euro"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.0006, "Won Sur-Coreano a Libra Esterlina"));
        LISTA_DE_CONVERSORES.add(new Conversores(0.10924, "Won Sur-Coreano a Yen Japones"));

        LISTA_DE_NOMBRES_DIVISAS.add("Peso Argentino");
        LISTA_DE_NOMBRES_DIVISAS.add("Dolar");
        LISTA_DE_NOMBRES_DIVISAS.add("Euro");
        LISTA_DE_NOMBRES_DIVISAS.add("Libra Esterlina");
        LISTA_DE_NOMBRES_DIVISAS.add("Yen Japones");
        LISTA_DE_NOMBRES_DIVISAS.add("Won Sur-Coreano");
    }
}
