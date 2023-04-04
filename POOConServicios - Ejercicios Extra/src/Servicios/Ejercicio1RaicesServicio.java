package Servicios;

import Entidades.Ejercicio1Raices;

public class Ejercicio1RaicesServicio {

    public double getDiscrimante(Ejercicio1Raices cal1) {
        double discriminante = (Math.pow(cal1.getB(), 2)) - 4 * cal1.getA() * cal1.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(Ejercicio1Raices cal1, double discriminante) {
        return discriminante >= 0;
    }

    public boolean tieneRaiz(Ejercicio1Raices cal1, double discriminante) {
        return discriminante == 0;
    }

}
