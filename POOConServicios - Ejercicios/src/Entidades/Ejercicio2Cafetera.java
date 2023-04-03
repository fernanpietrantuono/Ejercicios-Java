package Entidades;

public class Ejercicio2Cafetera {

    public int capacidadMax;
    public int cantidadActual;

    public Ejercicio2Cafetera() {
    }

    public Ejercicio2Cafetera(int capacidadMax, int cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
