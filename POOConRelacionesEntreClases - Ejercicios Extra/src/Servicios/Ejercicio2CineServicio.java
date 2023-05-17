package Servicios;

import Entidades.Ejercicio2Cine;
import Entidades.Ejercicio2Espectador;
import Entidades.Ejercicio2Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2CineServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Ejercicio2Espectador> lista = new ArrayList();

    public Ejercicio2Pelicula crearPelicula() {
        System.out.println("Ingrese el nombre de la tira");
        String nombre = leer.next();
        System.out.println("Ingrese la duración de la misma");
        int duracion = leer.nextInt();
        System.out.println("Ingrese la calificación mínima");
        int edadMinima = leer.nextInt();
        System.out.println("Ingrese el/la director/a de la película");
        String director = leer.next();
        return new Ejercicio2Pelicula(nombre, duracion, edadMinima, director);
    }

    public Ejercicio2Cine abrirCine(Ejercicio2Pelicula peli) {
        int sala = (int) (Math.random() * 8);
        double precio = 163.45;
        return new Ejercicio2Cine(peli, sala, precio);
    }

    public void crearEspectadores() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "Fernando", "Zara"};
        for (int i = 0; i < 10; i++) {
//            System.out.println("Ingrese su nombre");
            String nombre = nombres[i];
//            System.out.println("Ingrese su edad");
            int edad = (int) (Math.random() * 65);
//            System.out.println("Ingrese el dinero que tenés en tu cuenta");
            double dinero = (int) (Math.random()*999.99);
            lista.add(new Ejercicio2Espectador(nombre, edad, dinero));
        }
    }

    public void asignarAsientos(Ejercicio2Cine cine) {
        for (Ejercicio2Espectador espectador : lista) {
            boolean ocupado = false;
            if (espectador.getEdad() >= cine.getPelicula().getEdadMinima() && espectador.getDinero() >= cine.getPrecio()) {
                do {
                    int k = (int) (Math.random() * 8);
                    int l = (int) (Math.random() * 6);
                    if (cine.getAsientos()[k][l].getEspectador() == null) {
                        cine.getAsientos()[k][l].setEspectador(espectador);
                        ocupado = true;
                    }
                } while (!ocupado);
            } else {
                System.out.println("Lo siento, no puede entrar a la sala porque la peli no es apta para tu edad");
            }
        }
    }

    public void mostrarSala(Ejercicio2Cine cine) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cine.getAsientos()[i][j].getFila() + "");
                System.out.print(cine.getAsientos()[i][j].getColumna());
                if (cine.getAsientos()[i][j].getEspectador() == null) {
                    System.out.print("\u001B[32mO\u001B[30m");
                } else {
                    System.out.print("\u001B[31mX\u001B[30m");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
