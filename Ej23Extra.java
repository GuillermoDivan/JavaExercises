/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y luego construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). */


import java.util.Scanner;
import java. util. Arrays;

public class Ej23Extra {
    public static void main(String[] args){

        String[][] arrayPalabras = ingresarPalabras();
        int[] arrayFilas = aleatorizarFilas();
        System.out.println("");
        String[][] matriz = ubicarPalabras(arrayPalabras, arrayFilas);
        System.out.println("");
        imprimirMatriz(matriz);
    }

    public static String[][] ingresarPalabras() {
        String[] palabrasEnteras = new String[5];
        String[][] arrayPalabras = new String[5][20];

        for (int i = 0; i < 5; i++) {
            String palabra = "a";
            while ((palabra.length() < 3) || (palabra.length() > 5)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese una palabra de 3 a 5 letras");
                palabra = input.nextLine();
            }

            // Llenar el 20x20 con asteriscos, cuando se sortea la fila se corrobora que tenga asterisco en j==0.
            // While distinto de asterisco, vuelve a sortear.
            // Reemplazar luego asteriscos por números al azar.

            if (palabra.length() == 3) { palabra = palabra + "!!!!!!!!!!!!!!!!!"; }
            if (palabra.length() == 4) { palabra = palabra + "!!!!!!!!!!!!!!!!"; }
            if (palabra.length() == 5) { palabra = palabra + "!!!!!!!!!!!!!!!"; }
            palabrasEnteras[i] = palabra; }

        for (int i = 0; i < 5; i++) {
            String palabraElegida = palabrasEnteras[i];
            for (int j = 0; j < 20; j++) {
                if (j == 19) { arrayPalabras[i][j] =palabraElegida.substring(j);}
                else { arrayPalabras[i][j] = palabraElegida.substring(j,j+1); }
            }
        }

        return arrayPalabras;
    }

    public static int[] aleatorizarFilas(){
        int[] arrayFilas = new int[5];
            for (int i = 0; i < 5; i++) {
                arrayFilas[i] = (int) (Math.random() * 20);
            }
            Arrays.sort(arrayFilas);

            for (int i = 0; i < 5; i++) {
                if (i < 4) {
                    if (arrayFilas[i] >= arrayFilas[i + 1]) { arrayFilas[i + 1] = arrayFilas[i] + 1; }
                }
            }

        return arrayFilas;
    }

    public static String[][] ubicarPalabras(String[][] arrayPalabras, int[] arrayFilas) {
        int[][] auxiliar = new int[20][20];
        String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                auxiliar[i][j] = (int) (Math.random() * 10);
                matriz[i][j] = matriz[i][j].valueOf(auxiliar[i][j]);
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int k = 0; k < 5; k++) {
                if (arrayFilas[k] == i) {
                    for (int j = 0; j < 20; j++) {
                        matriz[i][j] = arrayPalabras[k][j];
                        if (matriz[i][j].equals("!")) {
                            auxiliar[i][j] = (int) (Math.random() * 10);
                            matriz[i][j] = matriz[i][j].valueOf(auxiliar[i][j]);
                        }
                    }
                }
            }
        }

            return matriz;
        }

        public static void imprimirMatriz(String[][] matriz) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }

        }


    }