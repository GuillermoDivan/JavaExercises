/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. */

import java.util.Scanner;
public class Ej18Extra {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector:");
        int dimension = input.nextInt();
        int[] vector = new int[dimension];
        int suma = 0;

        for (int i = 0; i < dimension; i++){
            System.out.println("Ingrese el "+ (i+1)+ "° número a sumar:");
            int num = input.nextInt();
            suma += num;
        }
        System.out.println("La suma de los números es de "+ suma+ ".");
    }
}
