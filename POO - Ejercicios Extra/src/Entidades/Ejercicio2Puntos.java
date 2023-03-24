package Entidades;

import java.util.Scanner;

public class Ejercicio2Puntos {

    Scanner leer = new Scanner(System.in);
    public int x1, x2, y1, y2;

    public void CrearPuntos() {
        System.out.println("Ingrese el valor de x1");
        setX1(leer.nextInt());
        System.out.println("Ingrese el valor de y1");
        setY1(leer.nextInt());
        System.out.println("Ingrese el valor de x2");
        setX2(leer.nextInt());
        System.out.println("Ingrese el valor de y2");
        setY2(leer.nextInt());
    }

    public double distancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    public Ejercicio2Puntos() {
    }

    public Ejercicio2Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    
}
