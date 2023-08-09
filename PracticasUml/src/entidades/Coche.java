/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author 54117
 */
public class Coche {
    
    private String[] nombres = new String[5];
    private String nombre;
    private Bicicleta bici;

    public Bicicleta getBici() {
        Bicicleta biciReplace = new Bicicleta();
        
        biciReplace.setColor(this.bici.getColor());
        biciReplace.setLargo(this.bici.getLargo());
        
        return biciReplace;
    }

    public void setBici(Bicicleta bici) {
        this.bici = bici;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String[] getNombres() {
        String[] nombresReplace = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            nombresReplace[i] = nombres[i];
        }
        return nombresReplace;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    
    
    
}
