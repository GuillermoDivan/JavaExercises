/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
		"a": letra = "@";
		"e": letra = "#";
		"i": letra = "$";
		"o": letra = "%";
		"u": letra = "*";
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente.
Ejemplo, "Ayer, lunes, salimos a las once y 10." -> " @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. "
NOTA: investigue el uso de la función concatenar.*/


import java.util.Scanner;
import java.lang.*;

public class EjB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase breve.");
        String frase = input.nextLine();
        String resultado = reemplazo(frase);
        System.out.println(resultado); //No imprime.
    }

    public static String reemplazo(String frase) {
    String concatenar = "";

    for(int i = 0; i < frase.length(); i++){
        String letra = frase.substring(i,i); //Está bien? Luego no imprime letra.
        letra = letra.toLowerCase();
        //System.out.println("ingresó al for");
        switch (letra) {
            case "a":
                letra = "@";
                break;
            case "e":
                letra = "#";
                break;
            case "i":
                letra = "$";
                break;
            case "o":
                letra = "%";
                break;
            case "u":
                letra = "*";
                break;
        }
        //System.out.println("salió del for"); //Debug. Anda.
        System.out.println(letra); // Debug. No imprime
        concatenar = concatenar + letra; //Para rearmar palabra cambiada;
        //EN JAVA EXISTE REPLACE?!
    } return concatenar;
    }
}
