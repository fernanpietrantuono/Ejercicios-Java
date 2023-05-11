package Entidades;

import java.util.Objects;

public class Ejercicio2RevolverDeAgua {

    private Integer posActual;
    private Integer posAgua;

    public Ejercicio2RevolverDeAgua() {
    }

    public Ejercicio2RevolverDeAgua(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Ejercicio2RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

    public void llenarRevolver() {
        this.posActual = (int) (Math.random() * 8 + 1);
        this.posAgua = (int) (Math.random() * 8 + 1);
    }

    public boolean mojar() {
        return Objects.equals(this.posAgua, this.posActual);
    }

    public void siguienteChorro() {
        int posicion = this.posActual;
        if (posicion >= 8) {
            posicion = 1;
        } else {
            posicion++;
        }
        this.posActual = posicion;
    }

}
