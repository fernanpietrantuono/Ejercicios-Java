package Entidades;

public class Ejercicio1Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamano;

    public Ejercicio1Perro() {
    }

    public Ejercicio1Perro(String nombre, String raza, Integer edad, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "{Nombre= " + nombre + ", Raza= " + raza + ", Edad= " + edad + ", Tamaño= " + tamano + '}';
    }
    
}
