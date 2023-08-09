/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author 54117
 */
public enum TasasDeConversionAOtros {
    
    PESO_ARGENTINO_TO_DOLAR(0.00378),
    PESO_ARGENTINO_TO_EURO(0.00336),
    PESO_ARGENTINO_TO_LIBRA_ESTERLINA(0.00288),
    PESO_ARGENTINO_TO_YEN_JAPONES(0.52276),
    PESO_ARGENTINO_TO_WON_SUR_COREANO(4.78483);
    
    private Double cambio;

    private TasasDeConversionAOtros(Double cambio) {
        this.cambio = cambio;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double cambio) {
        this.cambio = cambio;
    }
    
    
}
