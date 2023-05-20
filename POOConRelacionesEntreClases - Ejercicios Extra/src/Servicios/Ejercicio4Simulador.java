package Servicios;

import Entidades.Ejercicio4Alumno;
import static Entidades.Ejercicio4CompararAlumnos.ordenarPorVotos;
import Entidades.Ejercicio4Voto;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4Simulador {

    private ArrayList<Ejercicio4Alumno> alumno = new ArrayList();

    public ArrayList generarNombreYApellido() {
        String[] nombres = {"Luciana", "Mariano", "Maia", "Teo", "Gabriel", "Agustina", "Marcelo", "Hernando", "Jessica", "Bernarda", "Leandra", "Patricia", "Mónica", "Ignacia", "Alessandra", "Lauro", "Silvino", "Uriana", "Oriela", "Aldo", "Isidoro", "Miley", "Selena", "Taylor", "Jordan", "Dano", "Tiziano", "Daniela", "Yuan", "Luana", "Francina", "Francesco", "Matías", "Yamila", "María", "Iván", "Emiliana", "Martino", "Noah", "Peter"};
        String[] apellidos = {"Velázquez, Menéndez", "González", "Bernárdez", "Gerárdez", "Fernández", "Hernández", "Rodríguez", "Méndez", "Vázquez", "Sánchez", "Márquez", "Ordóñez", "Álvarez", "Gómez", "Gutiérrez", "Barros", "Arroyos", "Ríos", "Lagunas", "Lagos", "Castelli", "Cartelli", "Martelli", "Onelli", "Ferrari", "Vargas", "Vergara", "Ilari", "Flores", "Reyes", "Petrelli", "Minelli", "Pirelli", "Jara", "Vera", "Ferrera", "Guerrera", "Herrera", "Miranda"};
        ArrayList<String> nombresFormados = new ArrayList();
        for (int i = 0; i < 40; i++) {
            String nombreCompleto = nombres[(int) (Math.random() * 39)] + " " + apellidos[(int) (Math.random() * 39)];
            nombresFormados.add(nombreCompleto);
        }
        return nombresFormados;
    }

    public ArrayList generarDNI() {
        ArrayList<String> DNI = new ArrayList();
        boolean bandera;
        for (int i = 0; i < 40; i++) {
            do {
                bandera = false;
                long dni = (long) (Math.random() * 35000000) + 10000000;
                String DNIString = Long.toString(dni);
                if (!DNI.contains(DNIString)) {
                    DNI.add(DNIString);
                    bandera = true;
                }
            } while (!bandera);
        }
        return DNI;
    }

    public ArrayList crearAlumno() {
        ArrayList<String> nombre = this.generarNombreYApellido();
        ArrayList<String> DNI = this.generarDNI();
        ArrayList<Integer> DNI2 = new ArrayList();
        boolean bandera;
        int cont = 0;
        for (int i = 0; i < 40; i++) {
            do {
                bandera = false;
                int DNIposicion = (int) (Math.random() * 40);
                if (!DNI2.contains(DNIposicion)) {
                    DNI2.add(DNIposicion);
                    alumno.add(new Ejercicio4Alumno(nombre.get(i), DNI.get(DNIposicion), cont));
                    bandera = true;
                }
            } while (!bandera);
        }
        this.votos(cont);
        this.ordenarVotos();
        this.imprimirLista();
        this.crearFacilitadores();
        return alumno;
    }

    public void imprimirLista() {
        for (int i = 0; i < 40; i++) {
            System.out.print((i + 1) + " - ");
            System.out.println(alumno.get(i));
        }
    }

    public ArrayList votos(int cont) {
        ArrayList<Ejercicio4Voto> voto = new ArrayList();
        ArrayList<Ejercicio4Alumno> votados = new ArrayList();
        boolean bandera;
        for (int i = 0; i < alumno.size(); i++) {
            votados.clear();
            for (int j = 0; j < 3; j++) {
                do {
                    bandera = false;
                    int random = (int) (Math.random() * 40);
                    if (!alumno.get(i).equals(alumno.get(random))) {
                        for (Ejercicio4Alumno votado : votados) {
                            if (votado.equals(alumno.get(random))) {
                                cont++;
                                bandera = true;
                            }
                        }
                    } else {
                        bandera = true;
                    }
                    if (!bandera) {
                        votados.add(alumno.get(random));
                        alumno.get(random).setCantVotos(alumno.get(random).getCantVotos() + 1);
                    }
                } while (bandera);
            }
            voto.add(new Ejercicio4Voto(alumno.get(i), votados));
        }
        return voto;
    }

    public void ordenarVotos() {
        Collections.sort(alumno, ordenarPorVotos);
    }

    public void crearFacilitadores() {
        System.out.println("Facilitadores titulares:");
        for (int i = 0; i < 5; i++) {
            System.out.println(alumno.get(i));
        }
        System.out.println("Facilitadores suplentes:");
        for (int i = 5; i < 10; i++) {
            System.out.println(alumno.get(i));
        }
    }

}
