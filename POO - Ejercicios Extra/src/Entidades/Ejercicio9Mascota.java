package Entidades;

public class Ejercicio9Mascota {

    public String nombre;
    public int edad;
    public String raza;
    public String tipo;

    public Ejercicio9Mascota() {
    }

    public Ejercicio9Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ejercicio9Mascota{" + "nombre = " + nombre + ", edad = " + (edad + 1) + ", raza = " + raza + ", tipo = " + tipo + '}';
    }

}
