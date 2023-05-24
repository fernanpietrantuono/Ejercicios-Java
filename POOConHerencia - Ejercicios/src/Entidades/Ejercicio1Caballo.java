package Entidades;

public class Ejercicio1Caballo extends Ejercicio1Animal {

    public Ejercicio1Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println(alimento);
    }

}
