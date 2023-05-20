package Ejecutores;

import Servicios.Ejercicio3SeguroServicio;

public class Ejercicio3CrearPoliza {

    public static void main(String[] args) {
        Ejercicio3SeguroServicio ss = new Ejercicio3SeguroServicio();
        ss.aniadirClientes();
        ss.llenarPoliza();
        ss.aniadirVehiculos();
        ss.pagoEnCuotas();
        ss.mostrarDatos();
    }

}
