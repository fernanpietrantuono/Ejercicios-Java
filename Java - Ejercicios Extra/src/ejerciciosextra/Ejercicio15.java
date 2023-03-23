package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("¿Qué operación matemática desea realizar?");
        String oper = leer.next();
        switch (oper) {
            case "suma":
                int retornoSuma = suma(num1, num2);
                System.out.println("El resultado es " + retornoSuma);
                break;
            case "resta":
                int retornoResta = resta(num1, num2);
                System.out.println("El resultado es " + retornoResta);
                break;
            case "multiplicacion":
                int retornoMultiplicacion = multiplicacion(num1, num2);
                System.out.println("El resultado es " + retornoMultiplicacion);
                break;
            case "division":
                double retornoDivision = division(num1, num2);
                System.out.println("El resultado es " + retornoDivision);
                break;
            default:
                System.out.println("El dato introducido es incorrecto");
        }
    }

    public static int suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static double division(int num1, int num2) {
        double division = num1 / num2;
        return division;
    }
}
