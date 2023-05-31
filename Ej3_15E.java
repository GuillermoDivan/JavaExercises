
/* Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo
de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que
determine la hora de llegada a la ciudad B. */

import java.util.Scanner;

public class Ej3_15E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la hora de salida (sólo la hora)");
        int horaSalida = scanner.nextInt();
        System.out.println("Ingrese los minutos de salida (sólo minutos)");
        int minutoSalida = scanner.nextInt();
        System.out.println("Ingrese los segundos de salida (sólo segundos)");
        int segundoSalida = scanner.nextInt();
        System.out.println("Ingrese el tiempo que demoró (todo en segundos)");
        int tiempo = scanner.nextInt();

        int horaLlegada = 0;
        int minutoLlegada = 0;
        int segundoLlegada = 0;

        segundoLlegada = segundoSalida + tiempo;
        while (segundoLlegada > 59) {
            minutoLlegada++;
            segundoLlegada -= 60;
        }

        minutoLlegada = minutoLlegada + minutoSalida;
        while (minutoLlegada > 59) {
            horaLlegada++;
            minutoLlegada -= 60;
        }

        horaLlegada = horaLlegada + horaSalida;
        //Algún día hacer la corroboración para que no se pase de 24hs del día, ja.

        System.out.println("Saliendo a las "+ horaSalida+ ":"+ minutoSalida+ ":"+ segundoSalida+ " y tardando "+ tiempo+ " segundos, la hora de llegada será "+ horaLlegada+ ":"+ minutoLlegada+ ":"+ segundoLlegada+ ".");
    }
}
