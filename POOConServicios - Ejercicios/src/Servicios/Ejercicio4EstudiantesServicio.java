package Servicios;

import Entidades.Ejercicio4Estudiantes;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4EstudiantesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio4Estudiantes registro = new Ejercicio4Estudiantes();

    public Ejercicio4Estudiantes crearEstudiantes() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese la nota media");
        int notaMedia = leer.nextInt();
        return new Ejercicio4Estudiantes(nombre, edad, notaMedia);
    }

    public double promedio(ArrayList<Ejercicio4Estudiantes> listado) {
        int cont = 0;
        for (Ejercicio4Estudiantes ejercicio4Estudiantes : listado) {
            cont += ejercicio4Estudiantes.getNotaMedia();
        }
        double promedio = cont / listado.size();
        return promedio;
    }
    
    public void notaMediaMayor(ArrayList<Ejercicio4Estudiantes> listado, double promedio){
        for (Ejercicio4Estudiantes ejercicio4Estudiantes : listado) {
            if (ejercicio4Estudiantes.getNotaMedia() > promedio) {
                System.out.println(ejercicio4Estudiantes.getNombre());
            }
        }
    }
}
