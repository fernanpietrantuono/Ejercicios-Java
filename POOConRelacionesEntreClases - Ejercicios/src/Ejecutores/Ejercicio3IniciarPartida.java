package Ejecutores;

import Entidades.Ejercicio3Baraja;
import Entidades.Ejercicio3Carta;
import java.util.ArrayList;

public class Ejercicio3IniciarPartida {

    public static void main(String[] args) {
        ArrayList<Ejercicio3Carta> cartasRepartidas = new ArrayList<>();
        Ejercicio3Baraja bar = new Ejercicio3Baraja();
        bar.barajar();
        System.out.println(bar.siguenteCarta());
        bar.cartasDisponibles();
        bar.darCartas(cartasRepartidas);
        bar.cartasMonton(cartasRepartidas);
        bar.mostrarBaraja();
    }

}
