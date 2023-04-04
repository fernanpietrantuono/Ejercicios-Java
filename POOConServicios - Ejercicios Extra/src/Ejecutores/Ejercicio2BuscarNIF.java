package Ejecutores;

import Entidades.Ejercicio2NIF;
import Servicios.Ejercicio2NIFServicio;

public class Ejercicio2BuscarNIF {

    public static void main(String[] args) {
        Ejercicio2NIFServicio NIFS = new Ejercicio2NIFServicio();
        Ejercicio2NIF registro1 = NIFS.crearNIF();
        NIFS.mostrar(registro1);
    }

}
