package poo.ejercicios;

import Entidades.Ejercicio2Circunferencia;
import java.util.Scanner;

public class Ejercicio2CrearCircunferencia {

    public static void main(String[] args) {
        Ejercicio2Circunferencia c1 = new Ejercicio2Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño del radio del cilindro");
        c1.setRadio(leer.nextDouble());
        System.out.println(c1);
    }

}
