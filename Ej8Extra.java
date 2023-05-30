/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

import java.util.Scanner;

public class Ej8Extra {
    public static void main(String[] args) {
    int num = 1; int i = 0; int pares  = 0; int impares = 0;

        while (num % 5 != 0 || num < 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un número entero positivo.");
            num = input.nextInt();
            if (num > 0) { i++;
                if (num % 2 == 0) { pares++;} else { impares++;} }
        }

        System.out.println("Fueron ingresados "+ i+ " números (sin contar negativos), de los cuales "+ pares +" fueron pares y "+ impares+ " fueron impares.");
    }
}
