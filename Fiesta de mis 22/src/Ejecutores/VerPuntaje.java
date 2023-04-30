package Ejecutores;

import Servicios.PuntajeServicio;

public class VerPuntaje {

    public static void main(String[] args) {
        PuntajeServicio ps = new PuntajeServicio();
        ps.definirNombres();
        ps.llenarPuntajes();
    }

}
