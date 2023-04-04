package Ejecutores;

import Entidades.Ejercicio3Operacion;
import java.util.Scanner;

public class Ejercicio3CrearOperacion {

    public static void main(String[] args) {
        Ejercicio3Operacion o1 = new Ejercicio3Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        o1.setNum1(leer.nextInt());
        o1.setNum2(leer.nextInt());
        System.out.println(o1);
    }

}
