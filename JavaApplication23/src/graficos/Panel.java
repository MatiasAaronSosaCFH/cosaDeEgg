/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author 54117
 */
public class Panel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo swing", 100, 100);
    }
}
