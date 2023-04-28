/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(){}
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public float area(){
        float area = (float) Math.pow((Math.PI * this.radio), 2);
        
        return area;
    }
    
    public float perimetro(){
        float perimetro =  (float) (2*Math.PI*this.radio);
        return perimetro;
    }
    
    public static Circunferencia crearCircunferencia(){
        
        Circunferencia circu = new Circunferencia();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int radio = 0;
        
        System.out.println("Que radio va a tener la circunferencia ?");
        radio = leer.nextInt();
        
        return circu;
    }
    
    @Override
    public String toString(){
        return "Circunferencia{ " + "Radio = " + radio; 
    }
}
