package Entidades;

public class Ejercicio2Asiento {

    private Ejercicio2Espectador espectador;
    private int fila;
    private String columna;

    public Ejercicio2Asiento() {
    }

    public Ejercicio2Asiento(Ejercicio2Espectador espectador, int fila, String columna) {
        this.espectador = espectador;
        this.fila = fila;
        this.columna = columna;
    }

    public Ejercicio2Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Ejercicio2Espectador espectador) {
        this.espectador = espectador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Ejercicio2Asiento{" + "espectador=" + espectador + ", fila=" + fila + ", columna=" + columna + '}';
    }
    
}
