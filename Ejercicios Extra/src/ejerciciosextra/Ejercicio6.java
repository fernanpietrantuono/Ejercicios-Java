package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        double suma1 = 0;
        double suma2 = 0;
        System.out.println("Ingrese la cantidad de personas a promediar");
        int n = leer.nextInt();
        while (cont2 < n) {
            System.out.println("Ingrese la altura para la persona " + (cont2 + 1));
            double altura = leer.nextDouble();
            if (altura < 1.60) {
                suma1 += altura;
                cont1 += 1;
            }
            suma2 += altura;
            cont2 += 1;
        }
        double promedio1 = suma1 / cont1;
        double promedio2 = suma2 / cont2;
        System.out.println("El promedio de personas con estatura menor a 1,60 "
                + "m es de " + promedio1 + " m");
        System.out.println("El promedio general de estaturas es de " + promedio2 + " m");
    }
}
