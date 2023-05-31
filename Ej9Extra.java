/* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */

import java.util.Scanner;
public class Ej9Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dividendo. Procure que sea entero positivo.");
        int dividendo = input.nextInt();
        System.out.println("Ingrese divisor. Procure que sea entero positivo.");
        int divisor = input.nextInt();

        divisionPorResta(divisor, dividendo);
    }

    public static void divisionPorResta(int divisor, int dividendo){
        int cociente = 0; int resto = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        if (dividendo < divisor) {
            resto = dividendo;
        }

        System.out.println("El cociente es "+ cociente+ " y el resto es "+ resto+ ".");
    }
}

