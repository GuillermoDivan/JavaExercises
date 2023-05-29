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
Ejemplo, "Ayer, lunes, salimos a las once y 10." -> " @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10. " */


import java.util.Scanner;
import java.lang.*;

public class EjB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase breve.");
        String frase = input.nextLine();
        frase = frase.toLowerCase();
        String resultado = reemplazo(frase);
        System.out.println(resultado);
    }

    public static String reemplazo(String frase) {
        String aux = frase;
        aux = aux.replace("a", "@");
        aux = aux.replace("e", "#");
        aux = aux .replace("i", "$");
        aux = aux.replace("o", "%");
        aux = aux.replace("u", "*");
        return aux;
    }
}
