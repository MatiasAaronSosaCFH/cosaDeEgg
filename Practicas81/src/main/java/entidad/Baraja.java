/*
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author 54117
 */
public class Baraja {
    
    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> descarte = new ArrayList();

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getDescarte() {
        return descarte;
    }

    public void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;
    }
    
    
}
