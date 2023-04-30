package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class PuntajeServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Integer> puntajeEq1 = new ArrayList();
    private ArrayList<Integer> puntajeEq2 = new ArrayList();
    private String NombreEq1;
    private String NombreEq2;

    public void definirNombres() {
        System.out.println("Ingrese el nombre para el equipo 1");
        NombreEq1 = leer.next();
        System.out.println("Ingrese el nombre para el equipo 2");
        NombreEq2 = leer.next();
    }

    public void llenarPuntajes() {
        String resp = "";
        do {
            System.out.println("Ingrese el puntaje obtenido por el equipo " + NombreEq1);
            int pEq1 = leer.nextInt();
            puntajeEq1.add(pEq1);
            System.out.println("Ingrese el puntaje obtenido por el equipo " + NombreEq2);
            int pEq2 = leer.nextInt();
            puntajeEq2.add(pEq2);
            this.calcularYMostrarPuntajes();
            System.out.println("¿Quiere seguir agregando puntos?");
            resp = leer.next();
        } while (!"n".equals(resp));
    }

    public void calcularYMostrarPuntajes() {
        int PTEq1 = 0;
        int PTEq2 = 0;
        PTEq1 = puntajeEq1.stream().map((pEq1) -> pEq1).reduce(PTEq1, Integer::sum);
        PTEq2 = puntajeEq2.stream().map((pEq2) -> pEq2).reduce(PTEq2, Integer::sum);
        System.out.println("\n" + NombreEq1 + " = " + PTEq1);
        System.out.println(NombreEq2 + " = " + PTEq2 + "\n");
    }

}
