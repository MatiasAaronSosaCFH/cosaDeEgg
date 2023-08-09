/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.*;
/**
 *
 * @author 54117
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        
        boolean isPresent = false;
        
        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox caja = new JComboBox(nombresDeFuentes);
        
        for(String nombrefuente : nombresDeFuentes){
            if(nombrefuente.equals(fuente)) isPresent = true; break;
        }
        
        JOptionPane.showOptionDialog(null, caja, "Elige la fuente a usar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, null, null);
        
        int index = caja.getSelectedIndex();
        
        System.out.println(nombresDeFuentes[index]);
        
        
        Font miFuente = new Font("Arial",Font.BOLD,26);
    }
    
}
