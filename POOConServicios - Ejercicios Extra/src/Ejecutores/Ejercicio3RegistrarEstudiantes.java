package Ejecutores;

import Entidades.Ejercicio3Estudiantes;
import Servicios.Ejercicio3EstudiantesServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3RegistrarEstudiantes {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Ejercicio3EstudiantesServicio registro = new Ejercicio3EstudiantesServicio();
        Ejercicio3Estudiantes estudiante;
        ArrayList lista = new ArrayList();
        String resp = " ";
        do {
            estudiante = registro.crearEstudiantes();
            lista.add(estudiante);
            System.out.println("Quiere seguir ingresando?");
            resp = leer.next();
        } while (!"n".equals(resp));
        System.out.println(registro.promedio(lista));
        registro.notaMediaMayor(lista, registro.promedio(lista));
    }

}
