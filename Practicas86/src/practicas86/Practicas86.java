package practicas86;
import entidades.Alumno;
import java.util.ArrayList;
import java.util.Objects;
import static services.Simulacion.*;
import java.util.UUID;

public class Practicas86 {

    public static void main(String[] args) {
        Long dniPrimario =daDni();
        for (int i = 0; i < 10000; i++) {
            Long dniDoble = daDni();
            
            if(Objects.equals(dniDoble, dniPrimario)){
                System.out.println("Si se repetio-------------------------------------------");
            }else{
                System.out.println(dniDoble);
            }
            
            
            
        }
        
    }

}
