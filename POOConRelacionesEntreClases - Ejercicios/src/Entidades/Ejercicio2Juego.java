package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2Juego {

    private ArrayList<Ejercicio2Jugador> jugadores = new ArrayList<>();
    private Ejercicio2RevolverDeAgua r = new Ejercicio2RevolverDeAgua();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        Ejercicio2Jugador j = new Ejercicio2Jugador();
        System.out.println("Por favor, ingrese la cantidad de jugadores/as");
        int cantidad = leer.nextInt();
        if (cantidad <= 0 || cantidad > 6) {
            cantidad = 6;
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del/la jugador/a " + (i + 1));
            j.setNombre(leer.next());
            System.out.println("Ingrese el ID del/la jugador/a " + (i + 1));
            j.setID(leer.nextInt());
            jugadores.add(j);
        }
        r.llenarRevolver();
    }

    public void ronda() {
        System.out.println("Iniciando la ronda");
        for (Ejercicio2Jugador jugadore : jugadores) {
            if (jugadore.disparo(r)) {
                System.out.println("Ronda terminada.\nEl/la jugador/a mojado/a es " + jugadore.getNombre() + " - " + jugadore.getID());
                break;
            } else {
                System.out.println("Siguiente jugador/a");
            }
        }
    }

}
