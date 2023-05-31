import java.util.Scanner;

/*Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
la matriz de la siguiente forma:
3 + 5 = 8
4 + 3 = 7
1 + 4 = 5*/


public class Ej4_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; //Inicialización de matriz.

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingrese el valor en la celda " + i + "," + j + ".");
                    matrix[i][j] = scanner.nextInt();
                }
                else {
                    matrix[i][j] = matrix[i][0] + matrix[i][1];
                }
            }
        }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                        System.out.print(matrix[i][j] + " | ");
                    }
                System.out.println();
            }

        }
}