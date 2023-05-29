/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */

import java.util.Scanner;

public class EjA {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un número entero positivo.");
    int cantidad = input.nextInt();
    System.out.print(cantidad+ ": ");

    for (int i = 0; i < cantidad; i++) {
        System.out.print("*");
    }

    }
    }