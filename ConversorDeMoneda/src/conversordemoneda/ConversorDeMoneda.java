/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordemoneda;

import entidades.Conversores;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static services.MenuService.menuInicio;

/**
 *
 * @author 54117
 */
public class ConversorDeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //menuInicio();
        Conversores conversitotito = new Conversores();
        boolean inti = false;

        String tipoUno = JOptionPane.showInputDialog("Como se llama la divisa que vas a crear ?");
        Double cambio = Double.parseDouble(JOptionPane.showInputDialog("Cual es el valor de 1 unidad de " + tipoUno + " comparandola al dolar"));
        tipoUno = tipoUno + " A dolar";
        conversitotito.setCambio(cambio);
        conversitotito.setNombreDivisa(tipoUno);
        
        Conversores conver = new Conversores(0.00378, 0, "Peso a Dolar");

        ArrayList<Conversores> listita = new ArrayList<>();
        listita.add(conver);
        listita.add(conversitotito);
        
        Iterator iterador = listita.iterator();
        String[] tipos = new String[listita.size()];
        int indice = 0;
        
        while (iterador.hasNext()) {

            Conversores conversito = (Conversores) iterador.next();

            tipos[indice] = conversito.getNombreDivisa();
            
            indice++;

        }

        JComboBox combox = new JComboBox(tipos);

        JOptionPane.showOptionDialog(null, combox, "Posibles conversiones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

        int elec = combox.getSelectedIndex();

        System.out.println(tipos[0] + "\n" + tipos[1]);
    }

}
