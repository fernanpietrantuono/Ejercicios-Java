package Ejecutores;

import Servicios.Ejercicio1NúmerosServicio;

public class Ejercicio1LeerYPromediarNúmeros {

    public static void main(String[] args) {
        Ejercicio1NúmerosServicio ns = new Ejercicio1NúmerosServicio();
        ns.rellenoConNúmeros();
        ns.sumaYPromedioDeNúmeros();
    }

}
