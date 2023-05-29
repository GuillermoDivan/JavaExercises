/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número.");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número.");
        int num2 = input.nextInt();
        menu(num1, num2);
    }

    public static void menu(int num1, int num2) {
        Scanner input = new Scanner(System.in);
        int output = 0;
        boolean quit = false;

        do {
            System.out.println("MENU || 1. Sumar | 2. Restar | 3. Multiplicar | 4. Dividir | 5. Salir. || Elija opción:");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    output = num1 + num2;
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 2:
                    output = num1 - num2;
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 3:
                    output = num1 * num2;
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 4:
                    output = num1 / num2;
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 5:
                    System.out.println("¿Está segurx de que desea abandonar el programa? S/N");
                    Scanner input2 = new Scanner(System.in);
                    String answer = input2.nextLine();
                    answer = answer.toUpperCase();
                    if (answer.equals("S")) {
                        System.out.println("Bye! Que tengas un lindo día.");
                        quit = true;
                        break;
                    } else {
                        System.out.println("Continuemos, entonces...");
                        break;
                    }
                default:
                    System.out.println("Instrucción no reconocida, ingrese un número del 1 al 5 inclusive.");
            }

        } while (quit == false);
    }
}