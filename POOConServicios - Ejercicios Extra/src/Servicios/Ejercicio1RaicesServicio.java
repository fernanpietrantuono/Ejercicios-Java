package Servicios;

import Entidades.Ejercicio1Raices;

public class Ejercicio1RaicesServicio {

    public double getDiscrimante(Ejercicio1Raices cal1) {
        double discriminante = (Math.pow(cal1.getB(), 2)) - 4 * cal1.getA() * cal1.getC();
        return discriminante;
    }

    public boolean tieneRaices(Ejercicio1Raices cal1, Ejercicio1RaicesServicio s1) {
        return s1.getDiscrimante(cal1) > 0;
    }

    public boolean tieneRaiz(Ejercicio1Raices cal1, Ejercicio1RaicesServicio s1) {
        return s1.getDiscrimante(cal1) == 0;
    }

    public void obtenerRaices(Ejercicio1RaicesServicio s1, Ejercicio1Raices raiz1) {
        if (s1.tieneRaices(raiz1, s1)) {
            double raizPos = (-raiz1.getB() + Math.sqrt(Math.pow(raiz1.getB(), 2) - 4 * raiz1.getA() * raiz1.getC())) / 2 * raiz1.getA();
            double raizNeg = (-raiz1.getB() - Math.sqrt(Math.pow(raiz1.getB(), 2) - 4 * raiz1.getA() * raiz1.getC())) / 2 * raiz1.getA();
            System.out.println("El resultado de la raíz positiva es " + raizPos);
            System.out.println("El resultado de la raíz negativa es " + raizNeg);
        }
    }

    public void obtenerRaiz(Ejercicio1RaicesServicio s1, Ejercicio1Raices raiz1) {
        if (s1.tieneRaiz(raiz1, s1)) {
            double raiz = -raiz1.getB() / 2 * raiz1.getA();
            System.out.println("El resultado de la raíz es " + raiz);
        }
    }
    
    public void calcular(Ejercicio1RaicesServicio s1, Ejercicio1Raices raiz1) {
        if (s1.tieneRaices(raiz1, s1)) {
            s1.obtenerRaices(s1, raiz1);
        } else if (s1.tieneRaiz(raiz1, s1)) {
            s1.obtenerRaiz(s1, raiz1);
        } else {
            System.out.println("No tiene raíces");
        }
    }
}
