/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
*/

public class Ej21 {

    public static void main(String[] args){
        int[][] matrizP = crearMatrizP();
        System.out.println("");
        int[][] matrizM = crearMatrizM();
        System.out.println("");
        comprobarSubmatrices(matrizM, matrizP);
    }

    public static int[][] crearMatrizP(){
        int[][] matrizP = {{36, 05, 67},{89, 90, 75},{14, 22, 26}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrizP[i][j]+ "|");
            }
            System.out.println("");
        }
        return matrizP;
    }

    public static int[][] crearMatrizM(){
        int[][] matrizM = {{00, 00, 00, 36, 00, 00},{00, 00, 05, 00, 00, 00},{00, 00, 36, 05, 67, 00},{00, 00, 89, 90, 75, 00},{00, 00, 14, 22, 26, 00},{00, 00, 00, 36, 26, 00},};

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(matrizM[i][j]+ "|");
            }
            System.out.println("");
        }
        return matrizM;
    }
    public static void comprobarSubmatrices(int[][] matrizM, int[][] matrizP){
        boolean submatrizHallada = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    if (matrizM[i][j + 1] == matrizP[0][1]) {
                        if (matrizM[i][j + 2] == matrizP[0][2]) {
                            if (matrizM[i + 1][j] == matrizP[1][0]) {
                                if (matrizM[i + 1][j + 1] == matrizP[1][1]) {
                                    if (matrizM[i + 1][j + 2] == matrizP[1][2]) {
                                        if (matrizM[i + 2][j] == matrizP[2][0]) {
                                            if (matrizM[i + 2][j + 1] == matrizP[2][1]) {
                                                if (matrizM[i + 2][j + 2] == matrizP[2][2]) {
                                                    submatrizHallada = true;
                                                    System.out.println("La submatriz fue hallada desde la celda ["+ i+ "]["+ j+ "].");
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("¿La submatriz fue hallada? "+ submatrizHallada);
            }
        }
