/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public abstract class Vehiculos <T>{
    
    private T molde;
    private int ruedas;
    private String matricula;
    private String motor;

    public Vehiculos() {
    }

    public Vehiculos(int ruedas, String matricula, String motor) {
        this.ruedas = ruedas;
        this.matricula = matricula;
        this.motor = motor;
    }

//    public abstract int cacularCilidradas();
    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
