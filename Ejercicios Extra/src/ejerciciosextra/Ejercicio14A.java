package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio14A {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        System.out.println("Ingrese la cantidad de hijos para cada una de las familias");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Familia " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad para el/la hijo/a n° " + (j + 1));
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }
        int cont = n * m;
        double promedio = suma / cont;
        System.out.println("La edad promedio de los hijos de todas las familias es " + promedio);
    }

}
