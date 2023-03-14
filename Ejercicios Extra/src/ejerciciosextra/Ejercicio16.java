package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        mostrarInfo(nombre, edad);
    }
    public static void mostrarInfo(String nombre, int edad){
        Scanner leer = new Scanner(System.in);
        String resp = "";
        boolean mayorDeEdad;
        do{
            System.out.println("Ingrese tu nombre");
            nombre = leer.next();
            System.out.println("Ingrese tu edad");
            edad = leer.nextInt();
            mayorDeEdad = (edad>=18);
            System.out.println(nombre+" de "+edad+" años, es mayor de edad? "
            +mayorDeEdad);
            System.out.println("¿Quiere seguir mostrando personas?");
            resp = leer.next();
        }while(!("no".equalsIgnoreCase(resp)));
    }
}
