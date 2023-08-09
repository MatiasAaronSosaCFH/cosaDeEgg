/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas90date_localdate;

/**
 *
 * @author 54117
 */
enum meses {
    
    DICIEMBRE(12),
    NOVIEMBRE(11),
    OCTUBRE(10),
    SSEPTIEMBRE(9);
    
    int numeroMes;
    
    private meses(int numeroMes){
        this.numeroMes = numeroMes;
    }

    public static meses getDICIEMBRE() {
        return DICIEMBRE;
    }

    public static meses getNOVIEMBRE() {
        return NOVIEMBRE;
    }
    
    public int getNumeroMes(){
        return numeroMes;
    }
}
