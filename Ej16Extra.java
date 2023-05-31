/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

import java.util.Scanner;
public class Ej16Extra {
    public static void main(String[] args) {
        boolean keepAsking = true;

        do {
            System.out.println("Ingrese el nombre de la persona");
            Scanner input = new Scanner(System.in);
            String nombre = input.nextLine();
            System.out.println("Ingrese el nombre de la edad");
            int edad = input.nextInt();
            if (edad < 18) {
                System.out.println(nombre + " es menor de edad.");
            } else {
                System.out.println(nombre + " es mayor de edad.");
            }
            System.out.println("¿Desea continuar? Escriba 'no' para salir.");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            answer = answer.toLowerCase();
            if (answer.equalsIgnoreCase("no")) {keepAsking = false; }
        } while (keepAsking);
    }
}
