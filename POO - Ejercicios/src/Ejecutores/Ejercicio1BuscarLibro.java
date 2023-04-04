package Ejecutores;

import Entidades.Ejercicio1Libro;
import java.util.Scanner;

public class Ejercicio1BuscarLibro {

    public static void main(String[] args) {
        Ejercicio1Libro libro1 = new Ejercicio1Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el código ISBN del libro");
        libro1.ISBN = leer.nextLong();
        System.out.println("Ingrese el título del libro");
        libro1.titulo = leer.next();
        System.out.println("Ingrese el/la autor/a del libro");
        libro1.autor = leer.next();
        System.out.println("Ingrese la cantidad de páginas del libro");
        libro1.paginas = leer.nextInt();
        System.out.println(libro1);
    }

}
