package Servicios;

import Entidades.Ejercicio4Ascensor;
import java.util.Scanner;

public class Ejercicio4AscensorServicio {

    private Scanner leer = new Scanner(System.in);

    public void subir(Ejercicio4Ascensor ascensor) throws InterruptedException {
        int pisoActual = ascensor.getPisoActual();
        System.out.println("Ingrese el número de piso que desea subir");
        int subirPisos = leer.nextInt();
        while (subirPisos > ascensor.getMaximoPisos()) {
            System.out.println("No existe el número de piso marcado.\nPor favor, inténtelo de nuevo.");
            subirPisos = leer.nextInt();
        }
        System.out.println("Piso: ↑" + pisoActual);
        Thread.sleep(8500);
        for (int i = pisoActual; i < subirPisos; i++) {
            pisoActual++;
            System.out.println("Piso: ↑" + pisoActual);
            Thread.sleep(5000);
        }
        Thread.sleep(5000);
        System.out.println("Piso:  " + pisoActual);
        ascensor.setPisoActual(pisoActual);
    }

    public void bajar(Ejercicio4Ascensor ascensor) throws InterruptedException {
        int pisoActual = ascensor.getPisoActual();
        System.out.println("Ingrese el número de piso que desea bajar");
        int bajarPisos = leer.nextInt();
        while (bajarPisos < 0) {
            System.out.println("No existe el número de piso marcado.\nPor favor, inténtelo de nuevo.");
            bajarPisos = leer.nextInt();
        }
        System.out.println("Piso: ↓" + pisoActual);
        Thread.sleep(8500);
        for (int i = pisoActual; i > bajarPisos; i--) {
            pisoActual--;
            System.out.println("Piso: ↓" + pisoActual);
            Thread.sleep(5000);
        }
        System.out.println("Piso:  " + pisoActual);
        ascensor.setPisoActual(pisoActual);
    }
}
