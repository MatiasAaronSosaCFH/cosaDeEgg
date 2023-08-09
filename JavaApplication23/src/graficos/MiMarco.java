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
public class MiMarco extends JFrame{
    
    public MiMarco(){
        
        //setBounds(500,300,250,250); setBounds crea la posicion y tamaño de la ventana
        setSize(800,600);//setSize cambia el tamaño inicial de la ventana, toda ventana tiene un tamaño de 0px de alto X 0px de largo 
        setLocation(500,300);//setLocation cambia la localizacion inicial de la ventana
        
        //setResizable(false); setResizable determina si la ventana puede o no cambiar su tamao durante la ejecucion
        
        setExtendedState(MAXIMIZED_BOTH);//setExtendedState cambia el tamaño el numero que reciva 
        
        setTitle("Mi ventana");//setTitle le da un titulo en la parte de arriba de la ventana
        setVisible(true);//setVisible es indispensable para generar la ventana, una ventana por defecto es invisibl, con este metodo hacemos que sea visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setDefaultCloseOperation es un metodo que cambia el comportamiento de la ventana cuando la cerramos
        
    }
}
