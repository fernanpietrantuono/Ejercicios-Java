package Entidades;

import Interfaces.Ejercicio4CalculosFormas;
import java.util.Scanner;

public class Ejercicio4Rectangulo implements Ejercicio4CalculosFormas {

    private int base;
    private int altura;
    Scanner leer = new Scanner(System.in);

    public Ejercicio4Rectangulo() {
    }

    public Ejercicio4Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void generarBaseYAltura() {
        System.out.println("Ingrese unas medidas para la base y la altura del rectángulo");
        base = leer.nextInt();
        altura = leer.nextInt();
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base + altura) * 2;
    }

}
