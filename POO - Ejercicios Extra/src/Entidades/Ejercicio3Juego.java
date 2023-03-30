package Entidades;

import java.util.Scanner;

public class Ejercicio3Juego {

    Scanner leer = new Scanner(System.in);
    public int j1;
    public int j2;

    public void IniciarJuego() {
        int intentos;
        int ronda = 0;
        String resp = "s";
        int puntajeJ1 = 0;
        int puntajeJ2 = 0;
        do {
            intentos = 1;
            ronda++;
            System.out.println("Ronda " + ronda);
            System.out.println("Jugador 1, ingrese un número");
            setJ1(leer.nextInt());
            System.out.println("Jugador 2, adivine un número que ingresó el jugador 1");
            setJ2(leer.nextInt());
            while (intentos <= 5) {
                if (j2 > j1) {
                    System.out.println("Más bajo");
                } else if (j2 < j1) {
                    System.out.println("Más alto");
                } else if (j2 == j1) {
                    System.out.println("El número es correcto");
                    System.out.println("Intentos realizados: " + intentos);
                    puntajeJ2++;
                    break;
                }
                intentos++;
                if (intentos <= 5) {
                    setJ2(leer.nextInt());
                }
            }
            if (intentos > 5) {
                System.out.println("Jugador 2: Perdiste, no lograste adivinar un número");
                puntajeJ1++;
            }
            System.out.println("Quieren seguir jugando otra ronda?");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        System.out.println("J1: " + puntajeJ1);
        System.out.println("J2: " + puntajeJ2);

    }

    public Ejercicio3Juego() {
    }

    public Ejercicio3Juego(int j1, int j2) {
        this.j1 = j1;
        this.j2 = j2;
    }

    public int getJ1() {
        return j1;
    }

    public void setJ1(int j1) {
        this.j1 = j1;
    }

    public int getJ2() {
        return j2;
    }

    public void setJ2(int j2) {
        this.j2 = j2;
    }

}
