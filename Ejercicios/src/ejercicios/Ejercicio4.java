package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual en grados Celsius");
        int C = leer.nextInt();
        int F = 32 + (9 * C / 5);
        System.out.println("La temperatura actual en grados Fahrenheit es de " + F + "° F");
    }

}
