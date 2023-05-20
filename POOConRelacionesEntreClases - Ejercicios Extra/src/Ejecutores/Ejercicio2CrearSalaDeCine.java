package Ejecutores;

import Entidades.Ejercicio2Cine;
import Entidades.Ejercicio2Pelicula;
import Servicios.Ejercicio2CineServicio;

public class Ejercicio2CrearSalaDeCine {

    public static void main(String[] args) {
        Ejercicio2CineServicio cs = new Ejercicio2CineServicio();
        Ejercicio2Pelicula peli = cs.crearPelicula();
        Ejercicio2Cine cine = cs.abrirCine(peli);
        cs.crearEspectadores();
        cs.asignarAsientos(cine);
        cs.mostrarSala(cine);
    }

}
