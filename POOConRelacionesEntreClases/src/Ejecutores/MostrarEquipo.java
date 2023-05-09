package Ejecutores;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class MostrarEquipo {

    public static void main(String[] args) {
        ArrayList<Jugador> equipo = new ArrayList();
        Equipo lista = new Equipo();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        String resp = "";
        int i = 1;
        do {
            System.out.println("Ingrese el nombre y el apellido del jugador n° " + i);
            String nombre = leer.next();
            String apellido = leer.next();
            System.out.println("Ingrese la posición del/la jugador/a n° " + i);
            String posicion = leer.next();
            System.out.println("Ingrese el número de camiseta del/la jugador/a n° " + i);
            Integer numero = leer.nextInt();
            equipo.add(new Jugador (nombre, apellido, posicion, numero));
            System.out.println("¿Quiere seguir agregando jugadores/as?");
            resp = leer.next();
            i++;
        } while (!"no".equals(resp));
        lista.setEquipo(equipo);
        lista.mostrar();
    }

}
