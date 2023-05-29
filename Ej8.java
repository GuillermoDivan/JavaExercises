/* Realizar un programa que permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java. */

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        String input = scanner.nextLine();
        int largoFrase = input.length();
        String resultado = CorrectoOIncorrecto(largoFrase);
        System.out.println(resultado);
    }

    public static String CorrectoOIncorrecto(int largoFrase) {
        String resultado;
        if (largoFrase == 8) {
            resultado = "CORRECTO";
        } else { resultado = "INCORRECTO";}
        return resultado;
    }
}
