/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados.");
        double c = scanner.nextDouble();
        double f = convertirCentigradoAFahrenheit(c);
        System.out.println("La temperatura es de "+ c+ "°C, equivalente a "+ f + "°F.");
    }

    public static double convertirCentigradoAFahrenheit(double c) {
        double f = 32 + (9 * c / 5);
        return f;
    }
}
