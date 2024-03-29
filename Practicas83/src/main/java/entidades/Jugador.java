/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(boolean mojado,int id) {
        this.mojado = mojado;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua revolver){
        boolean seMojo = false;
        
        if(revolver.mojar()){
            seMojo = true;
            System.out.println("BUMMMM te mojaste!!!");
        }else{
            revolver.siguienteChorro();
            System.out.println(nombre +" uuuffff safaste pichon");
        }
        return seMojo;
    }
    
    
    @Override
    public String toString() {
        return "Jugador{" + " id = " + id + ", nombre = " + nombre + ", mojado = " + mojado + '}';
    }
    
    
}
