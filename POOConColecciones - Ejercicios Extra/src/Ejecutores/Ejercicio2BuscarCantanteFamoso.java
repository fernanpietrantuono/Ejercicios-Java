package Ejecutores;

import Entidades.Ejercicio2CantanteFamoso;
import Servicios.Ejercicio2CantanteFamosoServicio;
import java.util.ArrayList;

public class Ejercicio2BuscarCantanteFamoso {

    public static void main(String[] args) {
        ArrayList<Ejercicio2CantanteFamoso> cantante = new ArrayList();
        Ejercicio2CantanteFamosoServicio cfs = new Ejercicio2CantanteFamosoServicio();
        for (int i = 0; i < 5; i++) {
            cfs.añadirCantante(cantante);
        }
        cfs.mostrarCantantes(cantante);
        cfs.agregarCantanteExtra(cantante);
        cfs.mostrarCantantes(cantante);
        cfs.eliminarCantante(cantante);
        cfs.mostrarCantantes(cantante);
    }

}
