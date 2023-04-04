package Entidades;

public class Ejercicio2NIF {

    public long dni;
    public String letra;

    public Ejercicio2NIF() {
    }

    public Ejercicio2NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
