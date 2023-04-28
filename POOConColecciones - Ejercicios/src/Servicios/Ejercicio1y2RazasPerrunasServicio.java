package Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2RazasPerrunasServicio {

    private ArrayList<String> listaRaza = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarRaza() {
        String resp = "";
        int i = 0;
        do {
            System.out.println("Ingrese una raza del perro n° " + (i + 1));
            String raza = leer.next();
            listaRaza.add(raza);
            System.out.println("¿Quiere seguir agregando razas de perros?");
            resp = leer.next();
            i++;
        } while (!"n".equals(resp));
        this.mostrarRazas();
    }

    public void mostrarRazas() {
        System.out.println("\nLista de razas:");
        listaRaza.forEach((string) -> {
            System.out.println(string);
        });
        System.out.println(" ");
    }

    public void buscarRaza() {
        String resp = "";
        do {
            int longitud = listaRaza.size();
            System.out.println("Ingrese una raza introducida en la lista a buscar");
            String buscar = leer.next();
            Iterator<String> itRaza = listaRaza.iterator();
            while (itRaza.hasNext()) {
                if (itRaza.next().equals(buscar)) {
                    itRaza.remove();
                }
            }
            if (listaRaza.size() != longitud) {
                System.out.println("Se encontró la raza " + buscar + " y ya fue removida");
            } else {
                System.out.println("Lo siento, la raza " + buscar + " no se encuentra en la lista");
            }
            this.mostrarRazas();
            System.out.println("¿Quiere seguir buscando razas de perros?");
            resp = leer.next();
        } while (!"n".equals(resp) || listaRaza.isEmpty());
    }

    @Override
    public String toString() {
        return "Ejercicio1RazasPerrunasServicio{" + "listaRaza= " + listaRaza + '}';
    }

}
