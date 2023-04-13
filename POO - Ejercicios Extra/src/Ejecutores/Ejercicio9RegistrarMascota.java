package Ejecutores;

import Entidades.Ejercicio9Mascota;
import java.util.Scanner;

public class Ejercicio9RegistrarMascota {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ejercicio9Mascota m1 = new Ejercicio9Mascota();
        System.out.println("Ingrese el nombre de la mascota");
        m1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la mascota");
        m1.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza de la mascota");
        m1.setRaza(leer.next());
        System.out.println("Ingrese el tipo de la mascota");
        m1.setTipo(leer.next());
        System.out.println(m1);
    }

}
