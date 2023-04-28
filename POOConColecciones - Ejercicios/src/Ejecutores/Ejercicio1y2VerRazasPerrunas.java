package Ejecutores;

import Servicios.Ejercicio1y2RazasPerrunasServicio;

public class Ejercicio1y2VerRazasPerrunas {

    public static void main(String[] args) {
        Ejercicio1y2RazasPerrunasServicio razas = new Ejercicio1y2RazasPerrunasServicio();
        razas.cargarRaza();
        razas.buscarRaza();
    }

}
