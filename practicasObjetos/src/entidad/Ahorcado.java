/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author 54117
 */
public class Ahorcado {
    
    private String[] palabra;
    private int jugadas;
    private int letrasEncontradas = 0;
    
    public Ahorcado(){}
    
    public Ahorcado(int jugadas, int palabrasEncontradas, String[] palabra){
    
        this.jugadas = jugadas;
        this.letrasEncontradas = palabrasEncontradas;
        this.palabra = palabra;
    }
    
    public String[] getPalabra(){
        return this.palabra;
    }
    
    public int getJugadas(){
        return this.jugadas;
    }
    
    public int getPalabrasEncontradas(){
        return this.letrasEncontradas;
    }
    
    public void setPalabra(String[] palabra){
        this.palabra = palabra;
    }
    
    public void setJugadas(int jugadas){
        this.jugadas = jugadas;
    }
    
    public void setPalabrasEncontradas(int palabrasEncontradas){
        this.letrasEncontradas = palabrasEncontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", jugadas=" + jugadas + ", palabrasEncontradas=" + letrasEncontradas + '}';
    }
}
