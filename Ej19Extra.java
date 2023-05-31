/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/

import java.util.Scanner;

public class Ej19Extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de ambos vectores");
        int dimension = input.nextInt();
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];

        aleatorizarEnteros(vector1, dimension);
        aleatorizarEnteros(vector2, dimension);
        compararVectores(vector1, vector2, dimension);
    }

    public static void aleatorizarEnteros(int[] vector, int dimension){
        for (int i = 0; i < dimension; i++){
        vector[i] = (int) (Math.random() * 10);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
    }

    public static void compararVectores(int[] vector1, int[] vector2, int dimension){
        for (int i = 0; i < dimension; i++){
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores no son iguales. Interrupción en la "+ (i+1)+ "° vuelta."); break;
            }
        }
    }

}
