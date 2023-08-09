/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author 54117
 */
public class Armadura {
    
    //Properties
    private String colorPrimario;
    private String colorSecundario;
    private int rockwellDurability;
    private Repulsor repulsorUno ;
    private Repulsor repulsorDos ;
    private Propulsor propulsorUno ;
    private Propulsor propulsorDos ;
    private Corazon generador;
    private Consola consola ;
    private Sintetizador sintetizador;
    
    //Constructores------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------
    
    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int rockwellDurability, Repulsor rep1, Repulsor rep2, Propulsor prop1, Propulsor prop2, Corazon generador, Consola consola, Sintetizador sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.rockwellDurability = rockwellDurability;
        this.repulsorUno = rep1;
        this.repulsorDos = rep2;
        this.propulsorUno = prop1;
        this.propulsorDos = prop2;
        this.generador = generador;
        this.consola = consola;
        this.sintetizador = sintetizador;
    }
    
    //Geters & Seters------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------
    
    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getRockwellDurability() {
        return rockwellDurability;
    }

    public void setRockwellDurability(int rockwellDurability) {
        this.rockwellDurability = rockwellDurability;
    }

    public Repulsor getRep1() {
        return repulsorUno;
    }

    public void setRep1(Repulsor rep1) {
        this.repulsorUno = rep1;
    }

    public Repulsor getRep2() {
        return repulsorDos;
    }

    public void setRep2(Repulsor rep2) {
        this.repulsorDos = rep2;
    }

    public Propulsor getProp1() {
        return propulsorUno;
    }

    public void setProp1(Propulsor prop1) {
        this.propulsorUno = prop1;
    }

    public Propulsor getProp2() {
        return propulsorDos;
    }

    public void setProp2(Propulsor prop2) {
        this.propulsorDos = prop2;
    }

    public Corazon getGenerador() {
        return generador;
    }

    public void setGenerador(Corazon generador) {
        this.generador = generador;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    //ToString------------------------------------------------------------------------------
    //------------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + 
                colorPrimario + ", colorSecundario=" + 
                colorSecundario + ", rockwellDurability=" + 
                rockwellDurability + ", rep1=" + 
                repulsorUno + ", rep2=" + repulsorDos + ", prop1=" + 
                propulsorUno + ", prop2=" + propulsorDos + ", generador=" + 
                generador + ", consola=" + consola + ", sintetizador=" + 
                sintetizador + '}';
    }

    //Comportamientos puros ------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------
    
    public void caminar() {

       LocalDateTime minutos = LocalDateTime.now();
        
       int opcion = JOptionPane.YES_OPTION;
       
       while(opcion == JOptionPane.YES_OPTION){
           opcion = JOptionPane.showConfirmDialog(null, "Caminando..... \n Presioona ´no´ para salir ");
           
           if(opcion == JOptionPane.NO_OPTION){
               System.out.println("Has parado de caminar");
           }
       }
    
       LocalDateTime minutosEnTermino = LocalDateTime.now();
       
       int minutosFinales = minutos.getSecond() - minutosEnTermino.getSecond();
       
       float consumoBotaUno = this.propulsorUno.usoBasico(minutosFinales);
       float consumoBotaDos = this.propulsorDos.usoBasico(minutosFinales);
       float energiaConsumidaDeCaminar = consumoBotaUno + consumoBotaDos;
       
       System.out.println(energiaConsumidaDeCaminar);
        
       this.generador.bateria -= energiaConsumidaDeCaminar;
    }

    public void correr() {

        LocalDateTime minutos = LocalDateTime.now();
        
       int opcion = JOptionPane.YES_OPTION;
       
       while(opcion == JOptionPane.YES_OPTION){
           opcion = JOptionPane.showConfirmDialog(null, "Corriendo..... \n Presioona ´no´ para salir ");
           
           if(opcion == JOptionPane.NO_OPTION){
               System.out.println("Has parado de caminar");
           }
       }
    
       LocalDateTime minutosEnTermino = LocalDateTime.now();
       
       int minutosFinales = minutos.getSecond() - minutosEnTermino.getSecond();
       
       float consumoBotaUno = this.propulsorUno.usoNormal(minutosFinales);
       float consumoBotaDos = this.propulsorDos.usoNormal(minutosFinales);
       float energiaConsumida = consumoBotaUno + consumoBotaDos;
      
       System.out.println(energiaConsumida);
        
       this.generador.bateria -= energiaConsumida;
        
    }

    public void propulsar() {

        LocalDateTime minutos = LocalDateTime.now();
        
       int opcion = JOptionPane.YES_OPTION;
       
       while(opcion == JOptionPane.YES_OPTION){
           opcion = JOptionPane.showConfirmDialog(null, "Propulsar..... \n Presioona ´no´ para salir ");
           
           if(opcion == JOptionPane.NO_OPTION){
               System.out.println("Has parado de caminar");
           }
       }
    
       LocalDateTime minutosEnTermino = LocalDateTime.now();
       
       int minutosFinales = minutos.getSecond() - minutosEnTermino.getSecond();
       
       float consumoBotaUno = this.propulsorUno.usoIntensivo(minutosFinales);
       float consumoBotaDos = this.propulsorDos.usoIntensivo(minutosFinales);
       float energiaConsumida = (consumoBotaUno + consumoBotaDos);
      
       System.out.println(energiaConsumida);
        
       this.generador.bateria -= energiaConsumida;
    }

    public void volar() {

        LocalDateTime minutos = LocalDateTime.now();
        
       int opcion = JOptionPane.YES_OPTION;
       
       while(opcion == JOptionPane.YES_OPTION){
           opcion = JOptionPane.showConfirmDialog(null, "Volando..... \n Presioona ´no´ para salir ");
           
           if(opcion == JOptionPane.NO_OPTION){
               System.out.println("Has parado de caminar");
           }
       }
    
       LocalDateTime minutosEnTermino = LocalDateTime.now();
       
       int minutosFinales = minutos.getSecond() - minutosEnTermino.getSecond();
       
       float consumoBotaUno = this.propulsorUno.usoNormal(minutosFinales);
       float consumoBotaDos = this.propulsorDos.usoNormal(minutosFinales);
       float consumoGuanteUno = this.repulsorUno.usoNormal(minutosFinales);
       float consumoGuanteDos = this.repulsorDos.usoNormal(minutosFinales);
       float energiaConsumidaBotas = consumoBotaUno + consumoBotaDos;
       float energiaConsumidaGuantes = consumoGuanteUno + consumoGuanteDos;
       
       System.out.println(energiaConsumidaBotas + " " + energiaConsumidaGuantes);
        
       this.generador.bateria -= energiaConsumidaGuantes  + energiaConsumidaBotas;
    }

    public void Disparar() {
        float ejergiaDisparada = this.repulsorUno.disparo();
        this.generador.bateria -= ejergiaDisparada;
    }

    public void leer() {

    }
    
    public void mostrandoEstadoDeLaBateria(){
        
        float porcentaje = this.generador.bateria / Float.MAX_VALUE * 100;
        
        System.out.println(porcentaje + "%");
    }
    
    public void mostrarEstadoDelReactor(){
        
        float porcentaje = this.generador.bateria / Float.MAX_VALUE * 100;
        
        System.out.println(porcentaje + "%");
    }
}
