/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

import java.util.Scanner;
import java.lang.*;

public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número límite.");
        int limite = scanner.nextInt();
        int suma = SumaYCompara(limite);
        System.out.println("La suma de números ingresada que superaron el "+ limite+ " inicial fue de "+ suma+ ".");
    }

    public static int SumaYCompara(int limite) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (suma <= limite) {
            System.out.println("Ingrese números hasta superar el límite inicial.");
            int num = scanner.nextInt();
            suma += num;
            System.out.println(suma);
        }
            return suma;
    }
}