package Ejecutores;

import Entidades.Ejercicio2ParDeNumeros;
import Servicios.Ejercicio2ParDeNumerosServicio;

public class Ejercicio2CalcularParDeNumeros {

    public static void main(String[] args) {
        Ejercicio2ParDeNumeros nums = new Ejercicio2ParDeNumeros();
        Ejercicio2ParDeNumerosServicio.mostrarValores(nums);
        System.out.println("El número mayor es " + Ejercicio2ParDeNumerosServicio.devolverMayor(nums));
        System.out.println("La potencia es " + Ejercicio2ParDeNumerosServicio.calcularPotencia(nums));
        System.out.println("La raíz es " + Ejercicio2ParDeNumerosServicio.calcularRaiz(nums));
    }

}
