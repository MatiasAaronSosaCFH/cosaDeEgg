package practicasobejtos2;

import entidad.Curso;
import java.util.Scanner;

public class PracticasObejtos2 {

    public static void main(String[] args) {

        Curso cursito = new Curso();
        Curso cursitito = new Curso();

        modificarCurso(cursito);
        
        System.out.println(cursito);
    }
    
    static void modificarCurso(Curso curso){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del curso");
        curso.setNombre(leer.next());
        System.out.println("Cuanto dura el curso ? ");
        curso.setDuracion(leer.nextDouble());
        System.out.println("Cuantos alumnos tiene tu curso ?");
        String[] cantAlumnos = new String[leer.nextInt()];
        
        
        for (int i = 0; i < cantAlumnos.length; i++) {
            
            System.out.println("Ingrese el nombre de un alumno");
            cantAlumnos[i] = leer.next();
        }
        
        curso.setAlumnos(cantAlumnos);
    }
    
    
}
