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
public class Consola {
    
    protected static final int energiaConsumida = 300;
    private EstadoArmadura estadoConsola = NUEVO;

    public Consola() {
    }

    public Consola(EstadoArmadura estadoConsola) {
        this.estadoConsola = estadoConsola;
    }

    public EstadoArmadura getEstadoConsola() {
        return estadoConsola;
    }

    public void setEstadoConsola(EstadoArmadura estadoConsola) {
        this.estadoConsola = estadoConsola;
    }

    @Override
    public String toString() {
        return "Consola{" + "estadoConsola=" + estadoConsola + '}';
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
