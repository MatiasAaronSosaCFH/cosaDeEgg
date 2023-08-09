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
public class Producto {
    
    private String tipoProducto;
    private Double precio;
    
    public Producto(){}

    public Producto(String tipoProducto, Double precio) {
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "tipoProducto=" + tipoProducto + ", precio=" + precio + '}';
    }
    
     
}
