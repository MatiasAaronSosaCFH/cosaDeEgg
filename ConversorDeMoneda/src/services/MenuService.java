package services;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import enums.*;

public class MenuService {

    public static void menuInicio() {

        //Eleccion de conversion
        Integer direccionDeConversion = dameLaDireccion();

        //Ingreso de cantidades
        Double cantidad = dameCantidad();

        //Ingreso de tipo de divisa
        Integer otraDivisa = dameLaDivisa();

        Double cantidadYaConvertida = 0.0;

        switch (direccionDeConversion) {

            case 0:
                System.out.println("Eligio la opcion 1");
                cantidadYaConvertida = convertirDePesoAOtro(cantidad, otraDivisa);
                break;
            case 1:
                System.out.println("Eligio la opcion 2");
                cantidadYaConvertida = convertirDeOtroAPeso(cantidad, otraDivisa);
        }

        JOptionPane.showMessageDialog(null, cantidadYaConvertida);

        int bucle = JOptionPane.showConfirmDialog(null, "Deseas volver a convertir ?");

        if (bucle == 0) {
            menuInicio();
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema de conversion!!");
        }

    }

    //Metodos de conversion dependiendo la direccion
    private static Double convertirDePesoAOtro(Double cantidad, Integer tipoDeDivisa) {
        return cantidad * TasasDeConversionAOtros.values()[tipoDeDivisa].getCambio();
    }

    private static Double convertirDeOtroAPeso(Double cantidad, Integer tipoDeDivisa) {
        return cantidad * TasasDeConversionAPesos.values()[tipoDeDivisa].getCambio();
    }

    private static Integer dameLaDireccion() {
        //Opciones principales
        String[] opciones = {"Convertir peso a... ", "Convertir ... a peso"};
        JComboBox<String> comboUno = new JComboBox<>(opciones);
        
        JOptionPane.showOptionDialog(null, comboUno, "Selecciona una opcion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        
        return comboUno.getSelectedIndex();
    }

    /**
     * Este metodo lo uso para generar un panel que almacena la cantidad de la
     * moneda a convertir
     */
    private static Double dameCantidad() {
        try {
            //Ingreso de cantidad
            return Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
        } catch (NumberFormatException e) {
            System.out.println("Tipo de dato ingresado NO VALIDO, ingrese un numero");
            return dameCantidad();
        }
    }

    private static Integer dameLaDivisa() {

        //Declaracion de tipos de divisas
        String[] opcionesDeConversion = {"Dolar", "Euro", "Libra Esterlina", "Yen Japones", "Won Sur-Coreano"};
        JComboBox<String> boxCombo = new JComboBox<>(opcionesDeConversion);
        
        JOptionPane.showOptionDialog(null, boxCombo, "Selecciona el tipo de cambio",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        
        return boxCombo.getSelectedIndex();
    }
}
