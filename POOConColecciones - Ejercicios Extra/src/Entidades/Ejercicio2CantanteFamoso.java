package Entidades;

public class Ejercicio2CantanteFamoso {

    public String nombre;
    public String discoConMasVentas;

    public Ejercicio2CantanteFamoso() {
    }

    public Ejercicio2CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "Ejercicio2CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }
    
}
