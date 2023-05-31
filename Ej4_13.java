import java.util.Scanner;

/*
Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
transformar el numero a cadena para realizar el ejercicio.
 */
public class Ej4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = scanner.nextInt();
        num = Math.abs(num);
        boolean resultado = EsCapicua(num);
        if (resultado) {
            System.out.println("El número " + num + " es capicúa.");
        } else {
            System.out.println("El número " + num + " NO es capicúa.");
        }
    }

    /*Para saber si es capicúa se hará una variable que vaya alojando el número original invertido, unidad
   por unidad. Para ello se hará una variable auxiliar = original que se irá dividiendo en 10 y truncando.
    Se requiere de una tercera variable (resto o módulo del auxiliar en 10) que se vaya agregando al número
    invertido y vuelta a vuelta multiplicando por 10 para dejar espacio a las nuevas unidades.
    Así hasta que el número original llegue a 0.*/
    /*Ver casos números de más de 8 cifras.*/
    public static boolean EsCapicua(int num) {
        boolean resultado = true;
        float auxiliar = num;
        float inverso = 0;
        float resto = 0;

        while (auxiliar > 0) {
            resto = auxiliar % 10;
            inverso = inverso * 10 + resto;
            auxiliar = auxiliar / 10;
            auxiliar = (int) auxiliar;
        }
        if (num != inverso) { resultado = false; }
        return resultado;
    }

}
