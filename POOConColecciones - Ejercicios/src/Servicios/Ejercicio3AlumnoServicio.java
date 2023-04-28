package Servicios;

import Entidades.Ejercicio3Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3AlumnoServicio {

    private ArrayList<Ejercicio3Alumno> estudiante = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAlumnos() {
        ArrayList<Integer> notas = new ArrayList();
        String resp = "";
        int i = 0;
        do {
            System.out.println("Ingrese el nombre del estudiante n° " + (i + 1));
            String nombre = leer.next();
            System.out.println("Ingrese las tres notas obtenidas por el alumno n° " + (i + 1));
            int nota1 = leer.nextInt();
            int nota2 = leer.nextInt();
            int nota3 = leer.nextInt();
            estudiante.add(new Ejercicio3Alumno(nombre, new ArrayList<>(Arrays.asList(nota1, nota2, nota3))));
            System.out.println("¿Quiere seguir agregando alumnos/as?");
            resp = leer.next();
            i++;
        } while (!"n".equals(resp));

    }
    
    public void notaFinal() {
        String resp = "";
        do {
            int longitud = estudiante.size();
                        System.out.println("Ingrese una raza introducida en la lista a buscar");
            String buscar = leer.next();
            for (Ejercicio3Alumno ejercicio3Alumno : estudiante) {
                
            }
        } while (!"n".equals(resp) || estudiante.isEmpty());
    }
}
