/*
 Los profesores del curso de programación de Egg necesitan llevar
un registro de las notas adquiridas por sus 10 alumnos para luego 
obtener una cantidad de aprobados y desaprobados. Durante el período
de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos
y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el 
arreglo. Al final del programa los profesores necesitan obtener por pantalla 
la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package practicas39;

/**
 *
 * @author 54117
 */
public class Practicas39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] alumNotas = new int[10][4];
        int[] notas = new int[10];
        matrizRellena(alumNotas);
        promedio(alumNotas, notas);
        notaFinal(notas);

        for (int i = 0; i < 10; i++) {
            String notaFinal = (notas[i] >= 7) ? " Aprobado" : " Reprobado";
            System.out.println("La nota promedio de el alumno " + (i + 1) + " es " + notas[i] + notaFinal);

        }

    }

    public static void matrizRellena(int[][] array) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 4; j++) {

                array[i][j] = (int) (Math.round(Math.random() * 10));
            }
        }
    }

    public static void promedio(int[][] matriz, int[] array) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 4; j++) {

                switch (i) {

                    case 0:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 1:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 2:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 3:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 4:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 5:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 6:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 7:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 8:
                        array[i] = array[i] + matriz[i][j];
                        break;
                    case 9:
                        array[i] = array[i] + matriz[i][j];
                        break;

                }
            }
        }

    }

    public static void notaFinal(int[] array) {

        for (int i = 0; i < 10; i++) {

            array[i] = array[i] / 4;
        }
    }
}
