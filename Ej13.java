/* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *
*/

import java.util.Scanner;
import java.lang.*;

public class Ej13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese u número entero positivo");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i == 0) || (i == num-1)) {
                    System.out.print(" * ");
                } else { if ((j == 0) || (j == num-1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                } }
            }
            System.out.println("");
        }

        }
}
