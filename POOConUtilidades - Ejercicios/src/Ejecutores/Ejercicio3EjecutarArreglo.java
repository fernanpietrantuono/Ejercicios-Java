package Ejecutores;

import Servicios.Ejercicio3ArregloServicio;

public class Ejercicio3EjecutarArreglo {

    public static void main(String[] args) {
        double[] aA = new double[50];
        Ejercicio3ArregloServicio.inicializarA(aA);
        Ejercicio3ArregloServicio.mostrarA(aA);
        Ejercicio3ArregloServicio.ordenarA(aA);
        double[] aB = new double[20];
        Ejercicio3ArregloServicio.inicializarB(aA, aB);
        Ejercicio3ArregloServicio.mostrarA(aA);
        Ejercicio3ArregloServicio.mostrarA(aB);
    }

}
