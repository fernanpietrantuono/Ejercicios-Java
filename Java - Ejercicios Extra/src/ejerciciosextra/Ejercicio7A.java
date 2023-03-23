package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio7A {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int num;
        int valorMin = 1000;
        int valorMax = 0;
        System.out.println("Ingrese el valor de N");
        int n = leer.nextInt();
        while (i < n) {
            System.out.println("Ingrese un número " + (i + 1));
            num = leer.nextInt();
            if (num < valorMin) {
                valorMin = num;
            } else if (num > valorMax) {
                valorMax = num;
            }
            suma += num;
            i++;
        }
        double promedio = suma / n;
        System.out.println("El nuevo valor mínimo es " + valorMin);
        System.out.println("El nuevo valor máximo es " + valorMax);
        System.out.println("El promedio de " + n + " números es " + promedio);
    }

}
