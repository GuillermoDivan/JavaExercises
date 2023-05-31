import java.util.Scanner;
/* Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
No podemos pasar el numero a cadena para realizar el ejercicio.*/

public class Ej4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero distinto de 0");
        int num = scanner.nextInt();
        boolean resultado = TodoImpar(num);
        System.out.println("¿Todos los números son impares? "+ resultado);
    }

    public static boolean TodoImpar(float num) {
        boolean resultado = true;
        while (num != 0) {
            float resto = num;
            if (resto%2 == 0) { resultado = false; };
            num = resto/10;
            num = (int) num;
        }
        return resultado;
    }
}
