/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

import java.util.Scanner;
import java.lang.*;

public class Ej14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en Euros");
        double euros = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ingrese la moneda a convertir ('Dolares', 'Libras', o 'Yenes').");
        String moneda = input2.nextLine();
        convertirEuros(euros, moneda);
    }

    public static void convertirEuros(double euros, String moneda){
        if (moneda.equalsIgnoreCase("dolares")) {
            double dolares = euros * 1.28611;
            System.out.println(euros + " euros equivalen a " + dolares + " dolares.");
        } else if (moneda.equalsIgnoreCase("libras")){
            double libras = euros * 0.86;
            System.out.println(euros+ " euros equivalen a "+ libras+ " libras.");
        } else if (moneda.equalsIgnoreCase("yenes")){
            double yenes = euros * 129.852;
            System.out.println(euros+ " euros equivalen a "+ yenes+ " yenes.");
        } else {
            System.out.println("Moneda no reconocida.");
        }

    }
}
