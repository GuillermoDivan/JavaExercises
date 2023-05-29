/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java. */

import java.util.Scanner;
import java.lang.*;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        String input = scanner.nextLine();
        String inicial = input.substring(0,1);
        String A = "A";
        String resultado = CorrectoOIncorrecto(inicial, A);
        System.out.println(resultado);
    }

    public static String CorrectoOIncorrecto(String inicial, String A) {
        String resultado;
        if (inicial.equals(A)) {
            resultado = "CORRECTO";
        } else { resultado = "INCORRECTO";}
        return resultado;
    }
}