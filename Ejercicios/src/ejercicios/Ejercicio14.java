package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto en Euros");
        double euros = leer.nextDouble();
        System.out.println("Ingrese una moneda a convertir");
        String moneda = leer.next();
        ConvertirMoneda(euros, moneda);
    }
    
    public static void ConvertirMoneda(double euros, String moneda){
        switch (moneda){
            case "dolares":
                double dolares = euros*1.28611;
                System.out.println(euros+" € son $"+dolares);
                break;
            case "yenes":
                double yenes = euros*129.852;
                System.out.println(euros+" € son ¥"+yenes);
                break;
            case "libras":
                double libras = euros*0.86;
                System.out.println(euros+" € son £"+libras);
                break;
            default:
                System.out.println("Lo siento, la moneda introducida no se "
                +"encuentra dentro de estas opciones");
        }
    }
    
}
