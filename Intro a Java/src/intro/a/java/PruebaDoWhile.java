package intro.a.java;

import java.util.Scanner;

public class PruebaDoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese el número " + (i + 1));
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            }
            i++;
            if (num < 0) {
                continue;
            }
            suma += num;
            System.out.println("El resultado es " + suma);
        } while (i < 20);
    }

}
