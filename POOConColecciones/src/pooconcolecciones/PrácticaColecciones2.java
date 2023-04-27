package pooconcolecciones;

import java.util.ArrayList;
import Entidades.PracticaLibros;
import java.util.Scanner;

public class PrácticaColecciones2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<PracticaLibros> libros = new ArrayList();
        System.out.println("Introduzca el nombre del libro");
        PracticaLibros libro = new PracticaLibros(leer.next());
        libros.add(libro);
        libros.forEach((libro1) -> {
            System.out.println(libro1);
        });
    }

}
