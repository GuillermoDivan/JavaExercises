/* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */

public class Ej15 {
    public static void main(String[] args) {
        cuentaRegresiva();
    }
    public static void cuentaRegresiva() {
        int[] vector = new int[100];

        for (int i = 0; i < 100; i++){
            vector[i] = 100 - i;
            System.out.println("["+ vector[i]+ "]");
        }
    }
}
