package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        division(num1, num2);
    }

    public static void division(int num1, int num2) {
        int cont = 0;
        do {
            cont = cont + 1;
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            System.out.println("El resto es " + num1);
            System.out.println("El cociente es " + cont);
        } while (num1 > num2);
    }
}
