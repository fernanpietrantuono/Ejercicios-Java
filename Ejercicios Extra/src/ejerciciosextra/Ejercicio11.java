package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        while (num > 0) {
            num /= 10;
            cont++;
        }
        System.out.println("El número tiene " + cont + " dígitos");
    }

}
