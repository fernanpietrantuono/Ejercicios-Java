package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tu nombre");
        String nombre = leer.nextLine();
        System.out.println("¡Hola mundo, soy " + nombre + " y estoy programando por primera vez en Java!");
    }

}
