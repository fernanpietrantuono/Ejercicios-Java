package Servicios;

import Entidades.Ejercicio2NIF;
import java.util.Scanner;

public class Ejercicio2NIFServicio {

    public static Scanner leer = new Scanner(System.in);

    public Ejercicio2NIF crearNIF() {
        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int resto = (int) (dni % 23);
        return new Ejercicio2NIF(dni, letras[resto]);
    }
    
    public void mostrar(Ejercicio2NIF r1){
        System.out.println(r1.getDni() + " - " + r1.getLetra());
    }
}
