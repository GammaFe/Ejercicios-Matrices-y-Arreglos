
package ejercicios.matrices.y.arreglos;

import java.util.*;

public class EjerciciosMatricesYArreglos {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
 Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int posX = r.nextInt(5);
            int posY = r.nextInt(5);
     char[][] matriz = null;
            matriz[posY][posX] = '*';
    }
    }
    public static int[] lecturaDatos(String ingresada) {
        int pos[] = new int[2];
        while (ingresada.length() != 3) {
            System.out.println("LA cadena debe ser de solo 3 caracteres");
            ingresada = leer.next();
        }
        pos[0] = Character.getNumericValue(ingresada.charAt(0));
        pos[1] = Character.getNumericValue(ingresada.charAt(2));
        return pos;
    }

    public static char[][] creacionTalblero() {
        char[][] matriz = new char[6][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ' ';
                System.out.println("[]");
                System.out.println(" ");              
            }
           
                    }   
        
       
        
        return matriz;
    }

    public static char[][] intento(char[][] original, int[] coordenadas) {
        char matriz[][] = original;
        if (matriz[coordenadas[1]][coordenadas[0]] == '*') {
            System.out.println("BOOM");

        } else {
            System.out.println("No hay bomba");
        }
        matriz[coordenadas[1]][coordenadas[0]] = 'X';
        return matriz;
    }

}

//este es el ejercicio de Byron