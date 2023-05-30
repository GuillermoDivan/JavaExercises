/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

import java.util.Scanner;

public class Ej1Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = input.nextInt();

        convertirMinutos(minutos);
    }

    public static void convertirMinutos(int minutos){
        int horas = 0;
        int dias = 0;
        while (minutos > 59) { horas++; minutos -= 60;}
        while (horas > 23) { dias++; horas -= 24;
            }
        System.out.println("El tiempo ingresado equivale a "+ dias+ " días, "+ horas+ " horas y "+ minutos+ " minutos.");
    }
}
