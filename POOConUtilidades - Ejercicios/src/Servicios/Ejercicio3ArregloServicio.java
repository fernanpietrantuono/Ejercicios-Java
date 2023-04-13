package Servicios;

import java.util.Arrays;

public class Ejercicio3ArregloServicio {
    
    public static double[] inicializarA(double[] aA) {
        for (int i = 0; i < 50; i++) {
            aA[i] = Math.random() * 100;
        }
        return aA;
    }
    
    public static void mostrarA(double[] aA) {
        System.out.println(Arrays.toString(aA));
    }
    
    public static void ordenarA(double[] aA) {
        Arrays.sort(aA);
    }
    
    public static double [] inicializarB(double[] aA, double[] aB) {
        for (int i = 0; i < 10; i++) {
            aB[i] = aA[i];
        }
        Arrays.fill(aB, 10, 20, 0.5);
        return aB;
    }
    
}
