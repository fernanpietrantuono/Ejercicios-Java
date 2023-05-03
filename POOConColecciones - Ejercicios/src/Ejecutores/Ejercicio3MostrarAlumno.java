package Ejecutores;

import Entidades.Ejercicio3Alumno;
import Servicios.Ejercicio3AlumnoServicio;
import java.util.Scanner;

public class Ejercicio3MostrarAlumno {
    
    public static void main(String[] args) {
        Ejercicio3AlumnoServicio completarAlumnos = new Ejercicio3AlumnoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        completarAlumnos.cargarAlumnos();
        String resp = "";
        do {
            double promedio = 0.0;
            System.out.println("Ingrese un nombre del/la alumno/a en la lista para buscar");
            String buscar = leer.next();
            for (Ejercicio3Alumno ejercicio3Alumno : completarAlumnos.lista()) {
                if (ejercicio3Alumno.getNombre().equalsIgnoreCase(buscar)) {
                    promedio = completarAlumnos.notaFinal(ejercicio3Alumno.getNotas());
                }
            }
            System.out.println("El promedio de " + buscar + " es de " + promedio);
            System.out.println("¿Quiere seguir buscando y promediando notas de los/as alumnos/as?");
            resp = leer.next();
        } while (!"n".equalsIgnoreCase(resp));
        
    }
    
}
