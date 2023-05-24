package Ejecutores;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

public class PracticaAnimales {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        animales.add(a);
        animales.add(b);
        animales.add(c);

        for (Animal animal : animales) {
            animal.hacerRuido();
        }

    }

}
