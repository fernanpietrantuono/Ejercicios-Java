package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        IngresoDeNotas(vector);
    }

    public static void IngresoDeNotas(int[] vector) {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudiante n° " + (i + 1));
            System.out.println("Ingrese las notas de los trabajos prácticos evaluativos");
            int notaTPE1 = leer.nextInt();
            int notaTPE2 = leer.nextInt();
            double porcentajeTPE1 = (notaTPE1 * 10) / 10;
            double porcentajeTPE2 = (notaTPE2 * 15) / 10;
            System.out.println("Porcentaje TPE1: " + porcentajeTPE1 + " %");
            System.out.println("Porcentaje TPE2: " + porcentajeTPE2 + " %");
            System.out.println("Ingrese las notas de los parciales");
            int notaParcial1 = leer.nextInt();
            int notaParcial2 = leer.nextInt();
            double porcentajeParcial1 = (notaParcial1 * 25) / 10;
            double porcentajeParcial2 = (notaParcial2 * 50) / 10;
            System.out.println("Porcentaje 1er parcial: " + porcentajeParcial1 + " %");
            System.out.println("Porcentaje 2do parcial: " + porcentajeParcial2 + " %");
            vector[i] = (notaTPE1 + notaTPE2 + notaParcial1 + notaParcial2) / 4;
            double porcentajeTotal = porcentajeTPE1 + porcentajeTPE2 + porcentajeParcial1 + porcentajeParcial2;
            if (vector[i] >= 7) {
                cont1 += 1;
            } else {
                cont2 += 1;
            }
            System.out.println(" ");
            System.out.println("Porcentaje final: " + porcentajeTotal + "%");
            System.out.println(" ");
        }
        System.out.println("Cantidad de alumnos aprobados: " + cont1);
        System.out.println("Cantidad de alumnos desaprobados: " + cont2);
    }
}
