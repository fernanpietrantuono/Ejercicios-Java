package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux = 0;
        System.out.println("Ingrese los números");
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = leer.nextInt();
        int d = leer.nextInt();
        System.out.println(" ");
        System.out.println("Valor inicial de A = " + a);
        System.out.println("Valor inicial de B = " + b);
        System.out.println("Valor inicial de C = " + c);
        System.out.println("Valor inicial de D = " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println(" ");
        System.out.println("Valor final de A = " + a);
        System.out.println("Valor final de B = " + b);
        System.out.println("Valor final de C = " + c);
        System.out.println("Valor final de D = " + d);
    }
}
