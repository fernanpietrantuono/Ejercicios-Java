package Entidades;

public class Ejercicio3Operacion {

    private int num1;
    private int num2;

    public int suma() {
        int suma = num1 + num2;
        return suma;
    }

    public int resta() {
        int resta = num1 - num2;
        return resta;
    }

    public double multiplicacion() {
        int multiplicacion = num1 * num2;
        if (multiplicacion == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return multiplicacion;
        }
    }

    public double division() {
        int division = num1 / num2;
        if (division == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return division;
        }
    }

    public Ejercicio3Operacion() {
    }

    public Ejercicio3Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "Ejercicio3Operacion{" + "num1= " + num1 + ", num2= " + num2 + ", suma= " + suma() + ", resta= "
                + resta() + ", multiplicacion= " + multiplicacion() + ", division= " + division() + '}';
    }

}
