/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**{}[]
 *
 * @author 54117
 */
public class Mesa {
    
    private String color;
    private int patas;
    private boolean barnisada;
    private boolean redonda;
    
    public Mesa(){}
    
    public Mesa(String color, int patas, boolean barnisada, boolean redonda){
        this.color = color;
        this.patas = patas;
        this.barnisada = barnisada;
        this.redonda = redonda;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
       this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isBarnisada() {
        return barnisada;
    }

    public void setBarnisada(boolean barnisada) {
        this.barnisada = barnisada;
    }

    public boolean isRedonda() {
        return redonda;
    }

    public void setRedonda(boolean redonda) {
        this.redonda = redonda;
    }

    @Override
    public String toString() {
        return "Mesa{" + "color=" + color + ", patas=" + patas + ", barnisada=" + barnisada + ", redonda=" + redonda + '}';
    }
    
    
}
