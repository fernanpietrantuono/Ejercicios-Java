package Entidades;

import static java.lang.Math.PI;

public class Ejercicio2Circunferencia {

    private double radio;

    public double area() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * PI * radio;
        return perimetro;
    }

    public Ejercicio2Circunferencia() {
    }

    public Ejercicio2Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area() + ", perimetro=" + perimetro() + '}';
    }

}
