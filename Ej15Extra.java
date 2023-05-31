/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */

import java.util.Scanner;
public class Ej15Extra {
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
                case 1: output = sumar(num1, num2);
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 2: output =restar(num1, num2);
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 3: output =multiplicar(num1, num2);
                    System.out.println("El resultado es " + output + ".");
                    break;
                case 4: output =dividir(num1, num2);
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

    public static int sumar(int num1, int num2){ int output = num1 + num2; return output; }
    public static int restar(int num1, int num2){ int output = num1 - num2; return output; }
    public static int multiplicar(int num1, int num2){ int output = num1 * num2; return output; }
    public static int dividir(int num1, int num2){ int output = num1 / num2; return output; }
}

