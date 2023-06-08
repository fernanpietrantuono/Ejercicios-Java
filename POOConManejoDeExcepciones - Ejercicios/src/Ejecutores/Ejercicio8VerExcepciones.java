package Ejecutores;

import Entidades.Ejercicio8PruebasDeCodigo;

public class Ejercicio8VerExcepciones {

    public static void main(String[] args) {
        Ejercicio8PruebasDeCodigo classes = new Ejercicio8PruebasDeCodigo();
        try {
            System.out.println(classes.metodo());
        } catch (Exception e) {
            System.err.println("Excepción en método(): ");
            e.printStackTrace();
        }
    }

}
