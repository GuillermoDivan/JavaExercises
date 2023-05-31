import java.util.Scanner;

/* Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de
una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio */

public class Ej2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresá el radio de la circunferencia, si te atreves!!");
        double radio = scanner.nextFloat();

        double area = Math.PI * Math.pow(radio,2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Dado el radio "+ radio+ " se obtiene un área de "+ area+ " y un perímetro de "+ perimetro+ ".");
    }
}
