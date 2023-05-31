/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/

public class Ej20Extra {
    public static void main(String[] args){
        int[][] array = new int[3][3];
        MetodosUtiles.aleatorizarEnterosMatriz(array);
        MetodosUtiles.mostrarMatriz(array);

    }
}
