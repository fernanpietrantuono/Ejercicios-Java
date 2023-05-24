package Ejecutores;

import Entidades.Ejercicio1Animal;
import Entidades.Ejercicio1Caballo;
import Entidades.Ejercicio1Gato;
import Entidades.Ejercicio1Perro;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1VerInfoAnimales {

    public static void main(String[] args) {
        List<Ejercicio1Animal> animales = new ArrayList();
        Ejercicio1Animal perro = new Ejercicio1Perro("Mora", "Paleta", "Golden", 6);
        Ejercicio1Animal gato = new Ejercicio1Gato("Achira", "Merluza", "Persa", 9);
        Ejercicio1Animal caballo = new Ejercicio1Caballo("Moisés", "Manzanas", "Mustang", 11);
        animales.add(perro);
        animales.add(gato);
        animales.add(caballo);
        for (Ejercicio1Animal animal : animales) {
            animal.alimentarse();
        }
    }
    
}
