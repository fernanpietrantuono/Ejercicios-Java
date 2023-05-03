package Servicios;

import Entidades.Ejercicio4Pelicula;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio4PeliculaServicio {

    private ArrayList<Ejercicio4Pelicula> pelicula = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPelis() {
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
        String resp = "";
        int i = 0;
        do {
            System.out.println("Ingrese el nombre de la película n° " + (i + 1));
            String nombrePeli = leer.next();
            System.out.println("Ingrese el/la director/a de la película n° " + (i + 1));
            String director = leer.next();
            System.out.println("Ingrese la duración de la película n° " + (i + 1) + " en horas");
            int duracion = leer.nextInt();
            pelicula.add(new Ejercicio4Pelicula(nombrePeli, director, duracion));
            System.out.println("¿Quiere seguir agregando películas?");
            resp = leer.next();
            i++;
        } while (!"n".equalsIgnoreCase(resp));

    }

    public void mostrarPelis() {
        System.out.println("\nLista de películas:");
        pelicula.forEach((string) -> {
            System.out.println(string);
        });
        System.out.println("\nLista de películas mayores a una hora:");
        for (Ejercicio4Pelicula ejercicio4Pelicula : pelicula) {
            if (ejercicio4Pelicula.getDuracion() > 1) {
                System.out.println(ejercicio4Pelicula);
            }
        }
    }

    public void mostrarPelisOrdenadas(Comparator c) {
        Collections.sort(pelicula, c);
        pelicula.forEach((string) -> {
            System.out.println(string);
        });
        
    }
    
    
}
