/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo.");
        int num = scanner.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raizCuadrada = Math.sqrt(num);
        System.out.println("Siendo el número "+ num+ ", su doble es "+ doble+ ", su triple es "+ triple+ " y su raíz cuadrada es "+ raizCuadrada+ ".");
    }
}
