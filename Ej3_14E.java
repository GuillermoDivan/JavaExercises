import java.util.Scanner;

/*Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
 invertido. Ejemplo, si se introduce 23 que muestre 32.*/

public class Ej3_14E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("Ingrese un número de dos cifras");
            input = scanner.nextLine();
        } while (input.length() != 2);

        String n1 = input.substring(0,1); //Para substring se pone inicial y final (no incluido).
        String n2 = input.substring(1,2); //Si final = longitud del string, se pone final+1.
        String cadena = n2+n1;

        System.out.println("Con un paso mágico, ahora "+ input+ " es "+ cadena+ ".");
    }
}
