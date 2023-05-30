/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        //int[][] matriz = ingresarCuadradoPredefinido();
        int[][] matriz = ingresarCuadradoTeclado();
        mostrarCuadrado(matriz);
        int sumaFilas = compararFilas(matriz);
        int[][] matriz2 = trasponerCuadrado(matriz);
        System.out.println("");
        int sumaColumnas = compararFilas(matriz2);
        if (sumaFilas == sumaColumnas) {
            int diagonal1 = diagonal1(matriz, sumaFilas);
            boolean magico = diagonal2(matriz, diagonal1);
            if (magico) {
                System.out.println("Este cuadrado SÍ es mágico");
            }
        }
    }

    public static int[][] ingresarCuadradoPredefinido() {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 2;
        matriz[0][1] = 7;
        matriz[0][2] = 6;
        matriz[1][0] = 9;
        matriz[1][1] = 5;
        matriz[1][2] = 1;
        matriz[2][0] = 4;
        matriz[2][1] = 3;
        matriz[2][2] = 8;
        return matriz;
    }

    public static int[][] ingresarCuadradoTeclado() {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese el número de la celda [" + i + "][" + j + "]");
                int num = input.nextInt();

                while (num < 0 || num > 9) {
                    System.out.println("Número no admitido, ingrese un número entre 1 y 9 incluidos. Intente nuevamente");
                    num = input.nextInt();
                }

                matriz[i][j] = num;
            }
        }
        return matriz;
    }

    public static void mostrarCuadrado(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public static int compararFilas(int[][] matriz) {
        int sumaA = 0;
        int sumaB = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    sumaA = sumaA + matriz[0][j];
                } else {
                    sumaB = sumaB + matriz[i][j];
                }
            }
            if (i > 0) {
                if (sumaA != sumaB) {
                    System.out.println("Cuadrado NO mágico."); break;
                } else {
                    sumaB = 0;
                }
            }
        }
        return sumaA;
    }

    public static int[][] trasponerCuadrado(int[][] matriz) {
        int sumaA = 0;
        int sumaB = 0;
        int[][] matriz2 = new int[3][3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        return matriz2;
    }

    public static int diagonal1(int[][] matriz, int sumaFilas) {
        int sumaA = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaA += matriz[i][j];
                }
            }
        }

        if (sumaA != sumaFilas) {
            System.out.println("Cuadrado NO mágico.");
        }
        return sumaA;
    }

    public static boolean diagonal2(int[][] matriz, int diagonal1) {
        boolean magico = true;
        int sumaA = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 3-1-j) {
                    sumaA += matriz[i][j];
                }
            }
        }

        if (sumaA != diagonal1) {
            System.out.println("Cuadrado NO mágico."); magico = false;
        }
        return magico;
    }


}