/* Asignar valores por teclado a la matriz de dos dimensiones dentro del for. Mostrar la matriz. */


import java.util.Scanner;

public class EjD {
    public static void main(String[] args) {

        String[][] matriz = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese palabra para la casilla [" + i + "][" + j + "]");
                matriz[i][j] = input.nextLine();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
