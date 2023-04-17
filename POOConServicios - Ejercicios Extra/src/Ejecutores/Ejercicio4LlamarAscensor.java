package Ejecutores;

import Entidades.Ejercicio4Ascensor;
import Servicios.Ejercicio4AscensorServicio;
import java.util.Scanner;

public class Ejercicio4LlamarAscensor {

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        Ejercicio4AscensorServicio as = new Ejercicio4AscensorServicio();
        Ejercicio4Ascensor ascensor = new Ejercicio4Ascensor();
        int opc;
        System.out.println("Piso:  " + ascensor.getPisoActual() + "\nBienvenido al ascensor");
        do {
            System.out.println("Por favor seleccione una opción del menú");
            System.out.println("MENÚ");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    as.subir(ascensor);
                    break;
                case 2:
                    as.bajar(ascensor);
                    break;
                case 3:
                    System.out.println("Abriendo puerta del ascensor.\nMuchas gracias por utilizar el servicio.");
                    break;
                default:
                    System.out.println("Solamente opciones entre 1 y 3");
            }
        } while (opc != 3);
    }

}
