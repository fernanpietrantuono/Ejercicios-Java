package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String frase1 = frase.toLowerCase();
        String frase2 = frase.toUpperCase();
        System.out.println("Frase nueva 1: "+frase1);
        System.out.println("Frase nueva 2: "+frase2);
    }
    
}
