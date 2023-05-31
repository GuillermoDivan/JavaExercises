/* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos. */

import java.util.Scanner;
public class Ej22Extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz.");
        int  filas = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz.");
        int  columnas = input.nextInt();
        int[][] vector = new int[filas][columnas];

        aleatorizarEnteros(vector, filas, columnas);
    }

    public static void aleatorizarEnteros(int[][] vector, int filas, int columnas){
        int suma = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                vector[i][j] = (int) (Math.random() * 10);
                suma += vector[i][j];
                System.out.print("[" + vector[i][j] + "]");
            } System.out.println("");
        }
        System.out.println("La suma total de los números es "+ suma+ ".");
    }

}
