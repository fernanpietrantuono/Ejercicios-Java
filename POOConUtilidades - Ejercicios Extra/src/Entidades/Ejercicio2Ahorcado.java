package Entidades;

public class Ejercicio2Ahorcado {

    public char[] palabra;
    public int letras;
    public int intentos;
    public char[] descubierta;

    public Ejercicio2Ahorcado() {
    }

    public Ejercicio2Ahorcado(String palabra, int intentos) {
        this.palabra = palabra.toCharArray();
        this.letras = 0;
        this.intentos = intentos;
        descubierta = new char [palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            descubierta [i] = '_';
        }
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public char[] getDescubierta() {
        return descubierta;
    }

    public void setDescubierta(char[] descubierta) {
        this.descubierta = descubierta;
    }
    
}
