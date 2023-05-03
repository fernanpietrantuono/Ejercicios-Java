package Ejecutores;

import Entidades.Ejercicio4Pelicula;
import Servicios.Ejercicio4PeliculaServicio;

public class Ejercicio4VerPelicula {

    public static void main(String[] args) {
        Ejercicio4PeliculaServicio ps = new Ejercicio4PeliculaServicio();
        ps.cargarPelis();
        ps.mostrarPelis();
        System.out.println("\nPelículas ordenadas de mayor a menor: ");
        ps.mostrarPelisOrdenadas(Ejercicio4Pelicula.compararPelisDuracionDescendente);
        System.out.println("\nPelículas ordenadas de menor a mayor: ");
        ps.mostrarPelisOrdenadas(Ejercicio4Pelicula.compararPelisDuracionAscendente);
        System.out.println("\nPelículas ordenadas por título: ");
        ps.mostrarPelisOrdenadas(Ejercicio4Pelicula.compararPelisTitulo);
        System.out.println("\nPelículas ordenadas por director/a: ");
        ps.mostrarPelisOrdenadas(Ejercicio4Pelicula.compararPelisDirector);
    }

}
