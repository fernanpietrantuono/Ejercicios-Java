package Entidades;

public class Ejercicio1Cadena {

    String frase;
    int longitud;

    public Ejercicio1Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public Ejercicio1Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
