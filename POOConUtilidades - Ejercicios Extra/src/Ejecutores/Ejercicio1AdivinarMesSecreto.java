package Ejecutores;

import Entidades.Ejercicio1Mes;
import Servicios.Ejercicio1MesServicio;

public class Ejercicio1AdivinarMesSecreto {

    public static void main(String[] args) {
        Ejercicio1Mes ms = new Ejercicio1Mes();
        Ejercicio1MesServicio.adivinarMes(ms);
    }

}
