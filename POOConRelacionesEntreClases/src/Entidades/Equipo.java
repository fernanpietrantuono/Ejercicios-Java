package Entidades;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> equipo;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "equipo=" + equipo + '}';
    }
    
    public void mostrar() {
        for (Jugador jugador : equipo) {
            System.out.println(jugador);
        }
    }
}
