/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
*/

import java.util.Scanner;
import java.lang.*;

public class Ej16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int dimension = input.nextInt();

        int[] vector = rellenarVector(dimension);
        buscarNumero(vector, dimension);
    }

    public static int[] rellenarVector(int dimension) {
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print("["+ vector[i]+ "], ");
        }
        return vector;
    }

    public static void buscarNumero(int[] vector, int dimension) {
        int posicion = 0;
        int contador = 0;

        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese el número a buscar");
        int buscado = input2.nextInt();

        for (int i = 0; i < dimension; i++) {
            if (vector[i] == buscado) {
                posicion = i + 1;
                System.out.println("El número " + buscado + " fue hallado en la posición " + posicion + ".");
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println("El número se encuentra repetido.");
        } else if (contador == 0) {
            System.out.println("El número no se ha encontrado.");
        } else {
            System.out.println("El número se encontró sólo una vez.");
        }

    }
}
