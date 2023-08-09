/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author 54117
 */
public class SegundoMarco extends JFrame{
    
    public SegundoMarco(){
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();//getDefaultToolkit devuelve el toolkit por defecto, un toolkit en este caso 
                                                         //es el sistema de ventanas que tenemos por defecto en nuestro sitema
                                                    
        
        Dimension tamanhoPantalla = miPantalla.getScreenSize();//toma el tamaño de la pantalla principal de mi sistema y se lo otorga a este objeto de tipo Dimension
        
        int alturaPantalla = tamanhoPantalla.height;
        int anchoPantalla = tamanhoPantalla.width;
        
        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4,alturaPantalla/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        Image miIcono = miPantalla.getImage("icono.gif");//Creamos un objeto de tipo Image con una direccion, en este caso el gif esta en la carpeta rais de el proyecto
        
        setTitle("Marco con titulo y icono");
        setIconImage(miIcono); // de esta manera cambiamos el icono por defecto de java por el objeto de tipo Image que le pasemos por parametro
        
    }
}
