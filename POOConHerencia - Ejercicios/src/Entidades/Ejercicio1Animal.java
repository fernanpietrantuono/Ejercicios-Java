package Entidades;

public class Ejercicio1Animal {

    protected String nombre, alimento, raza;
    protected int edad;

    public Ejercicio1Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void alimentarse() {
        System.out.println("Ñam ñam");
    }

}

