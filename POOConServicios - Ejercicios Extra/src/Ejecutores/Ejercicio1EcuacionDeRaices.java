package Ejecutores;

import Entidades.Ejercicio1Raices;
import Servicios.Ejercicio1RaicesServicio;
import java.util.Scanner;

public class Ejercicio1EcuacionDeRaices {

    public static void main(String[] args) {
        Ejercicio1RaicesServicio rs = new Ejercicio1RaicesServicio();
        Ejercicio1Raices calculo1 = new Ejercicio1Raices();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes");
        calculo1.setA(leer.nextInt());
        calculo1.setB(leer.nextInt());
        calculo1.setC(leer.nextInt());
        rs.getDiscrimante(calculo1);
        rs.calcular(rs, calculo1);
    }

}
