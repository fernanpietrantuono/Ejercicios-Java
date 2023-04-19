package Entidades;

public class Ejercicio2AhorcadoMax {

    public String[] cadenas;
    public char[] palabra;
    public int letras;
    public int intentos;
    public char[] descubierta;

    public Ejercicio2AhorcadoMax() {
    }

    public Ejercicio2AhorcadoMax(String[] cadenas, int intentos) {
        this.cadenas = cadenas;
        this.palabra = this.cadenas[(int) (Math.random() * this.cadenas.length)].toCharArray();
        this.letras = 0;
        this.intentos = intentos;
        descubierta = new char[palabra.length];
        for (int i = 0; i < palabra.length; i++) {
            descubierta[i] = '_';
        }
    }

    public String[] getCadenas() {
        return cadenas;
    }

    public void setCadenas(String[] cadenas) {
        this.cadenas = cadenas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra.toCharArray();
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
