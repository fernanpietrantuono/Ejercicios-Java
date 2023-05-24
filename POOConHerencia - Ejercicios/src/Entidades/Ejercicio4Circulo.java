package Entidades;

import Interfaces.Ejercicio4CalculosFormas;
import java.util.Scanner;

public class Ejercicio4Circulo implements Ejercicio4CalculosFormas {

    private float radio;
    Scanner leer = new Scanner(System.in);

    public Ejercicio4Circulo() {
    }

    public Ejercicio4Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void generarRadio() {
        System.out.println("Ingrese una medida del radio de una circunferencia");
        radio = leer.nextFloat();
    }

    @Override
    public double area() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return PI * (radio+radio);
    }

}
