package poo.ejercicios.extra;

import Entidades.Ejercicio6Empleado;
import java.util.Scanner;

public class Ejercicio6CalcularAumentoEmpleado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ejercicio6Empleado e1 = new Ejercicio6Empleado();
        System.out.println("Ingrese el nombre del empleado");
        e1.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + e1.getNombre());
        e1.setEdad(leer.nextInt());
        System.out.println("Ingrese el salario mensual de " + e1.getNombre());
        e1.setSalario(leer.nextDouble());
        e1.CalcularAumento();
    }

}
