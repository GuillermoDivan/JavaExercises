/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/

import java.sql.SQLOutput;
import java.util.Scanner;
public class Ej4Extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = -1;
        do {
        System.out.println("Ingrese un número del 1 al 10");
        num = input.nextInt();
        } while (num < 0 || num > 10);

        if (num < 4) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
        } else if (num == 4) {System.out.print("IV");
        } else if (num < 9) {
            System.out.print("V"); for (int i = 5; i < num; i++) {
                System.out.print("I");
            }
        } else if (num == 9) {System.out.print("IX");
        } else { System.out.print("X"); }

    }
}
