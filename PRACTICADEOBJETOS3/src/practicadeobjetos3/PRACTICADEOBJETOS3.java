package practicadeobjetos3;
import entidad.Silla;
import static entidad.Silla.compararSillas;
import static service.MesaService.*;
import static service.SillasService.*;
import entidad.Stock;
import java.util.Collection;
import java.util.Collections;

public class PRACTICADEOBJETOS3 {

    public static void main(String[] args) {
        
//        Mesa mesita = crearMesa();
//        Mesa mesitita = crearMesa();
//        Mesa mesota = new Mesa();
//        revisionDeCalidad(mesita);
//        revisionDeCalidad(mesota);

          Stock almacen = new Stock();
          //almacen.setMesas(cantidadDeMesas());
          almacen.setSillas(cantidadDeSillas());
        
         // System.out.println(almacen);
         for(Silla sillita : almacen.getSillas()){
             System.out.println(sillita);
         }
         
         Collections.sort(almacen.getSillas(),compararSillas);
          
          for(Silla sillita : almacen.getSillas()){
             System.out.println(sillita);
         }
    }
}
