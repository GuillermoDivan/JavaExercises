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
        String centena = ""; String decena = ""; String unidad = "";

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                centena = String.valueOf(i);
                    decena = String.valueOf(j);
                    unidad = String.valueOf(k);
                    if (centena.equals("3")) {centena = "E"; }
                    if (decena.equals("3")) {decena = "E"; }
                    if (unidad.equals("3")) {unidad = "E"; }
                    System.out.println(centena+ "-"+ decena+ "-"+ unidad);
                }
            }
        }

    }
}
