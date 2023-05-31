/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
public class Ej12Extra {
    public static void main(String[] args){
        int[][][] matriz = new int[10][10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    if (k == 3) {
                        String letra = String.valueOf(k);
                        System.out.println(letra);}
                    System.out.println(i+ "-"+ j+ "-"+ k);
                }
            }
        }

    }
}
