package Servicios;

import Entidades.Ejercicio3Clientes;
import java.util.Scanner;

public class Ejercicio3SeguroServicio {

    private Scanner leer = new Scanner(System.in);

    public Ejercicio3Clientes añadirClientes() {
        System.out.println("Ingrese su nombre y apellido");
        String nombre = leer.next();
        String apellido = leer.next();
        System.out.println("Ingrese su documento de identidad");
        long dni = leer.nextLong();
        System.out.println("Ingrese su correo electrónico");
        String mail = leer.next();
        System.out.println("Ingrese su domicilio de residencia");
        String domicilio = leer.next();
        System.out.println("Ingrese su número de teléfono");
        long telefono = leer.nextLong();
        return new Ejercicio3Clientes(nombre, apellido, dni, mail, domicilio, telefono);
    }
}
