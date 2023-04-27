package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1RazasPerrunasServicio {

    private ArrayList<String> listaRaza = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarRaza() {
        String resp = "";
        int i = 0;
        do {
            System.out.println("Ingrese una raza del perro n° " + (i + 1));
            String raza = leer.next();
            listaRaza.add(raza);
            System.out.println("¿Quiere seguir agregando perros?");
            resp = leer.next();
            i++;
        } while (!"n".equals(resp));
        this.mostrarRazas();
    }
    
    public void mostrarRazas() {
        listaRaza.forEach((string) -> {
            System.out.println(string);
        });
    }

    @Override
    public String toString() {
        return "Ejercicio1RazasPerrunasServicio{" + "listaRaza= " + listaRaza + '}';
    }
    
}
