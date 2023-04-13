package Servicios;

import Entidades.Ejercicio2ParDeNumeros;

public class Ejercicio2ParDeNumerosServicio {

    public static void mostrarValores(Ejercicio2ParDeNumeros parDeNumeros) {
        System.out.println("Num 1: " + parDeNumeros.getNum1());
        System.out.println("Num 2: " + parDeNumeros.getNum2());
    }

    public static double devolverMayor(Ejercicio2ParDeNumeros parDeNumeros) {
        if (parDeNumeros.getNum1() > parDeNumeros.getNum2()) {
            return parDeNumeros.getNum1();
        } else {
            return parDeNumeros.getNum2();
        }
    }

    public static double calcularPotencia(Ejercicio2ParDeNumeros parDeNumeros) {
        double mayor = Ejercicio2ParDeNumerosServicio.devolverMayor(parDeNumeros);
        double menor;
        if (parDeNumeros.getNum1() == mayor) {
            menor = parDeNumeros.getNum2();
        } else {
            menor = parDeNumeros.getNum1();
        }
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    public static double calcularRaiz(Ejercicio2ParDeNumeros parDeNumeros) {
        double menor;
        if (parDeNumeros.getNum1() > parDeNumeros.getNum2()) {
            menor = Math.abs(parDeNumeros.getNum2());
        } else {
            menor = Math.abs(parDeNumeros.getNum1());
        }
        return Math.sqrt(menor);
    }
}
