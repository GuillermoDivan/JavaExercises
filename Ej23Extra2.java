/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y luego construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). */


import java.util.Scanner;
import java. util. Arrays;

public class Ej23Extra2 {
    public static void main(String[] args){

        String[][] matriz = generarMatriz();
        String[] arrayPalabras = pasarPalabras();

        for (int h = 0; h < arrayPalabras.length; h++) {
            int numeroFilas = aleatorizarFilas();
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (i == numeroFilas) {
                            while (!matriz[i][j].equals("*")) { numeroFilas = aleatorizarFilas(); }
                            String palabraElegida = arrayPalabras[h];
                            if (j < palabraElegida.length()) {
                                matriz[numeroFilas][j] = palabraElegida.substring(j, j + 1);
                                } else { continue; }
                            }
                        }
                    }
                }

        ubicarNumeros(matriz);
        imprimirMatriz(matriz);

    }

    public static String[][] generarMatriz() {
        String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "*";
            }
        }
        return matriz;
    }

    public static String[] pasarPalabras(){
        String[] arrayPalabras = new String[5];

         for (int i = 0; i < 5; i++) {
             String palabra = "a";
             while ((palabra.length() < 3) || (palabra.length() > 5)) {
                 Scanner input = new Scanner(System.in);
                 System.out.println("Ingrese una palabra de 3 a 5 letras");
                 palabra = input.nextLine();
             } arrayPalabras[i] = palabra;
         }
        return arrayPalabras;
    }

    public static int aleatorizarFilas(){
        int numeroFila = -1;
        for (int i = 0; i < 5; i++) {
            numeroFila = (int) (Math.random() * 20);
        }
        return numeroFila;
    }

    public static void ubicarNumeros(String[][] matriz) {
        int[][] matrizNumerica = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals("*")) {
                    matrizNumerica[i][j] = (int) (Math.random() * 10);
                    matriz[i][j] = matriz[i][j].valueOf(matrizNumerica[i][j]);
                        }
                    }
                }
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]+ " | ");
            }
            System.out.println("");
        }

    }

}