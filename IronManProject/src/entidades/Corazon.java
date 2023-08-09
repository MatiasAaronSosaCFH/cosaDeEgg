/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import enums.EstadoArmadura;
import static enums.EstadoArmadura.*;
/**
 *
 * @author 54117
 */
public class Corazon {
    
    protected float bateria = Float.MAX_VALUE;
    private EstadoArmadura estadoReactor = NUEVO;
    

    public Corazon() {
    }

    public Corazon(EstadoArmadura estadoReactor) {
        this.estadoReactor = estadoReactor;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public EstadoArmadura getEstadoReactor() {
        return estadoReactor;
    }

    public void setEstadoReactor(EstadoArmadura estadoReactor) {
        this.estadoReactor = estadoReactor;
    }

    @Override
    public String toString() {
        return "Corazon{" + "bateria=" + bateria + ", estadoReactor=" + estadoReactor + '}';
    }
    
    public void estadoBateria(){
        System.out.println("La bateria restante es: " + Math.round(bateria / Float.MAX_VALUE * 100)+"%") ;
    }
}
