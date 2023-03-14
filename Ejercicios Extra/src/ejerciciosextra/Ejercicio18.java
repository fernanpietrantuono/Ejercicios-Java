package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Dimensione el tamaño del vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el "+(i+1)+"° número");
            vector [i] = leer.nextInt();
            suma=suma+vector [i];
        }
        System.out.println("El resultado es "+suma);
    }
    
}
