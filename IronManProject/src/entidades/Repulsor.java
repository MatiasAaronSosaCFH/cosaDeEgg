/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.EstadoArmadura;
import static enums.EstadoArmadura.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 54117
 */
public class Repulsor {
    
    protected static final int energiaConsumida = 1000;
    private EstadoArmadura estadoRepulsor = NUEVO;

    public Repulsor() {
    }

    public Repulsor(EstadoArmadura estadoRepulsor) {
        this.estadoRepulsor = estadoRepulsor;
    }

    public EstadoArmadura getEstadoRepulsor() {
        return estadoRepulsor;
    }

    public void setEstadoRepulsor(EstadoArmadura estadoRepulsor) {
        this.estadoRepulsor = estadoRepulsor;
    }

    @Override
    public String toString() {
        return "Repulsor{" + "estadoRepulsor=" + estadoRepulsor + '}';
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
    
    public float disparo(){
        int disparos = 0;

        while (true) {
            int opcion = JOptionPane.showConfirmDialog(null, "Presiona si para disparar", "DISPARA!!!!", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                disparos++;
            } else {
                break;
            }
        }
        
        float consumoFinal = (energiaConsumida * 3) * disparos;
        
        System.out.println("Energia consumida por los "+ disparos + " disparos: " + ((disparos * Repulsor.energiaConsumida)*3));
        
        return consumoFinal;
    }
    
}
