package intro.a.java;

import java.util.Scanner;

public class PruebaFor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            while (num<1 || num>20){
                System.out.println("Error, ingrese nuevamente un número");
                num = leer.nextInt();
            }
            System.out.print(num+": ");
            for (int j = 1; j < num+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
