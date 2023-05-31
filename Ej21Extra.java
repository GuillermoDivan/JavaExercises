/* Dadas las notas adquiridas por 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso. */

import java.util.Scanner;
public class Ej21Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes que desea cargar en sistema");
        int estudiantes = input.nextInt();
        int notas = 4;

        double[][] matriz = cargarNotas(estudiantes, notas);
        double[][] matriz2 = ponderarNotas(matriz, estudiantes, notas);
        cantidadAprobadxs(matriz2, estudiantes, notas);
    }

    public static double[][] cargarNotas(int estudiantes, int notas) {
        double[][] matriz = new double[estudiantes][notas];

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < notas; j++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Ingrese la " + (j + 1) + "° nota");
                matriz[i][j] = input.nextDouble();
            }
        }
        return matriz;
    }

    public static double[][] ponderarNotas(double[][] matriz, int estudiantes, int notas) {
        double[][] matriz2 = new double[estudiantes][notas + 1];

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < notas + 1; j++) {
                if (j == 0) {
                    matriz2[i][0] = matriz[i][0] * 0.1;
                }
                if (j == 1) {
                    matriz2[i][1] = matriz[i][1] * 0.15;
                }
                if (j == 2) {
                    matriz2[i][2] = matriz[i][2] * 0.25;
                }
                if (j == 3) {
                    matriz2[i][3] = matriz[i][3] * 0.50;
                }
                if (j == notas) {
                    matriz2[i][notas] = (matriz[i][0] + matriz[i][1] + matriz[i][2] + matriz[i][3]) / notas;
                }
            }
        }
        return matriz2;
    }

    public static void cantidadAprobadxs(double[][] matriz2, int estudiantes, int notas) {
        int aprobadxs = 0;
        int desaprobadxs = 0;

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < notas + 1; j++) {
                if (j == notas) {
                    if (matriz2[i][notas] >= 7.00) {
                        aprobadxs++;
                    } else {
                        desaprobadxs++;
                    }
                }
            }
        }
        System.out.println("Cantidad de aprobadxs: "+ aprobadxs+ ". Cantidad de desaprobadxs: "+ desaprobadxs);
    }
}