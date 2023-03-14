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
        int retorno = operacion(num1, num2, oper);
        System.out.println("El resultado es "+retorno);
    }
    public static int operacion(int num1, int num2, String oper){
        int resultado=0;
        switch(oper){
            case "suma":
                resultado = num1+num2;
                break;
            case "resta":
                resultado = num1-num2;
                break;
            case "multiplicacion":
                resultado = num1*num2;
                break;
            case "division":
                resultado = num1/num2;
                break;
            default:
                System.out.println("El dato introducido es incorrecto");
        }
        return resultado;
    }
}
