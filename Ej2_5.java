/* Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
 tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables
 y mostrar el resultado final por pantalla.
Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
programa deberá mostrar: num1 = 3 y num2 = 9
Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar. */

import java.util.Scanner;

public class Ej2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de dos variables numéricas de tipo entero (recuerde el orden)");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("Con unos pasos mágicos, ahora el primer número es "+ n1+ " y el segundo es "+ n2+ ".");
    }
}
