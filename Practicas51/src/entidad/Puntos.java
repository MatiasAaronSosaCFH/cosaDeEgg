/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los cuatro 
números y los ingresa en los atributos del objeto. Después, a través de otro
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
puntos consulte el siguiente link:
 */
package entidad;

import java.util.Scanner;

/**
 * @author 54117
 */
public class Puntos {
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public Puntos(){}
    
    public Puntos(double x1, double x2, double y1, double y2){
        
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getX1(){
        return this.x1;
    }
    public double getX2(){
        return this.x2;
    }
    public double getY1(){
        return this.y1;
    }
    public double getY2(){
        return this.y2;
    }
    
    public void setX1(double x1){
        this.x1 = x1;
    }
    public void setX2(double x2){
        this.x2 = x2;
    }
    public void setY1(double y1){
        this.y1 = y1;
    }
    public void setY2(double y2){
        this.y2 = y2;
    }
    
    public static void crearPuntos(Puntos puntos){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los valores del primer punto (x1,y1)");
        puntos.setX1(scan.nextDouble());
        puntos.setY1(scan.nextDouble());
        System.out.println("Ingrese los valores del segundo punto (x2,y2)");
        puntos.setX2(scan.nextDouble());
        puntos.setY2(scan.nextDouble());
        
    }
    
    public static void distanciaPuntos(Puntos puntos){
        
        double puntoX = puntos.getX1();
        double puntoX2 = puntos.getX2();
        double puntoY = puntos.getY1();
        double puntoY2 = puntos.getY2();
        
        double distancia = Math.sqrt(Math.pow((puntoX2-puntoX), 2) + Math.pow((puntoY2 - puntoY ), 2));
        
        System.out.println("La distancia entre el primer punto y el segundo es " + distancia);
        
    }
}
