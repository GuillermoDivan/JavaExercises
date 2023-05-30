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
        int[][] matriz2 = trasponerMatriz(matriz1);
        System.out.println("");
        corroborarAntisimetria(matriz1, matriz2);
    }

    public static int[][] generarMatriz() {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Ingresá el número para la casilla [" + i + "][" + j + "].");
                matriz1[i][j] = input.nextInt();
            }
        }
        return matriz1;
    }

    public static void mostrarMatriz(int[][] matriz1) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matriz1[i][j] + "], ");
            }
            System.out.println("");
        }
    }

    public static int[][] trasponerMatriz(int[][] matriz1) {
        int[][] matriz2 = new int[2][2];

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
                matriz2[i][j] = matriz1[i][j];
                System.out.print("[" + matriz2[i][j] + "], ");
            }
            System.out.println("");
        }
        return matriz2;
    }

    public static void corroborarAntisimetria(int[][] matriz1, int[][] matriz2) {
        boolean antisimetria = true;
        int aux1 = 0;
        int aux2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                    System.out.println("comparando celda [" + i + "][" + j + "]");
                    aux1 = matriz1[i][j];
                    aux2 = -matriz2[i][j];
                    if  (aux1 == aux2 && aux1 != 0) {
                        System.out.println("pos/neg (" + aux1 + ")(" + aux2 + ")");
                        antisimetria =false;
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
