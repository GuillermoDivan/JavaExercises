/* Imprimir los factoriales del 1 al 10.
El factorial de un número n es n * n-1 * n-2 ... hasta n = 1.
O sea:
El factorial de 4! = 1 x 2 x 3 x 4 = 24
El factorial de 6! = 1 x 2 x 3 x 4 x 5 x 6 = 720.

El factorial de 1 es (0!) * 1 = 1.
El factorial de 2 es (1!) * 2 = 2
El factorial de 3 es (2!) * 3 = 6
El factorial de 4 es (3!) * 4 = 24
*/


public class EjE {
    public static void main(String[] args) {
        int factorial = 1;

        for (int i = 1; i <= 10; i++){
            factorial *= i;
            System.out.println("El factorial de "+ i +" es "+ factorial);
        }

    }
}
