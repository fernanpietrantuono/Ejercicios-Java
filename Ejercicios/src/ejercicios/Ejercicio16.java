package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont =0 ;
        System.out.println("Ingrese un tamaño para el vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        System.out.println("Ingrese un número a buscar");
        int buscar = leer.nextInt();
        for (int i = 0; i < n; i++) {
            int verificador = vector[i]-buscar;
            if (verificador==0){
                cont = cont + 1;
                System.out.println("Se encontró el número buscado "+buscar
                +" en la posición "+i);
            }
        }
        if (cont==0){
            System.out.println("No se encontró ninguna posición para el número "+buscar);
        }
        System.out.println("El total de números ("+buscar+") en el vector es "+cont);
    }
}
