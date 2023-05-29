/* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/

public class Ej18 {
    public static void main(String[] args) {
       int[][] matriz1 = generarMatriz();
        System.out.println("");
        System.out.println("");
        trasponerMatriz(matriz1);
    }

    public static int[][] generarMatriz(){
        int[][] matriz1 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + matriz1[i][j] + "], ");
            }
            System.out.println("");
        }
        return matriz1;
}

public static void trasponerMatriz(int[][] matriz1){
    int[][] matriz2 = new int[4][4];

    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 4; i++) {
            matriz2[i][j] = matriz1[i][j];
            System.out.print("[" + matriz2[i][j] + "], ");
        }
        System.out.println("");
    }
}

}
