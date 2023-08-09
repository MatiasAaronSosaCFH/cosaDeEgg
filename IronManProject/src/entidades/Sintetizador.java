/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import static enums.EstadoArmadura.*;
import enums.EstadoArmadura;
/**
 *
 * @author 54117
 */
public class Sintetizador {
    
    protected static final int energiaConsumida = 200;
    private EstadoArmadura estadoSintetizador = NUEVO;

    public Sintetizador() {
    }

    public Sintetizador(EstadoArmadura estadoSintetizador) {
        this.estadoSintetizador = estadoSintetizador;
    }

    public EstadoArmadura getEstadoSintetizador() {
        return estadoSintetizador;
    }

    public void setEstadoSintetizador(EstadoArmadura estadoSintetizador) {
        this.estadoSintetizador = estadoSintetizador;
    }

    @Override
    public String toString() {
        return "Sintetizador{" + "estadoSintetizador=" + estadoSintetizador + '}';
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
	