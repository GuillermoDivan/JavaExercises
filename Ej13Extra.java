import java.util.Scanner;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123*/

public class Ej13Extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo.");
        int num = scanner.nextInt();
        escalera(num);
    }

    public static void escalera(int num) {
        for (int i = 0; i < num; i++) { //Cantidad de filas.
            for (int j = 0; j <= i; j++) { //Impresión desde 1 hasta n=fila.
                System.out.print(j + 1);
            }
            System.out.println("");
        }

    }
}
