
package practicas66;

import entidad.Persona;
import java.util.Date;
import static service.PersonaService.*;
public class Practicas66 {

    public static void main(String[] args) {
        
        Persona matias = new Persona();
        Date cumpleaños = new Date(97,11,2);
        
        crearPersona(matias);
        calcularEdad(matias);
        menorQue(matias, cumpleaños);
        mostrarPersona(matias);
    }
    
}
