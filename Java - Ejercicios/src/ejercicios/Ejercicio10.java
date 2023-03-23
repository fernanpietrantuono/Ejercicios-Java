package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un valor límite");
        int valorLimite = leer.nextInt();
        while (suma < valorLimite) {
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Resultado: " + suma);
        }
    }

}
