package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num%2==0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");            
        }
    }
    
}
