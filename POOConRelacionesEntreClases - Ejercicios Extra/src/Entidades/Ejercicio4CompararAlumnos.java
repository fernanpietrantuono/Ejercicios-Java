package Entidades;

import java.util.Comparator;

public class Ejercicio4CompararAlumnos {

    public static Comparator<Ejercicio4Alumno> ordenarPorVotos = (Ejercicio4Alumno alumno1, Ejercicio4Alumno alumno2) -> alumno2.getCantVotos().compareTo(alumno1.getCantVotos());

}
