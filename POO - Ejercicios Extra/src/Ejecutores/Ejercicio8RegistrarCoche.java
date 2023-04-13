package Ejecutores;

import Entidades.Ejercicio8Coche;
import java.util.Scanner;

public class Ejercicio8RegistrarCoche {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ejercicio8Coche c1 = new Ejercicio8Coche();
        Ejercicio8Coche c2 = new Ejercicio8Coche();
        Ejercicio8Coche c3 = new Ejercicio8Coche();
        System.out.println("Ingrese la marca del vehículo 1");
        c1.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo 1");
        c1.setModelo(leer.next());
        System.out.println("Ingrese el precio del vehículo 1");
        c1.setPrecio(leer.nextLong());
        System.out.println(c1);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la marca del vehículo 2");
        c2.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo 2");
        c2.setModelo(leer.next());
        System.out.println("Ingrese el precio del vehículo 2");
        c2.setPrecio(leer.nextLong());
        System.out.println(c2);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ingrese la marca del vehículo 3");
        c3.setMarca(leer.next());
        System.out.println("Ingrese el modelo del vehículo 3");
        c3.setModelo(leer.next());
        System.out.println("Ingrese el precio del vehículo 3");
        c3.setPrecio(leer.nextLong());
        System.out.println(c3);
    }

}
