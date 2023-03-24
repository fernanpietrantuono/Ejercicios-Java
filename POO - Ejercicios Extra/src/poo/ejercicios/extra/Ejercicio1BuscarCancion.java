package poo.ejercicios.extra;

import Entidades.Ejercicio1Cancion;
import java.util.Scanner;

public class Ejercicio1BuscarCancion {

    public static void main(String[] args) {
        Ejercicio1Cancion c1 = new Ejercicio1Cancion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el título de la canción");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el/la autor/a de la canción");
        c1.setAutor(leer.next());
        System.out.println(c1);
    }
    
}
