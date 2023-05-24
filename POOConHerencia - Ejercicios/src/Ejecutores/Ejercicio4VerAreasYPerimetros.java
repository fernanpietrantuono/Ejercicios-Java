package Ejecutores;

import Entidades.Ejercicio4Circulo;
import Entidades.Ejercicio4Rectangulo;

public class Ejercicio4VerAreasYPerimetros {

    public static void main(String[] args) {
        Ejercicio4Circulo circulo = new Ejercicio4Circulo();
        Ejercicio4Rectangulo rectangulo = new Ejercicio4Rectangulo();
        circulo.generarRadio();
        rectangulo.generarBaseYAltura();
        System.out.println("El área del círculo es " + circulo.area());
        System.out.println("El perímetro del círculo es " + circulo.perimetro());
        System.out.println("El área del rectángulo es " + rectangulo.area());
        System.out.println("El perímetro del rectángulo es " + rectangulo.perimetro());
    }

}
