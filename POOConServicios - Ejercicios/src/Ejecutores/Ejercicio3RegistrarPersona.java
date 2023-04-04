package Ejecutores;

import Entidades.Ejercicio3Persona;
import Servicios.Ejercicio3PersonaServicio;
import java.util.Scanner;

public class Ejercicio3RegistrarPersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ejercicio3PersonaServicio ps = new Ejercicio3PersonaServicio();
        Ejercicio3Persona p1 = ps.crearPersona();
        Ejercicio3Persona p2 = ps.crearPersona();
        Ejercicio3Persona p3 = ps.crearPersona();
        Ejercicio3Persona p4 = ps.crearPersona();
        boolean[] mayores = {ps.esMayorDeEdad(p1), ps.esMayorDeEdad(p2), ps.esMayorDeEdad(p3), ps.esMayorDeEdad(p4)};
        int[] imc = {ps.calcularIMC(p1), ps.calcularIMC(p2), ps.calcularIMC(p3), ps.calcularIMC(p4)};
        ps.porcentaje(mayores, imc);
    }

}
