import java.util.Scanner;

/*
Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La
sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
https://quantdare.com/numeros-de-fibonacci/
*/

public class Ej4_12 {
    public static void main(String[] args) {
        AplicarFibonacci();
    }

    public static void AplicarFibonacci() {
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        int resultado = 1;
        int anterior = 1;

        for (int i = 1; i < cantidad; i++) {
            if (i < 2) {
                anterior = 1;
                resultado = 1;
            } else {
                resultado = resultado + anterior;
                anterior = resultado - anterior;
            }

            System.out.println("En la posición " + i + " retorno vale " + resultado + " y su anterior es " + anterior + ".");
        }
        System.out.println("Al suceder la fórmula de Fibonacci " + cantidad + " veces, el resultado es de " + resultado + ".");
    }
}
