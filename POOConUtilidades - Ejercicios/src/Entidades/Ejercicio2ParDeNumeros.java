package Entidades;

public class Ejercicio2ParDeNumeros {

    public double num1;
    public double num2;

    public Ejercicio2ParDeNumeros() {
        num1 = Math.random() * 100 + 1;
        num2 = Math.random() * 100 + 1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
