package Ejecutores;

import Entidades.Ejercicio1Perro;
import Entidades.Ejercicio1Persona;
import java.util.Scanner;

public class Ejercicio1CrearPersonasYPerros {

    public static void main(String[] args) {
        Ejercicio1Persona p1 = new Ejercicio1Persona();
        Ejercicio1Persona p2 = new Ejercicio1Persona();
        Ejercicio1Perro perro1 = new Ejercicio1Perro();
        Ejercicio1Perro perro2 = new Ejercicio1Perro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Persona 1:");
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese su DNI");
        p1.setDNI(leer.nextLong());
        System.out.println("Perro 1:");
        System.out.println("Ingrese el nombre de su perro");
        perro1.setNombre(leer.next());
        System.out.println("Ingrese la raza de su perro");
        perro1.setRaza(leer.next());
        System.out.println("Ingrese la edad de su perro");
        perro1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño de su perro");
        perro1.setTamano(leer.next());
        p1.setMascota(perro1);
        System.out.println("Persona 2:");
        System.out.println("Ingrese su nombre");
        p2.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        p2.setApellido(leer.next());
        System.out.println("Ingrese su edad");
        p2.setEdad(leer.nextInt());
        System.out.println("Ingrese su DNI");
        p2.setDNI(leer.nextLong());
        System.out.println("Perro 2:");
        System.out.println("Ingrese el nombre de su perro");
        perro2.setNombre(leer.next());
        System.out.println("Ingrese la raza de su perro");
        perro2.setRaza(leer.next());
        System.out.println("Ingrese la edad de su perro");
        perro2.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño de su perro");
        perro2.setTamano(leer.next());
        p2.setMascota(perro2);
        System.out.println("Persona 1: " + p1);
        System.out.println("Persona 2: " + p2);
    }

}
