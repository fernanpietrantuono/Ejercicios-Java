package Entidades;

public class Ejercicio4Ascensor {

    private int pisoActual;
    private int maximoPisos;

    public Ejercicio4Ascensor() {
        pisoActual = (int) (Math.random()* 35);
        maximoPisos = 35;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
    
}
