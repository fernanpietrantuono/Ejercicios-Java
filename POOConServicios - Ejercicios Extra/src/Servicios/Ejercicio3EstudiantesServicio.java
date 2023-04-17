package Servicios;

import Entidades.Ejercicio3Estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3EstudiantesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio3Estudiantes registro = new Ejercicio3Estudiantes();

    public Ejercicio3Estudiantes crearEstudiantes() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese la nota media");
        int notaMedia = leer.nextInt();
        return new Ejercicio3Estudiantes(nombre, edad, notaMedia);
    }

    public double promedio(ArrayList<Ejercicio3Estudiantes> listado) {
        int cont = 0;
        for (Ejercicio3Estudiantes ejercicio3Estudiantes : listado) {
            cont += ejercicio3Estudiantes.getNotaMedia();
        }
        double promedio = cont / listado.size();
        return promedio;
    }
    
    public void notaMediaMayor(ArrayList<Ejercicio3Estudiantes> listado, double promedio){
        for (Ejercicio3Estudiantes ejercicio3Estudiantes : listado) {
            if (ejercicio3Estudiantes.getNotaMedia() > promedio) {
                System.out.println(ejercicio3Estudiantes.getNombre());
            }
        }
    }
}
