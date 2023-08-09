/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author 54117
 */
public enum TasasDeConversionAPesos {
    
    DOLAR_TO_PESO_ARGENTINO(264.678),
    EURO_TO_PESO_ARGENTINO(296.172),
    LIBRA_ESTERLINA_TO_PESO_ARGENTINO(347.029),
    YEN_JAPONES_TO_PESO_ARGENTINO(1.91261),
    WON_SUR_COREANO_TO_PESO_ARGENTINO(0.2087);
    
    private Double cambio;

    private TasasDeConversionAPesos(Double cambio) {
        this.cambio = cambio;
    }

    public Double getCambio() {
        return cambio;
    }

    /**
     * Asi se documenta
     * @param cambio 
     */
    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }
    
    
    
}
