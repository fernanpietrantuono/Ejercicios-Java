package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random claseRandom = new Random();
        String numCadena = "";
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        System.out.println("Dimensione el vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            int randomInt = -1 + claseRandom.nextInt(1+1);
            randomInt = -1 + claseRandom.nextInt(2+10000);
            randomInt=randomInt-claseRandom.nextInt(2+9000);
            if (randomInt<0){
                randomInt=randomInt*(-1);
            }
            randomInt = -1 + claseRandom.nextInt((int) (2 + 10 * Math.pow(10, Math.random() * 4)));
            vector[i] = randomInt;
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            numCadena = String.valueOf(vector[i]);
            if (numCadena.length() == 1) {
                cont1 += 1;
            } else if (numCadena.length() == 2) {
                cont2 += 1;
            } else if (numCadena.length() == 3) {
                cont3 += 1;
            } else if (numCadena.length() == 4) {
                cont4 += 1;
            } else if (numCadena.length() == 5) {
                cont5 += 1;
            }
        }
        System.out.println("Cantidad de números de 1 dígito: " + cont1);
        System.out.println("Cantidad de números de 2 dígitos: " + cont2);
        System.out.println("Cantidad de números de 3 dígitos: " + cont3);
        System.out.println("Cantidad de números de 4 dígitos: " + cont4);
        System.out.println("Cantidad de números de 5 dígitos: " + cont5);
    }

}
