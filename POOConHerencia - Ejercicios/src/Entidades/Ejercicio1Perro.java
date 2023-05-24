package Entidades;

public class Ejercicio1Perro extends Ejercicio1Animal {

    public Ejercicio1Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override
    public void alimentarse() {
        System.out.println(alimento);
    }

}
