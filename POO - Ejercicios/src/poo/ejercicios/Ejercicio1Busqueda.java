package poo.ejercicios;

import Entidades.Ejercicio1Libro;
import java.util.Scanner;

public class Ejercicio1Busqueda {

    public static void main(String[] args) {
        Ejercicio1Libro libro1 = new Ejercicio1Libro();
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese el código ISBN del libro");
        libro1.ISBN = leer1.nextLong();
        Scanner leer2 = new Scanner(System.in);
        System.out.println("Ingrese el título del libro");
        libro1.titulo = leer2.nextLine();
        System.out.println("Ingrese el autor del libro");
        libro1.autor = leer2.nextLine();
        System.out.println("Ingrese la cantidad de páginas del libro");
        libro1.paginas = leer2.nextInt();
        System.out.println("ISBN: " + libro1.ISBN);
        System.out.println("Título: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Cantidad de páginas: " + libro1.paginas);
    }

}
