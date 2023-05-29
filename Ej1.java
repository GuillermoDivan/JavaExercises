/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número que desea sumar.");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número que desea sumar.");
        int num2 = scanner.nextInt();
        System.out.println("El resultado de la suma de "+ num1+ " y "+ num2+ " es "+ (num1+num2) + ".");
    }
}
