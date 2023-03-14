package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de clase de socio");
        String socio = leer.next();
        socio = socio.toUpperCase();
        System.out.println("Ingrese el precio de su tratamiento");
        double costo = leer.nextDouble();
        double importe = 0;
        switch (socio) {
            case "A":
                importe = costo - (costo * 50) / 100;
                break;
            case "B":
                importe = costo - (costo * 35) / 100;
                break;
            case "C":
                importe = costo;
                break;
            default:
                System.out.println("La letra ingresada no corresponde al tipo de socio");
        }
        System.out.println("El importe a abonar por el tratamiento es de $" + importe);
    }
}
