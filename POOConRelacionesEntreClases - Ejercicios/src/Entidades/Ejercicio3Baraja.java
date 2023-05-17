package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3Baraja {

    private ArrayList<Ejercicio3Carta> baraja = new ArrayList<>();
    private Scanner leer = new Scanner(System.in);

    public Ejercicio3Baraja() {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Ejercicio3Carta(i, "espada"));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Ejercicio3Carta(i, "oro"));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Ejercicio3Carta(i, "basto"));
            }
        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                baraja.add(new Ejercicio3Carta(i, "copa"));
            }
        }
    }

    public Ejercicio3Baraja(ArrayList<Ejercicio3Carta> c) {
        this.baraja = c;
    }

    public ArrayList<Ejercicio3Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Ejercicio3Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Ejercicio3Baraja{" + "baraja=" + baraja + '}';
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public Ejercicio3Carta siguenteCarta() {
        if (baraja.isEmpty()) {
            return null;
        }
        return baraja.get(baraja.size() - 1);
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + baraja.size());
    }

    public ArrayList<Ejercicio3Carta> darCartas(ArrayList<Ejercicio3Carta> cartasRepartidas) {
        System.out.println("¿Cuántas cartas quiere?");
        int cantCartas = leer.nextInt();
        if (baraja.size() >= cantCartas) {
            for (int i = 0; i < cantCartas; i++) {
                cartasRepartidas.add(this.siguenteCarta());
                baraja.remove(this.siguenteCarta());
            }
        } else {
            System.out.println("No hay cartas suficientes");
        }
        return cartasRepartidas;
    }

    public void cartasMonton(ArrayList<Ejercicio3Carta> cartasRepartidas) {
        if (cartasRepartidas.isEmpty()) {
            System.out.println("No se han repartido cartas");
        } else {
            System.out.println("Cartas repartidas: ");
            for (Ejercicio3Carta cartasRepartida : cartasRepartidas) {
                System.out.println(cartasRepartida);
            }
        }
    }
    
    public void mostrarBaraja() {
        System.out.println("Baraja: ");
        for (Ejercicio3Carta ejercicio3Carta : baraja) {
            System.out.println(ejercicio3Carta);
        }
    }
    
}
