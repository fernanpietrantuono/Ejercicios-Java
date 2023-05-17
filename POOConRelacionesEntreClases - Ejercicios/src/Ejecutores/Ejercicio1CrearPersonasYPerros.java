package Ejecutores;

import Entidades.Ejercicio1Perro;
import Entidades.Ejercicio1Persona;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1CrearPersonasYPerros {

    public static void main(String[] args) {
        HashSet<Ejercicio1Persona> persona = new HashSet();
        HashSet<Ejercicio1Perro> perro = new HashSet();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String resp1 = " ", resp2 = " ";
        do {
            System.out.println("Ingrese el nombre de su perro/a");
            String nombre = leer.next();
            System.out.println("Ingrese la raza de su perro/a");
            String raza = leer.next();
            System.out.println("Ingrese la edad de su perro/a");
            int edad = leer.nextInt();
            System.out.println("Ingrese el tamaño de su perro/a");
            String tamano = leer.next();
            boolean adoptado = false;
            perro.add(new Ejercicio1Perro(nombre, raza, edad, tamano, adoptado));
            System.out.println("¿Quiere seguir agregando perros/as?");
            resp1 = leer.next();
        } while (!"no".equals(resp1));

        do {
            System.out.println("Ingrese su nombre");
            String nombre = leer.next();
            System.out.println("Ingrese su apellido");
            String apellido = leer.next();
            System.out.println("Ingrese su edad");
            int edad = leer.nextInt();
            System.out.println("Ingrese su DNI");
            long DNI = leer.nextLong();
            persona.add(new Ejercicio1Persona(nombre, apellido, edad, DNI));
            System.out.println("¿Quiere seguir agregando?");
            resp2 = leer.next();
        } while (!"no".equals(resp2));

        for (Ejercicio1Persona Persona : persona) {
            boolean aux = false;
            System.out.println(Persona.getNombre() + ", te toca adoptar tu mascota");
            do {
                System.out.println("Lista de perros/as: ");
                for (Ejercicio1Perro ejercicio1Perro : perro) {
                    System.out.println(ejercicio1Perro);
                }
                System.out.println("¿Qué perro/a quiere adoptar?");
                String eleccion = leer.next();
                Iterator<Ejercicio1Perro> iterator = perro.iterator();
                while (iterator.hasNext()) {
                    Ejercicio1Perro mascota = iterator.next();
                    if (eleccion.equals(mascota.getNombre()) && !mascota.getAdoptado()) {
                        Persona.setMascota(mascota);
                        mascota.setAdoptado(true);
                        aux = true;
                    }
                }
                if (aux) {
                    System.out.println("Se ha adoptado el/la perro/a");
                }
                if (!aux) {
                    System.out.println("El/la perro/a ya está adoptado/a");
                }
            } while (!aux);
        }
        for (Ejercicio1Persona Persona3 : persona) {
            System.out.println(Persona3);
        }
    }

}
