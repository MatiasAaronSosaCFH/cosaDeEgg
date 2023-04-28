/*
Crear una clase Rectángulo que modele rectángulos por 
medio de un atributo privado base y un atributo privado
altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un 
método para calcular la superficie del rectángulo y un método para calcular 
el perímetro del rectángulo. Por último, tendremos un método 
que dibujará el rectángulo mediante asteriscos usando la base
y la altura. Se deberán además definir los métodos getters, setters 
y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularSuperficie() {
        double superficie = this.base * this.altura;
        return superficie;
    }

    public double calcularPerimetro() {
        double perimetro = Math.pow((this.base + this.altura), 2);
        return perimetro;
    }

    public static Rectangulo crearRectangulo() {

        Rectangulo recFinal = new Rectangulo();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double base = 0;
        double altura = 0;

        System.out.println("Que base va a tener tu rectangulo ? ");
        base = leer.nextDouble();
        System.out.println("Que altura va a tener tu rectangulo ?");
        altura = leer.nextDouble();

        recFinal.setAltura(altura);
        recFinal.setBase(base);

        return recFinal;
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < (int) Math.round(altura); i++) {

            for (int j = 0; j < (int) Math.round(base); j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

}
