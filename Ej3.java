/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después
toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        String frase = scanner.nextLine();
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        System.out.println("La frase que ingresó es "+ frase+ " Toda a mayúscula se ve así: "+ fraseMayus+ " y toda a minúscula se ve así: "+ fraseMinus);
    }
}
