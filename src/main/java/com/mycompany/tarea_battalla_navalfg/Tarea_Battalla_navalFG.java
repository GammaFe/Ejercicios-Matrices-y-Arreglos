
package com.mycompany.tarea_battalla_navalfg;
import java.util.Scanner;
import java.util.Random;
public class Tarea_Battalla_navalFG {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            while(true){
                System.out.println("* @@@  ** @    @ *");
                System.out.println("* @  @ ** @@   @ *");
                System.out.println("* @@@  ** @  @ @ *");
                System.out.println("* @  @ ** @   @@ *");
                System.out.println("* @@@  ** @    @ *");
        System.out.println("Buenos dias desea jugar una battalla naval 1/si 2/no");
        int respuesta = entrada.nextInt();
        //estas son todas las variables que no cambiaran en el transcuso del codigo
   int fila =6;
   int columna =5;    
   int cont1 = 0;
   int cont2 = 0;
   int cont3 = new Random().nextInt((4-0)+1)+0;
   int d5 = new Random().nextInt((5-0)+1)+0;//dado de 5
   String[][] tablero = new String[fila][columna];
   //int A=0; variable de prueba

        switch(respuesta){
            case 1:
                int jugador = 1;
                while ((jugador ==1)||(jugador == 2)||(jugador==3)){  // este ciclo while toma la variable jugador y va cambiando en el caso del turno de cada uno
                if (jugador == 1){
                   int[][] tableroB = new int[fila][columna];
        tableroB[1][3] = 1;
        tableroB[2][3] = 1;
        tableroB[3][3] = 1;
        tableroB[3][1] = 1;
        tableroB[4][1] = 1;
        tableroB[5][1] = 1;
        tableroB[5][3] = 1;
        tableroB[5][4] = 1;
                    System.out.println("Jugador 1 Ingrese coordenadas X");
                    int X = entrada.nextInt();
          
                    System.out.println("Jugador 1 Ingrese coordenadas Y");
                    int Y = entrada.nextInt();

                          if (tableroB[X][Y] == 1) {
           cont1 = cont1 + 1;
           System.out.println("“Uy, un barco ha sido dañado");    
       } else {
           if (tableroB[X][Y] != 1){
               System.out.println("Bomba al agua");
           }         
       }
        for (int i = 0; i < tableroB.length; i++) {// Recorre las Filas 
            for (int j = 0; j < tableroB[i].length; j++) {//Recorre cada Columna despues de recorrer la fila                               
                tablero[i][j]= " ";
                tablero[X][Y] = "X";
                    System.out.print("["+tablero[i][j] +"]");
                    }
                System.out.println("");
                }
                  jugador = jugador + 1;
                   if (cont1 == 3){
                        jugador = 5;
                    }
               
              
                    
                   
                    ///////////////////////////////////////////////////////////
                }else if (jugador==2){
                    int[][] tableroA = new int[fila][columna];
        tableroA[0][0] = 1;
        tableroA[0][1] = 1;
        tableroA[0][2] = 1;
        tableroA[1][2] = 1;
        tableroA[1][3] = 1;
        tableroA[3][4] = 1;
        tableroA[4][4] = 1;
        tableroA[5][4] = 1;
                    System.out.println("Jugador 2 Ingrese coordenadas X");
                    int X = entrada.nextInt();
                    
                    System.out.println("Jugador 2 Ingrese coordenadas Y");
                    int Y = entrada.nextInt();

                          if (tableroA[X][Y] == 1) {
           cont2 = cont2 + 1;
           System.out.println("“Uy, un barco ha sido dañado");    
       } else {
           if (tableroA[X][Y] != 1){
               System.out.println("Bomba al agua");
           }         
       }
        for (int i = 0; i < tableroA.length; i++) {// Recorre las Filas 
            for (int j = 0; j < tableroA[i].length; j++) {//Recorre cada Columna                               
                tablero[i][j]= " ";// usando una matriz de strings para imprimir
                tablero[X][Y] = "X";
                    System.out.print("["+tablero[i][j] +"]");
                    }
                System.out.println("");
                }                 
                 jugador = jugador - 1;// recordar volver a comentar
                //  jugador = jugador + 1;// el comentario quitar si se siente con suerte
                   if (cont2 == 3){
                        jugador = 5;
                    }
                //////////////////////////////////////////////////////////////////////--------
                //Si se siente con suerte quitar (/*) de la linea 111 y 145
             /*   }else if (jugador==3){
                    int[][] tableroC = new int[fila][columna];
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
        tableroC[d5][d5] = 1;
                    System.out.println("Jugador 3 adivine coordenadas X");
                    int X = entrada.nextInt();
                    
                    System.out.println("Jugador 3 adivine coordenadas Y");
                    int Y = entrada.nextInt();

                          if (tableroC[X][Y] == 1) {
           cont3 = cont3 + 1;
           System.out.println("“Uy, un barco ha sido dañado");    
       } else {
           if (tableroC[X][Y] != 1){
               System.out.println("Bomba al agua");
           }         
       }
        for (int i = 0; i < tableroC.length; i++) {// Recorre las Filas 
            for (int j = 0; j < tableroC[i].length; j++) {//Recorre cada Columna                               
                tablero[i][j]= " ";
                tablero[X][Y] = "X";
                    System.out.print("["+tablero[i][j] +"]");
                    }
                System.out.println("");
                }                  
                  jugador = jugador - 2;
                   if (cont3 == 3){
                        jugador = 5;
                    }*/
                }
               
                }
                break;
            case 2://en el caso de que el usuario escoja 2 el programa automaticamente termina
                System.exit(0);
                break;
            default:// recordatorio para que el usuario se mantenga en el programa
                   System.out.println("Ingrese 1 para si y 2 para no");
                break;
        }
            
        }
             
        
    }
}
    //fuera del main
/*
     public static void BattallaNavaljugador2(String[][] tablero, int X,int Y, int cont1){// intentO de funcion tablero del jugador 1
       Scanner entrada = new Scanner(System.in);
        int[][] tableroA = new int[5][4];
        tableroA[0][0] = 1;
        tableroA[0][1] = 1;
        tableroA[0][2] = 1;
        tableroA[1][2] = 1;
        tableroA[1][3] = 1;
        tableroA[3][4] = 1;
        tableroA[4][4] = 1;
        tableroA[5][4] = 1;
        if (tableroA[X][Y]  == 1) {
                     cont1 = cont1 + 1;
                     System.out.print("Hit");
                     
        } else if (tableroA[X][Y] != 1){
                    System.out.print("Miss");
            }
        tablero[X][Y] = "X";
        for (int i = 0; i < tablero.length; i++) {// Recorre las Filas 
            for (int j = 0; j < tablero[i].length; j++) {//Recorre cada Columna 
                tablero[i][j] = " ";
                if (tableroA[X][Y]  == 1) {
                         tablero[X][Y] = "X";                 
        } 
                    System.out.print("["+tablero[i][j] +"]");
                    }
                System.out.println("");
                }
     }
     
    public static void BattallaNavaljugador1(int fila, int columna, int X,int Y){// este es el tablero del jugador 2
        Scanner entrada = new Scanner(System.in);
        int[][] tableroB = new int[fila][columna];
        tableroB[1][3] = 1;
        tableroB[2][3] = 1;
        tableroB[3][3] = 1;
        tableroB[3][1] = 1;
        tableroB[4][1] = 1;
        tableroB[5][1] = 1;
        tableroB[5][3] = 1;
        tableroB[5][4] = 1;
        
    }
    public static String[][] colocador(String[][] matriz,int X,int Y) {
        Scanner entrada = new Scanner(System.in);
       
        for (int i = 0; i < matriz.length; i++) {// Recorre las Filas 
            for (int j = 0; j < matriz[i].length; j++) {//Recorre cada Columna 
                matriz[X][Y]="X";          
                    matriz[i][j] = " ";
                }
            
        }

        return matriz;
    }
}*/
     

    //El Cuarteto de Nos o “ya está cuanta ambigüedad” letra de cancion
//El Cuarteto de Nos o “Yo quiero elegir con qué veneno envenenarme”.
//definitivamente si se puede los puntos al laboratorio
//este es el ejercicio de Fernando