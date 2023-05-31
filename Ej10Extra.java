/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */

import java.util.Scanner;
public class Ej10Extra {
    public static void main(String[] args) {
        int aleatorio = generarAleatorio();
        adivinarNum(aleatorio);
    }

    public static int generarAleatorio() {
        int aleatorio = (int) (Math.random() * 10) * (int) (Math.random() * 10);
        return aleatorio;
    }

    public static void adivinarNum(int aleatorio) {
        int i = 0;
        int num = 0;
        do {
            i++;
            Scanner input = new Scanner(System.in);
            System.out.println("Adivine el número... intento " + i);
            num = input.nextInt();
        } while (num != aleatorio);

        if (num == aleatorio) {
            System.out.println("¡Coooorrecto!");
        }
}

}
