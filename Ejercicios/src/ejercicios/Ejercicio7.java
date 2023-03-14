package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String frase = leer.next();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
