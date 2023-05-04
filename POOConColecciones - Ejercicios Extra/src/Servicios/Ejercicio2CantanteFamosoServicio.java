package Servicios;

import Entidades.Ejercicio2CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2CantanteFamosoServicio {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void añadirCantante(ArrayList<Ejercicio2CantanteFamoso> cantante) {
        System.out.println("Ingrese el nombre del/la cantante");
        String nombre = leer.next();
        System.out.println("Ahora ingrese el disco más vendido de su carrera");
        String discoConMasVentas = leer.next();
        cantante.add(new Ejercicio2CantanteFamoso(nombre, discoConMasVentas));
    }

    public void mostrarCantantes(ArrayList<Ejercicio2CantanteFamoso> cantante) {
        System.out.println(cantante);
    }

    public void agregarCantanteExtra(ArrayList<Ejercicio2CantanteFamoso> cantante) {
        System.out.println("¿Desea agregar otro/a cantante?");
        String resp = leer.next();
        while ("si".equals(resp)) {
            this.añadirCantante(cantante);
            System.out.println("¿Desea agregar otro/a cantante?");
            resp = leer.next();
        }
    }

    public void eliminarCantante(ArrayList<Ejercicio2CantanteFamoso> cantante) {
        int opc = 0;
        do {
            System.out.println("MENÚ: ");
            System.out.println("\t°1 - Eliminar cantante");
            System.out.println("\t°2 - Salir");
            System.out.println("Ingrese una opción");
            opc = leer.nextInt();
            if (opc == 1) {
                int longitud = cantante.size();
                System.out.println("Ingrese el/la cantante que desea eliminar");
                String buscar = leer.next();
                Iterator<Ejercicio2CantanteFamoso> itCantante = cantante.iterator();
                while (itCantante.hasNext()) {
                    if (itCantante.next().getNombre().equals(buscar)) {
                        itCantante.remove();
                    }
                }
                if (cantante.size() != longitud) {
                    System.out.println("Se encontró el/la cantante " + buscar + " y ya fue removido/a");
                } else {
                    System.out.println("Lo siento, el/la cantante " + buscar + " no se encuentra en la lista");
                }
            } else {
                System.out.println("¡Hasta luego! ¡Muchas gracias por buscar, viva la música!");
            }
        } while (opc != 2);
    }

}
