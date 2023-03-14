package masejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para el radio de una circunferencia");
        double radio = leer.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);
        double perimetro = 2*Math.PI*radio;
        System.out.println("El área del círculo es "+area);
        System.out.println("El perímetro del círculo es "+perimetro);
    }
    
}
