package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño");
        int num = leer.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == num) {
                    System.out.println(" * ");
                } else if (i == 1 || i == num) {
                    System.out.print(" * ");
                } else if (j > 1 && j < num) {
                    System.out.print("   ");
                } else if (j == 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
