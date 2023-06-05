/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
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
        //int[] arrayFilas = aleatorizarFilas();
        //String[][] matriz = ubicarPalabras(arrayPalabras, arrayFilas);
        //imprimirMatriz(matriz);
    }

    public static String[][] ingresarPalabras() {
        String[] palabrasEnteras = new String[5];
        String[][] arrayPalabras = new String[5][5];
        String caracter = "*";

        //For <5 y while: Ingresa a completar las cinco palabras, corrobora largo.
        //Ingresa cada palabra en cada lugar de un vector[] (palabrasEnteras).
        for (int i = 0; i < 5; i++) {
            String palabra = "a";
            while ((palabra.length() < 3) || (palabra.length() > 5)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese una palabra de 3 a 5 letras");
                palabra = input.nextLine();
            } if ((palabra.length() > 2) || (palabra.length() < 6)) { palabrasEnteras[i] = palabra; }
        }

        //For anidando for. Toma cada palabra del vector[] y las ubica en celdas letra por letra,
        //De modo tal que mantiene orden (como filas). Ej:
        // [PAN][PAZ][MÁS]
        // [P] [A] [N]
        // [P] [A] [Z]
        // [M] [Á] [S]
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    caracter = palabrasEnteras[i].substring(j, j + 1);
                    if (caracter.equals("")) { break; }
                    arrayPalabras[i][j] = caracter;
                } else {
                    caracter = palabrasEnteras[i].substring(4);
                    if (caracter.equals("")) { break; }
                    arrayPalabras[i][j] = caracter;
                }
            }
        }

        return arrayPalabras;
    }

    public static int[] aleatorizarFilas(){
        int[] arrayFilas = new int[5];
            for (int i = 0; i < 5; i++) {
                arrayFilas[i] = (int) (Math.random() * 10);
                System.out.print("["+arrayFilas[i]+"]");
            }
            Arrays.sort(arrayFilas);

        System.out.println("");
            for (int i = 0; i < 5; i++) {
                System.out.print("["+arrayFilas[i]+"]");
            }

            for (int i = 0; i < 5; i++) {
                if (i < 4) {
                    if (arrayFilas[i] >= arrayFilas[i + 1]) {
                        arrayFilas[i + 1] = arrayFilas[i] + 1;
                    }
                }
            }

        System.out.println("");
            for (int i = 0; i < 5; i++) {
                    System.out.print("["+arrayFilas[i]+"]");
            }

        return arrayFilas;
    }

    public static String[][] ubicarPalabras(String[][] arrayPalabras, int[] arrayFilas) {
        String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (arrayFilas[i] == i) {
                    for (int k = 0; k < 5; k++) {
                        for (int l = 0; l < 5; l++) {
                            matriz[i][j] = arrayPalabras[k][l];
                        }
                    }
                }
            }
        }

                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if ((matriz[i][j].equals(" ")) || (matriz[i][j].equals(""))) {
                            matriz[i][j] = "*";
                        }
                    }
                }


            return matriz;
        }

        public static void imprimirMatriz(String[][] matriz) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    System.out.println(matriz[i][j]);
                }
            }

        }
    }