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
public class Propulsor {
    
    protected static final int energiaConsumida = 1000;
    private EstadoArmadura estadoPropulsor = NUEVO;

    public Propulsor() {
    }

    public Propulsor(EstadoArmadura estadoPropulsor) {
        this.estadoPropulsor = estadoPropulsor;
    }

    public EstadoArmadura getEstadoPropulsor() {
        return estadoPropulsor;
    }

    public void setEstadoPropulsor(EstadoArmadura estadoPropulsor) {
        this.estadoPropulsor = estadoPropulsor;
    }

    @Override
    public String toString() {
        return "Propulsor{" + "estadoPropulsor=" + estadoPropulsor + '}';
    }
    
    public float usoBasico(int segundos){
        float consumoBasico = energiaConsumida;
        return consumoBasico;
    }
    
    public float usoNormal(int segundos){
        float consumoBasico = energiaConsumida * 2;
        return consumoBasico;
    }
    
    public float usoIntensivo(int segundos){
        float consumoBasico = energiaConsumida * 3;
        return consumoBasico;
    }
}
