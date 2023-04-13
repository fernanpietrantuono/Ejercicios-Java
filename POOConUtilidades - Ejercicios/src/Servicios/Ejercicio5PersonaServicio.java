package Servicios;

import Entidades.Ejercicio5Persona;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio5Persona p1 = new Ejercicio5Persona();

    public Ejercicio5Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaDeNacimiento = new Date(anio - 1900, mes + 1, dia);
        return new Ejercicio5Persona(nombre, fechaDeNacimiento);
    }

    public void calcularEdad(Date fechaDeNacimiento) {
        Date fechaActual = new Date();
        int anio = fechaActual.getYear() - fechaDeNacimiento.getYear();
        System.out.println("Edad = " + anio);
    }

    public boolean menorQue(Ejercicio5Persona p1, int edadProvista) {
        Date fechaActual = new Date();
        int edadDelta = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();
        if (edadDelta < edadProvista) {
            return true;
        } else {
            return false;
        }
    }
}
