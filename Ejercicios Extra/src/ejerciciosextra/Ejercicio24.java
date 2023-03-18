package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione el vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        Fibonacci(vector, n);
    }

    public static void Fibonacci(int[] vector, int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            vector[i] = a + b;
            a = b;
            b = vector[i];
        }
        System.out.println("");
    }

}
