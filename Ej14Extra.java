/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.*/

import java.util.Scanner;
public class Ej14Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias a encuestar:");
        int familias = input.nextInt();
        int sumaHijxs = 0;
        int sumaEdades = 0;

        for (int i = 0; i < familias; i++){
            System.out.println("Ingrese la cantidad de hijxs en la familia "+ (i+1)+ ".");
            int hijxs = input.nextInt();
            sumaHijxs += hijxs;

            for (int j = 0; j < hijxs; j++){
                System.out.println("Ingrese la edad de le "+ (j+1)+ "° hijx.");
                int edades = input.nextInt();
                sumaEdades += edades;
            }
        }

        int promedioEdades = sumaEdades / sumaHijxs;
        System.out.println("El promedio de edades de todas lxs hijxs de las familias es de "+ promedioEdades+ ".");

    }

}
