package ejerciciosextra;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione los vectores");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        Arrays.equals(vector1, vector2);
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
        boolean retorno = vectores(vector1, vector2, n);
        System.out.println("Los valores de ambos vectores son iguales? " + retorno);
    }

    public static boolean vectores(int[] vector1, int[] vector2, int n) {
        boolean igualdad = false;
        for (int i = 0; i < n; i++) {
            igualdad = (Arrays.equals(vector1, vector2));
        }
        return igualdad;
    }

}
