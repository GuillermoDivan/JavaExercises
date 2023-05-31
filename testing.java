import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        System.out.println("Por favor ingrese dos numeros enteros positivos: ");
        int num1 = Leer.nextInt();
        int num2 = Leer.nextInt();
        boolean ciclo = true;

        while (ciclo = true) {

            System.out.println("********MENÚ********\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir");
            System.out.println("Elija una opción: ");
            int opcion = Leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede diviir por 0");
                    } else {
                        System.out.println("La division de los números es: " + ((double)num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir del programa (S/N)?");
                    String salir = Leer.next();
                    switch (salir) {
                        case "S":
                            ciclo = false;
                            break;
                        case "N":
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Ha introducido una opción invalida");
                            break;
                    }
                    break;
                default:
                    System.out.println("Ha introducido una opción invalida");
            }
            System.out.println("");
        }

    }

}