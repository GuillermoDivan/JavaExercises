/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

import java.util.Scanner;
public class Ej3Extra {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String letra = "qq";
         do {
            System.out.println("Ingrese solamente una letra");
            letra = input.nextLine();
        } while (letra.length() > 1);

         if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
             System.out.println("Se trata de una vocal.");
        } else {
             System.out.println("Esta letra no es una vocal... ¡o está acentuada!");
         }
    }
}
