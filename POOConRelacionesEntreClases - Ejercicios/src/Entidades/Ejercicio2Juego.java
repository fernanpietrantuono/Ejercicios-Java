package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2Juego {

    private ArrayList<Ejercicio2Jugador> jugadores;
    private Ejercicio2RevolverDeAgua r;
    Scanner leer = new Scanner(System.in);
    
    public void llenarJuego() {
        System.out.println("Por favor, ingrese la cantidad de jugadores");
        int cantidad = leer.nextInt();
        if (cantidad < 0 || cantidad > 6) {
            cantidad = 6;
        }
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Jugador " + i);
        }
    }
    
    public void ronda() {
        
    }
    
}
