package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione el tamaño del cuadrado");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        /*Llenado de la matriz*/
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + i + ":");
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un número para la posición " + i + "," + j);
                matriz[i][j] = leer.nextInt();
                while ((matriz[i][j] < 0) || (matriz[i][j] > 9)) {
                    System.out.println("El valor ingresado no está dentro de "
                            + "los parámetros. Por favor intente nuevamente");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        boolean retorno = CheckMagico(matriz, n);
        System.out.println("La matriz es mágica? " + retorno);
    }

    public static boolean CheckMagico(int[][] matriz, int n) {
        if (CheckFilas(matriz, n)) {
            if (CheckColumnas(matriz, n)) {
                return CheckDiagonales(matriz, n);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean CheckFilas(int[][] matriz, int n) {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Fila: " + i);
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                if (i == 0) {
                    suma1 += matriz[i][j];
                }
                if (i == 1) {
                    suma2 += matriz[i][j];
                }
                boolean comp = (suma1 == suma2);
                if (i == 2 && comp == true) {
                    suma3 += matriz[i][j];
                }
            }
            System.out.println(" ");
            System.out.println(" ");
        }
        System.out.println(" ");
        boolean filas = (suma2 == suma3);
        return filas;
    }

    public static boolean CheckColumnas(int[][] matriz, int n) {
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        for (int j = 0; j < n; j++) {
            System.out.println("Columna: " + j);
            for (int i = 0; i < n; i++) {
                System.out.println("[" + matriz[j][i] + "]");
                if (j == 0) {
                    suma1 += matriz[j][i];
                }
                if (j == 1) {
                    suma2 += matriz[j][i];
                }
                boolean comp = (suma1 == suma2);
                if (j == 2 && comp == true) {
                    suma3 += matriz[j][i];
                }
            }
            System.out.println(" ");
            System.out.println(suma1);
            System.out.print(" ");
            System.out.println(" ");
        }
        boolean columnas = (suma2 == suma3);
        return columnas;
    }

    public static boolean CheckDiagonales(int[][] matriz, int n) {
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma1 += matriz[i][i];
        }
        int j = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            suma2 += matriz[i][j];
            j--;
        }
        boolean diagonales = (suma1 == suma2);
        return diagonales;
    }

}
