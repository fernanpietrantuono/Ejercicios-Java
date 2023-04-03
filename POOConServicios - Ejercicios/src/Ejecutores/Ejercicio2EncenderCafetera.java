package Ejecutores;

import Entidades.Ejercicio2Cafetera;
import Servicios.Ejercicio2CafeteraServicio;

public class Ejercicio2EncenderCafetera {

    public static void main(String[] args) throws InterruptedException {
        Ejercicio2CafeteraServicio cs = new Ejercicio2CafeteraServicio();
        Ejercicio2Cafetera c1 = cs.crearCafetera();
        cs.llenarCafetera(c1);
        cs.servirTaza(c1, 250);
        cs.vaciarCafetera(c1);
        cs.agregarCafe(c1, 500);
    }

}
