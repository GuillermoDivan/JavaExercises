/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.*/

import java.util.Scanner;
public class Ej17Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num = input.nextInt();

        boolean resultado = corroborarPrimo(num);
        if (resultado) {
            System.out.println("Este número es primo.");
        } else {
            System.out.println("Este número no es primo.");
        }
    }

    public static boolean corroborarPrimo(int num){
        boolean primo = false;
        if ((num%2 == 0) || (num%3 == 0) || (num%5 == 0) || (num%7 == 0)) {
            primo = false;
        } else { primo = true; }
        return primo;
    }
}
