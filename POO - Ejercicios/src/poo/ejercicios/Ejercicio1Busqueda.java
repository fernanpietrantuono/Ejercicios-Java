package poo.ejercicios;

import Entidades.Ejercicio1Libro;
import java.util.Scanner;

public class Ejercicio1Busqueda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio1Libro libro1 = new Ejercicio1Libro();
        System.out.println("Ingrese el código ISBN del libro");
        libro1.ISBN = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        libro1.titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        libro1.autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de páginas del libro");
        libro1.paginas = leer.nextInt();
        System.out.println(libro1.getISBN());
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getPaginas());
    }

}
