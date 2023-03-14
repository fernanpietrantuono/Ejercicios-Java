package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio14B {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0, totalHijos = 0, sumaGral = 0;
        System.out.println("Ingrese la cantidad de familias");
        int familias = leer.nextInt();
        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + i);
            int hijos = leer.nextInt();
            totalHijos += hijos;
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + j);
                int edad = leer.nextInt();
                suma += edad;
            }
        }
        sumaGral += suma;
        double promedio = sumaGral / totalHijos;
        System.out.println("El promedio de edades de los hijos de las familias es: " + Math.round(promedio));

    }

}
