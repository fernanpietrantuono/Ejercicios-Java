package Ejecutores;

import Entidades.Ejercicio4Estudiantes;
import Servicios.Ejercicio4EstudiantesServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4RegistrarEstudiantes {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Ejercicio4EstudiantesServicio registro = new Ejercicio4EstudiantesServicio();
        Ejercicio4Estudiantes estudiante;
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
