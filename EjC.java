/* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son. */

import java.util.Scanner;

public class EjC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero positivo");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número entero positivo");
        int num2 = input.nextInt();
        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2){
        if (num1 % num2 == 0) {
            System.out.println("El primer número es múltiplo del segundo número");
        } else {
            System.out.println("El primer número no es múltiplo del segundo número");
        }
    }
}
