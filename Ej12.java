/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Length(), equals().
*/


import java.util.Scanner;
import java.lang.*;

public class Ej12 {
    public static void main(String[] args) {
        RS232();
        }
        public static void RS232() {
        int correctas = 0;
        int incorrectas = 0;
        String FDE = "&&&&&";
        String cadena = "";

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese una cadena de caracteres");
            cadena = input.nextLine();

            if (cadena.length() <= 5) {
                if (cadena.startsWith("X")) {
                    if (cadena.endsWith("O")) {
                        System.out.println("Cadena correcta: " + cadena);
                        correctas++;
                    } else if (cadena.equals(FDE)) {
                        break;
                    } else { System.out.println("Cadena incorrecta: " + cadena);
                        incorrectas++;
                    }
                }
            }
        } while (!cadena.equals(FDE));

            System.out.println("Cantidad de cadenas correctas: "+ correctas+ ". Cantidad de cadenas incorrectas: "+ incorrectas+ ".");

    }
}
