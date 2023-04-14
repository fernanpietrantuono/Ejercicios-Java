package Servicios;

import Entidades.Ejercicio6Curso;
import java.util.Scanner;

public class Ejercicio6CursoServicio {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void cargarAlumnos(Ejercicio6Curso c) {
        String[] aux = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del/la alumno/a n° " + (i + 1));
            aux [i] = leer.next();
        }
        c.setAlumnos(aux);
    }
    
    public static Ejercicio6Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nc = leer.next();
        System.out.println("Ingrese la cantidad de horas de cursada por día del/la alumno/a");
        float qhxd = leer.nextFloat();
        System.out.println("Ingrese la cantidad de días de cursado por semana del/la alumno/a");
        int qdxs = leer.nextInt();
        System.out.println("Ingrese el turno de cursada del/la alumno/a");
        String t = leer.next();
        System.out.println("Ingrese el cobro por hora de cursado del/la docente");
        double pxh = leer.nextDouble();
        Ejercicio6Curso c = new Ejercicio6Curso(nc, qhxd, qdxs, t, pxh);
        Ejercicio6CursoServicio.cargarAlumnos(c);
        return c;
    }
    
    public static double calcularGananciaSemanal(Ejercicio6Curso c) {
        return c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getAlumnos().length*c.getCantidadDiasPorSemana();
    }
}
