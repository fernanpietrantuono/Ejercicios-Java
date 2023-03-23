package masejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los litros de combustible cargados en la "
                + "estación de servicio");
        double litros = leer.nextDouble();
        System.out.println("Ingrese la cantidad de kilómetros recorridos");
        double km = leer.nextDouble();
        double consumo = km/litros;
        System.out.println("El vehículo consumió "+consumo+" litros/km");
    }

}
