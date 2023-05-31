import java.util.Scanner;
import java.lang.*;

/*
Hacer un programa que permita ingresar una muestra completa, detectar si es válida, y de ser así, que
imprima la matriz y muestre un mensaje que indique si se ha detectado o no el gen Z.
Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro posibles bases (A,B,C,D).
Para que la muestra sea válida  el orden de la matriz  debe ser 3x3, 4x4 o 37x37 (según la muestra).
El valor de entrada tiene que ser una palabra COMPLETA de 9 caracteres, de 16 caracteres o de 1369 caracteres.
Los valores de entrada deberán ser una cadena continuada de caracteres. No se puede pedir de a una letra
y no puedes preguntar la dimensión de la matriz (la dimensión se tiene que deducir de la muestra).
Para poder detectar el genZ, se representa la muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales
principales que todas las celdas sean iguales.
 */

public class EjZombies {
    public static void main(String[] args) {

        String muestra = validarMuestra();
        int largoMuestra = muestra.length();
        int vector = (int) Math.sqrt(largoMuestra);
        String[][] matriz = ubicarMuestra(muestra, vector);
        imprimirMuestra(matriz, vector);
        boolean test1 = test1(matriz, vector); //Devuelve diagonal 1, donde j == i.
        boolean test2 = test2(matriz, vector); //Devuelve diagonal 2, donde i == n-1-j.
        boolean resultado = resultadoFinal(test1, test2); //Compara true/false para ambas diagonales.

        if (resultado) {
            System.out.println("ESTA PERSONA ESTÁ INFECTADA CON EL GEN Z");
        } else {
            System.out.println("Esta persona está sana, por ahora.");
        }
    }
    public static String validarMuestra () {
        String muestra;
        boolean validacion1;
        boolean validacion2;
        do {
            validacion1 = true;
            validacion2 = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la muestra de ADN. Recuerde que debe tratarse de una cadena de 9, 16 o 1369 caracteres.");
            muestra = scanner.nextLine();

            //Casos control.
            //muestra = "CACBCACAC"; //1. Verdadero.
            //muestra = "ADDDABBDD"; //2. Falso.
            //muestra = "CDDACCACCACAAABC"; //3. Verdadero.
            //muestra = "ABAABBCBD"; //4. Falso.
            //muestra = "BCBBABBACBBBBCBB"; //5. Verdadero.
            //muestra = "BCAADCCBABCCBABB"; //6. Falso.
            //muestra = "CCADDBACCDDDDBDBCCABBAABDBCDCADDABABCDCDDABBBCABBABBDCADCCDABDDACDBBBDBDCCDDCABCAAAACDCDCCACDCDDADAADDACBDBCCDDBCBCBBAAADDAADCAABBBCBCCBCBDBCCBBCBABADAACDBDBADCBBACDADAADABBDBDBDBDCCDDCABCCCCCADBBBBCCDACCBBBDBDAADDBCCBCCBCBDDDDCCBAAACDDBBCAABAADABBBCCCCDCCBBDCDABCDACBCBACDBCCDABDBDCDCADCCBBADDBDCCADCCDCCACCDCDBCDBBADBAADBBCAADDABCAADADAABAACCBABDADADADDBCABDCCBBAADDDCDDCBADBCACCAAADCCDDABDBACBCAAADDBADBDACDDBDCBDCCCDDCACBCCCACCCCBACBAAAAACBCBCDAADCAACBCABDDABCBCBACCADABBBABBBBBAACADDDDBABACADAAABDDDCCDCACAACACADADBABACBABDBBADCDBBDACDCAABCADDBDBDCAABDCDABDDADDCDDBCBCDADCDBBDACABCDAABBCBADDDBCBADCABACDCABBCBCBCBCADBABBDBCCCADCADDCBABBDDDBBCBCDABACDDDABCCDBACCBDBADADDDAAACBDCDCCAACBDDCDCBADACDDDDBDCBAACDADBBDBDBCCACADBAABBAADAADDDACDDCDBDDBBDAADDAACCCACDBBBBBDCDCDDDABBCBAAADACADDCDCDCBCDCACAAABCADBDBBDDACCBBDABDDBCADCCCADDCDBACBBBDAADDCDAAADBBCDADBDBCBDDCAABCCDCCDCABCAACADADAACADDBBDABAABACDACDCDBBDDCCBCBCAAACBDBDBBBDBDBBCADCBACDCCBDACBBACBCADCDBACCADCDBDCDBBACBBCDCAAAAABCCDDCDDBBCBABCBCAABDBCCACBABDCABAACBDBDBCCCCADBBCDCCCAABADBACDDBADCDCAADDDCBDDBDCDCCCCCCCDBCDDBACBBCDACDADCACBDBBCCCDCCBCBCDACBDDDACCCAADBDBBDADDCCDDDBCDABCCBACCCCCBAACCBCABAAABBCABBCACCCABCDACBCDBDACACDDCACBCBBCCADABCBBDDABADDAAABACCBDCDABCBBBBACCDABAACDCACCCBBCDDACCDBCBCBAACBBBBADBCBCDABAAAABADAAAACDACADACDBBCCABADDDCACDCAACCDABBDBDAABADDBDCCCACDADBDDDCBBCBDCADCBCDAABDDDDBBBBCDDCC";
            // 7. Verdadero.
            //muestra = "ACCDBBADDDCCBACABDCBDCBADBDACBBBBDAABBCCBAACCABDBDCDDABDBDADAAACBBBBCDDDCBBBDDCDABBDDABDBDBBACADCDAAADACDDDACCDCACDDABACDCCCAABDDCCACDADDBCBAACCDBCBCDDDCAACCBAADCBBBCDCBBACBDCCDDADBABCAABBACABDCAACCBDADDCAAACCDBDBBCDDDDDACBCDDADDDDCBADADBDCADDABBCDAACBCCDDDADDADADAACCACDCDDABCCCADABBACDACCAADDBCBCCDADBCCADAAABDDDAABBABCADDCCAADDCDDCDCACBADADACADDAADCBDBCDBDDACDCBCDCCABBDCBACDDACCCDADBCADCACAAABBBCADDDDBCBACDBDAAADDDACCDACBBBADACCCDCACCBACDADBCBBDADACABAACBCCADDCCCCACCCCADBCCDAADCAABBABAADDBDADDABABCCABBCDDACCADAAADBBCCDBADCADCBBDADACCDDBCAAABBBDCAAAACBAADBABBABACDDBBCBDCDCADABABBDADCBADAACDBCBDABADBCBADCACADAABCDDCABACDDBDCBCBDCAAACBDABBCACBACCCBACACDCADBDCDCDDCAACDBDCBACDBBDAABDBBCBAAADBABDBAACAAACDCDAAABABDDDBCACADCBBAADCCDABCCCBBCACCBAABDAADDDCDACDDDBCDCCBABDABACCDCDCDABAABCABBADADCBDDACDDCDDCDACDADADCACBCDABABDDCCDBCCDABACDBDAABDBDDDBADDBACABDCDDBACDDBBDDBBACBCCAACABBDADDBCAACCBCCDADDBCAADDADCCCBAAABABBBBBCABAACADBCBBABACCABCDAABADCCCCDCCADDDCCABBDDDAAADDADACBBBCBDAADACABABBAACCCADADDABDBCADDDCCDBBCCBCDCDBDDDDCACDACDBBBDDBADDACADDADDABCACDCBBADDABBBDCBBDCDAABADDDDDBCACCCCAAACBCBCDBACCCDACCCDBCBDCBADBCDDACCDBDBDBCAAACDDCBAABDBCAADCADDBABABDCBCBCBBBCACBCADDCAAAAAACBBACBBCCACBDCDDDDADCAAACBABDDBDADBAADCBABDDBCDBABDBAADDDBACBBBCCCDBDDBDDAADBBADADDDCBCACBABCDBBABAADABCABCDBACBBBCDBADADDBDCBDABBDDDCDDCCACDCBDCADABAABCDCAACCDDBADBDBCDACAAACBCADCCCBAC";
            // 8. Falso.

            muestra = muestra.toUpperCase();
            int largoMuestra = muestra.length();

            for (int i = 0; i < largoMuestra - 1; i++) {
                String letra = muestra.substring(i, i);
                System.out.println(letra);
                if ((letra.equals("A")) && (letra.equals("B")) && (letra.equals("C")) && (letra.equals("D")) && (validacion1 == true)) {
                    System.out.println("Ha habido un error. Uno de los genes detectados no es reconocible. Ingrese caracteres A, B, C o D.");
                    validacion1 = false;
                    break;
                }
            }

            if ((largoMuestra == 9) || (largoMuestra == 16) || (largoMuestra == 1369)) {
                validacion2 = true;
                System.out.println("Muestra validada, aguarde unos segundos mientras se realizan los análisis necesarios.");
            } else {
                System.out.println("Muestra no válida. Intente nuevamente.");
            }

        } while ((validacion1 == false) || (validacion2 == false));

        return muestra;
    }

    public static String[][] ubicarMuestra(String muestra, int vector) {
        String auxiliar = muestra;
        String[][] matriz = new String[vector][vector];

        for (int i = 0; i < vector; i++) {
            for (int j = 0; j < vector; j++) {
                matriz[i][j] = auxiliar.substring(j, j+1);
            }
            auxiliar = auxiliar.substring(vector);
        }
        return matriz;
    }

    public static void imprimirMuestra(String[][] matriz, int vector) {
        for (int i = 0; i < vector; i++) {
            for (int j = 0; j < vector; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public static boolean test1(String[][] matriz, int vector) {
        boolean test1 = false;
        boolean reactivo1 = true;
        String valorInicial = matriz[0][0];

        for (int i = 0; i < vector; i++) {
            for (int j = 0; j < vector; j++) {
                if ((i == j) && (valorInicial != matriz[i][j])) {
                    reactivo1 = false; break;
                }
            }
        }

        if (reactivo1) { test1 = true; }
        return test1;
    }

    public static boolean test2(String[][] matriz, int vector) {
        boolean test2 = false;
        boolean reactivo2 = true;
        String valorInicial = matriz[0][vector-1];

        for (int i = 0; i < vector; i++) {
            for (int j = 0; j < vector; j++) {
                if ((i == vector-1-j) && (valorInicial != matriz[i][j])) {
                    reactivo2 = false; break;
                }
            }
        }

        if (reactivo2) { test2 = true; }
        return test2;
    }

    public static boolean resultadoFinal(boolean test1, boolean test2) {
        boolean resultado = false;
        if ((test1) && (test2)) { resultado = true;}
        return resultado;
    }

}