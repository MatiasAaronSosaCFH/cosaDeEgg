/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 54117
 */
public class MarcoConDibujos extends JFrame{
    
    
    public MarcoConDibujos(){
        
        setTitle("Prueba con dibujos");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(200,300);
        Lamina figuritas = new Lamina();
        add(figuritas);
    
    
    }
    
   
}

class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D gDos = (Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        gDos.setPaint(Color.RED);
        
        gDos.fill(rectangulo);
        
        String nombre = "Matias";
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        
        Color colorsito = new Color(0,150,250);
        colorsito.brighter();
        setBackground(colorsito);
        gDos.fill(elipse);
        
        gDos.draw(new Line2D.Double(100,100,300,250));
        
        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();
        double radio = 150;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
        
        gDos.draw(circulo);
        
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100,100,200,200);
        //g.drawArc(50,100,100,200,120,150);
    }
}