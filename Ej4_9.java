/* Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales
repetidas. Al final el procedimiento mostrará la frase final.
Por ejemplo:
Entrada: “Habia una vez un barco”
Salida: “Habi un vez n brco" */

import java.util.Scanner;

public class Ej4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        eliminarVocalesRepetidas(frase);
    }

        public static void eliminarVocalesRepetidas(String frase) {
            int contadorA = 0;
            int contadorE = 0;
            int contadorI = 0;
            int contadorO = 0;
            int contadorU = 0;
            String frase2 = "";

            for (int i = 0; i < frase.length(); i++) { //La condición segunda es para que entre, si no, no itera.
                String letra = frase.substring(i, i + 1);
                letra = letra.toLowerCase();

                switch (letra) {
                    case "a": contadorA++; if (contadorA == 2) { letra = ""; contadorA = 1; } break;
                    case "e": contadorE++; if (contadorE == 2) { letra = ""; contadorE = 1; } break;
                    case "i": contadorI++; if (contadorI == 2) { letra = ""; contadorI = 1; } break;
                    case "o": contadorO++; if (contadorO == 2) { letra = ""; contadorO = 1; } break;
                    case "u": contadorU++; if (contadorU == 2) { letra = ""; contadorU = 1; } break;
                }
                frase2 += letra;
            }

            System.out.println(frase2);
        }
}
