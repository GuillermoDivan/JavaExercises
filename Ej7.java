/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. */

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        String input = scanner.nextLine();
        String frase = "La gallinita dijo...";

        if (input.equals(frase)) {
            System.out.println("Eureka.");
        } else {System.out.println("No, no, frase incorrecta.");}

    }
}