package Ejecutores;

import Entidades.Ejercicio7Rectangulo;
import java.util.Scanner;

public class Ejercicio7CrearRectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio7Rectangulo rectangulo1 = new Ejercicio7Rectangulo();
        System.out.println("Ingrese la base y la altura");
        rectangulo1.setLado1(leer.nextInt());
        rectangulo1.setLado2(leer.nextInt());
        System.out.println(rectangulo1);
    }

}
