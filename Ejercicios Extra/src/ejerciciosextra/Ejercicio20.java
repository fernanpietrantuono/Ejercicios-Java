package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dimensione el vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        LlenadoDelVector(vector, n);
    }
    
    public static void LlenadoDelVector(int [] vector, int n){
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            vector [i] = (int) (Math.random()*100);
        }
        ImpresionDelVector(vector, n);
    }
    
    public static void ImpresionDelVector(int [] vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
    }
}
