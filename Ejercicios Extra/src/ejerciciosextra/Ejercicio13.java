package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para dimensionar la escalera");
        int num = leer.nextInt();
        Escalera(num);
    }

    public static void Escalera(int num) {
        int acum = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                acum = j + acum;
                if (j != 1) {
                    System.out.print(j);
                } else {
                    System.out.print(j);
                    j = 1;
                }
            }
            System.out.println("");
        }
    }
}
