package Ejecutores;

import Entidades.Ejercicio5Persona;
import Servicios.Ejercicio5PersonaServicio;
import java.util.Scanner;

public class Ejercicio5RegistrarPersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ejercicio5PersonaServicio s1 = new Ejercicio5PersonaServicio();
        Ejercicio5Persona p1 = s1.crearPersona();
        System.out.println("Escribe una edad para comparar la base de datos");
        int edadProvista = leer.nextInt();
        boolean var1 = s1.menorQue(p1, edadProvista);
        if (var1) {
            System.out.println("La persona es menor");
        } else {
            System.out.println("La persona es mayor");
        }
        System.out.println(p1);
    }

}
