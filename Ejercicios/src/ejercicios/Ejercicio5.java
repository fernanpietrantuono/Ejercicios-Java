package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        double cuad = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        double raiz = Math.sqrt(num);
        System.out.println("El número elevado al cuadrado es " + Math.round(cuad));
        System.out.println("El número elevado al cubo es " + Math.round(cubo));
        System.out.println("La raíz cuadrada de " + num + " es " + Math.round(raiz));
    }

}
