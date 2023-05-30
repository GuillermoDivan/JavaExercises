/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/
import java.util.Scanner;

public class Ej7Extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números.");
        int cantidadN = input.nextInt();

       // versionWhile(cantidadN);
        versionDoWhile(cantidadN);
    }

    public static void versionWhile(int cantidadN){
        int i = 0; int max = 0; int min = 0; int suma = 0;

        while (i < cantidadN) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el "+ (i+1)+ " número:");
            int num = input.nextInt();
            if (i == 0) { max = num; min = num; suma = num;
            } else {
                suma += num;
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            } i++;
        }
        int promedio = suma / cantidadN;
        System.out.println("El promedio de los números es de "+ promedio+ ", mientras que el mayor número es "+ max+ " y el menor número es "+ min+ ".");
    }

    public static void versionDoWhile(int cantidadN){
        int i = 0; int max = 0; int min = 0; int suma = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el "+ (i+1)+ " número:");
            int num = input.nextInt();
            if (i == 0) { max = num; min = num; suma = num;
            } else {
                suma += num;
                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                }
            } i++;
        } while (i < cantidadN);
            int promedio = suma / cantidadN;
        System.out.println("El promedio de los números es de "+ promedio+ ", mientras que el mayor número es "+ max+ " y el menor número es "+ min+ ".");
    }

}
