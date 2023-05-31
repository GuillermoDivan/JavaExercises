/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/

import java.util.Scanner;
public class Ej11Extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo.");
        int num = input.nextInt();
        int aux = num;
        int digitos = 0;

        while (aux > 0){
            aux *= 0.1;
            digitos++;
        }

        System.out.println(digitos);
    }
}
