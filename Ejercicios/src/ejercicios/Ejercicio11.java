package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp = " ";
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        do{
            System.out.println(" ");
            System.out.println("Ingrese una opción");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            int opc = leer.nextInt();
            switch(opc){
                case 1:
                    int suma = num1+num2;
                    System.out.println("El resultado es "+suma);
                    break;
                case 2:
                    int resta = num1-num2;
                    System.out.println("El resultado es "+resta);
                    break;
                case 3:
                    int multiplicacion = num1*num2;
                    System.out.println("El resultado es "+multiplicacion);
                    break;
                case 4:
                    double division = num1/num2;
                    System.out.println("El resultado es "+division);
                    break;
                case 5:
                    System.out.println("Estás seguro que querés salir del programa?");
                    resp = leer.next();
                    break;
                default:
                    System.out.println("La opción ingresada no corresponde a las ofrecidas");
            }
        }while(!("s".equalsIgnoreCase(resp)));
    }
    
}
