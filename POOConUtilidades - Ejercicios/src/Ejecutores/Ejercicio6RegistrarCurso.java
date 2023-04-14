package Ejecutores;

import Entidades.Ejercicio6Curso;
import Servicios.Ejercicio6CursoServicio;

public class Ejercicio6RegistrarCurso {

    public static void main(String[] args) {
        Ejercicio6Curso c = Ejercicio6CursoServicio.crearCurso();
        System.out.println(Ejercicio6CursoServicio.calcularGananciaSemanal(c));
    }

}
