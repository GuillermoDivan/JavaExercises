import java.util.Scanner;

public class MetodosUtiles {
    public static void main(String[] args){
    }

    //generarMatriz() para completarla por teclado.
    public static int[][] generarMatriz() {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresá el número para la casilla [" + i + "][" + j + "].");
                matriz1[i][j] = input.nextInt();
            }
        }
        return matriz1;
    }

    //mostrarMatriz() para imprimir.
    public static void mostrarMatriz(int[][] matriz1) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[i][j] + "], ");
            }
            System.out.println("");
        }
    }

    //aleatorizarEnterosMatriz para completar matriz con enteros.
    public static void aleatorizarEnterosMatriz(int[][] matriz1){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                //System.out.print("[" + matriz1[i][j] + "]");
            } //System.out.println("");
        }
    }

    //trasponerMatriz() para trasponer sin imprimir.
    public static int[][] trasponerMatriz(int[][] matriz1){
    int[][] matriz2 = new int[4][4];

    for (int j = 0; j < 4; j++) {
        for (int i = 0; i < 4; i++) {
            matriz2[i][j] = matriz1[j][i];
        }
    }
    return matriz2;
}


}





