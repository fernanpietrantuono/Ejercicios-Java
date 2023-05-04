package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5PaísesServicio {

    private HashSet<String> Pais = new HashSet();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarpais() {
        String op;
        do {
            System.out.println("Ingrese un pais");
            Pais.add(leer.next());
            System.out.println("¿Desea agregar un pais? Si/No");
            op = leer.next();
        } while (op.equalsIgnoreCase("si"));
        System.out.println(Pais);
        System.out.println("-----------------------");
    }

    public void ordenarpais() {
        ArrayList<String> lista = new ArrayList(Pais);
        Collections.sort(lista);
        System.out.println(lista);
    }

    public void eliminarpais() {
        boolean encontrado = false;
        System.out.println("Desea eliminar un pais");
        String eleccion = leer.next();
        while ("si".equals(eleccion)) {
            if (eleccion.equalsIgnoreCase("si")) {
                System.out.println("Que pais desea eliminar");
                String respuesta = leer.next();
                Iterator<String> it = Pais.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(respuesta)) {
                        it.remove();
                        encontrado = true;
                    }
                }
            }
            if (encontrado) {
                System.out.println("Se a eliminado el pais");
                ordenarpais();
            } else {
                System.out.println("No se ha encontrado el pais");
            }
        }
    }
    
}
