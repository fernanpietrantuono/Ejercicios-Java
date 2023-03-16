package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione la matriz");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        LlenadoDeLaMatriz(matriz, n);
    }

    public static void LlenadoDeLaMatriz(int[][] matriz, int n) {
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        SumaDeLosValores(matriz, n);
    }

    public static void SumaDeLosValores(int[][] matriz, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Tamaño de la matriz dimensionada: " + n);
        System.out.println("El resultado de la suma de todos los valores de la matriz es " + suma);
    }

}
