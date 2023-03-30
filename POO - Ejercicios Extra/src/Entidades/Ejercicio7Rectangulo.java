package Entidades;

public class Ejercicio7Rectangulo {

    public int lado1;
    public int lado2;

    public Ejercicio7Rectangulo() {
    }

    public Ejercicio7Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int CalcularArea() {
        int area = lado1 * lado2;
        return area;
    }

    @Override
    public String toString() {
        return "Ejercicio7Rectangulo{" + "lado1= " + lado1 + ", lado2= " + lado2 + ", área= " + CalcularArea() + '}';
    }
}
