package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if ("a".equals(frase.substring(0, 1).toLowerCase())){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
