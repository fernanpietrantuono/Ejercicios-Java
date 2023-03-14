package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.println("Ingrese un número para la posición "+i);
            vector[i] = leer.nextInt();
        }
        
        for (int i = 99; i > 10; i--) {
            System.out.println("["+vector[i]+"]");
        }
        System.out.println("");
    }
}
