/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.JFrame;

/**
 *
 * @author 54117
 */
public class MarcoTercero extends JFrame{
    
    
    public MarcoTercero(){
        
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Primer texto");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Panel mainPanel = new Panel();
        
        add(mainPanel);
    }
}
