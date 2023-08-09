/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 54117
 */
public class Stock {

    private ArrayList<Mesa> mesas = new ArrayList();
    private ArrayList<Silla> sillas = new ArrayList();

    public Stock() {
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }

    
    @Override
    public String toString() {
        return "Stock{" + "mesas=" + mesas + "sillas=" + sillas + '}';
    }

}
