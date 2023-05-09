package Ejecutores;

import Entidades.DNI;
import Entidades.Persona;
import java.util.Scanner;

public class MostrarPersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DNI crear = new DNI();
        Persona registrar = new Persona();
        System.out.println("Ingrese una letra de su documento");
        crear.setLetra(leer.next());
        System.out.println("Ingrese el número de su documento");
        crear.setNumDNI(leer.nextLong());
        System.out.println("Ingrese su nombre");
        registrar.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        registrar.setApellido(leer.next());
        registrar.setDni(crear);
        System.out.println(registrar);
    }

}
