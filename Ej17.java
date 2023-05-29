/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

import java.util.Scanner;
import java.lang.*;

public class Ej17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int dimension = input.nextInt();

        int[] vector = rellenarVector(dimension);
        String[] vector2 = pasarAString(vector, dimension);
        contarDigitos(vector2, dimension);
    }

    public static int[] rellenarVector(int dimension) {
        int[] vector = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) ((Math.random() * 10000) * (Math.random() * 4) - (Math.random() * 3));
            System.out.print("[" + vector[i] + "], ");
        }
        return vector;
    }

    public static String[] pasarAString(int[] vector, int dimension) {
        String[] vector2 = new String[dimension];

        for (int i = 0; i < dimension; i++) {
            vector2[i] = String.valueOf(vector[i]);
        }
        return vector2;
    }

    public static void contarDigitos(String[] vector2, int dimension) {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        for (int i = 0; i < dimension; i++) {
            if (vector2[i].length() == 1) {
                contador1++;
            } else if (vector2[i].length() == 2) {
                contador2++;
            } else if (vector2[i].length() == 3) {
                contador3++;
            } else if (vector2[i].length() == 4) {
                contador4++;
            } else if (vector2[i].length() == 5) {
                contador5++;
            }
        }

        System.out.println("Se han contabilizado los dígitos. Estos son los resultados:");
        System.out.println("Números con 1 dígito: " + contador1 + ".");
        System.out.println("Números con 2 dígitos: " + contador2 + ".");
        System.out.println("Números con 3 dígitos: " + contador3 + ".");
        System.out.println("Números con 4 dígitos: " + contador4 + ".");
        System.out.println("Números con 5 dígitos: " + contador5 + ".");
    }

}
