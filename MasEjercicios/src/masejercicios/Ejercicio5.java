package masejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int aux = 0;
        System.out.println("Antes: ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Después: ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

    }

}
