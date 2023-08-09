/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conecciones;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tienda.persistencia.DAOProducto;
import tienda.persistencia.impl.DAOProductoImpl;
import static tienda.servicios.Menu.*;

/**
 * @author 54117
 */
public class Conecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

//        DAOProductoImpl da = new DAOProductoImpl();
//        double numero = da.traerPromedioPrecio();
//        System.out.println(numero);
        JTextField codigo = new JTextField(5);
        JTextField nombre = new JTextField(5);
        JTextField precio = new JTextField(5);
        JTextField codigo_fabricante = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Codigo:"));
        myPanel.add(codigo);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Nombre:"));
        myPanel.add(nombre);
        myPanel.add(new JLabel("Precio:"));
        myPanel.add(precio);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Codigo del fabricante:"));
        myPanel.add(codigo_fabricante);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
        

        int codigoProdu = Integer.parseInt(codigo.getText());
        String nombreProdu = nombre.getText();
        double precioProdu = Double.parseDouble(precio.getText());
        int codigoFabricanteProdu = Integer.parseInt(codigo_fabricante.getText());
        
    }

}
