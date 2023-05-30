/* Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/

import java.util.Scanner;

public class Ej5Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letra = "qq";
        do {
            System.out.println("Ingrese solamente una letra correspondiente al plan (A, B, C)");
            letra = input.nextLine();
        } while (letra.length() > 1 || (!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("B") && !letra.equalsIgnoreCase("C")));

        determinarCoseguro(letra);
    }

    public static void determinarCoseguro(String letra){
        double tratamiento = 25000;
        if (letra.equalsIgnoreCase("a")) { tratamiento = tratamiento * 0.5;
            System.out.println("El coste del plan A es de $"+ tratamiento+ ".");}
        else if (letra.equalsIgnoreCase("b")) { tratamiento = tratamiento * 0.35;
            System.out.println("El coste del plan B es de $"+ tratamiento+ ".");}
        else {
            System.out.println("El coste del plan C es de $"+ tratamiento+ ".");
        }
    }
}
