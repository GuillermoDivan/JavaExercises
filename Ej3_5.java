/* Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
 cantidad total de niños, y la cantidad total de niñas que hay en el curso. */

import java.util.Scanner;

public class Ej3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de varones y luego cantidad de mujeres");
        int varones = scanner.nextInt();
        int mujeres = scanner.nextInt();

        int total = varones + mujeres;
        float porcentajeVarones = (varones*100)/total;
        float porcentajeMujeres = 100-porcentajeVarones;

        System.out.println("Desconociendo por completo la existencia del género como una construcción social y psicológica, podemos decir que en esta escuela del Opus Dei hay "+ porcentajeVarones+ "% de varones y "+ porcentajeMujeres+ "% de siervas de Dios.");
    }
}
