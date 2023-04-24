package Servicios;

import Entidades.Calificacion;
import java.util.ArrayList;
import java.util.Scanner;

public class CalificacionServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Calificacion cargarDatos() {
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = leer.next();
        System.out.println("Ingrese la nota final obtenida por el estudiante");
        int nota = leer.nextInt();
        return new Calificacion(nombre, nota);
    }

    public double promedio(Calificacion[] estudiante) {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += estudiante[i].getNota();
        }
        double promedio = suma / 8;
        System.out.println("El promedio de notas del curso es " + promedio);
        return promedio;
    }

    public ArrayList<String> cargarAlumnosNotaMayorPromedio(Calificacion[] estudiante, double promedio) {
        ArrayList<String> AlumnosNotaSupDelPromedio = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (estudiante[i].getNota() > promedio) {
                AlumnosNotaSupDelPromedio.add(estudiante[i].getNombre());
            }
        }
        return AlumnosNotaSupDelPromedio;
    }

    public void mostrarNotasMayoresAlPromedio(ArrayList<String> AlumnosNotaSupDelPromedio) {
        int tamanio = AlumnosNotaSupDelPromedio.size();
        for (int i = 0; i < tamanio; i++) {
            System.out.println(AlumnosNotaSupDelPromedio.get(i));
        }
    }
}
