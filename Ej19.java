/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int[][] matriz1 = generarMatriz();
        mostrarMatriz(matriz1);
       System.out.println("");
        int[][] matriz2 = matriz1;
        corroborarAntisimetria(matriz1, matriz2);
    }

    public static int[][] generarMatriz() {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresá el número para la casilla [" + i + "][" + j + "].");
                matriz1[i][j] = input.nextInt();
            }
        }
        return matriz1;
    }

    public static void mostrarMatriz(int[][] matriz1) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[i][j] + "], ");
            }
            System.out.println("");
        }
    }

    public static void corroborarAntisimetria(int[][] matriz1, int[][] matriz2) {
        boolean antisimetria = true;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    if  (matriz1[i][j] != (matriz2[j][i] * -1)) {
                        antisimetria = false;
                    }

            }
            }
        if (antisimetria) {
            System.out.println("Esta matriz traspuesta SÍ es antisimétrica!");
        } else {
            System.out.println("Esta matriz traspuesta NO es antisimétrica!");

        }
    }
}
