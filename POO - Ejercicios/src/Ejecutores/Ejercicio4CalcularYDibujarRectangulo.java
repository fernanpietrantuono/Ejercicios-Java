package Ejecutores;

import Entidades.Ejercicio4Rectangulo;
import java.util.Scanner;

public class Ejercicio4CalcularYDibujarRectangulo {

    public static void main(String[] args) {
        Ejercicio4Rectangulo r1 = new Ejercicio4Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base y la altura de un rectángulo");
        r1.setBase(leer.nextInt());
        r1.setAltura(leer.nextInt());
        System.out.println(r1);
        r1.dibujo();
    }

}
