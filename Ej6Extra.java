/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
  debajo de 1.60 mts. y el promedio de estaturas en general.*/

import java.util.Scanner;
public class Ej6Extra {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas cuya altura promediará");
        int cantidadPersonas = input.nextInt();
        int personaBajita = 0;
        double sumaTotal = 0;

        for (int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese la altura de la "+ (i+1)+ " persona.");
            double altura = input.nextDouble();
            sumaTotal += altura;
            if (altura < 1.60) { personaBajita++; }
        }

        double promedioAlturas = sumaTotal/cantidadPersonas;
        System.out.println("El promedio de las alturas de las "+ cantidadPersonas+ " personas es de "+ promedioAlturas+ " y "+ personaBajita + " de ellxs miden menos de 1.60.");
    }
}
