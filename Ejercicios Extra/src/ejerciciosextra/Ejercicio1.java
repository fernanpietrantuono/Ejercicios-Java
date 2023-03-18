package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempo = leer.nextInt();
        int dia = tiempo / 1440;
        int hora = (tiempo / 60) - 24;
        System.out.println(tiempo + " min son " + dia + " día/s y " + hora + " hora/s");
    }

}
