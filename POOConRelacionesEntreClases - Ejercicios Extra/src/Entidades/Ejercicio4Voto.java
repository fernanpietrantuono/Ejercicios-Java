package Entidades;

import java.util.ArrayList;

public class Ejercicio4Voto {

    private Ejercicio4Alumno alumnoVotador;
    private ArrayList<Ejercicio4Alumno> alumnosVotados;

    public Ejercicio4Voto() {
    }

    public Ejercicio4Voto(Ejercicio4Alumno alumnoVotador, ArrayList<Ejercicio4Alumno> alumnosVotados) {
        this.alumnoVotador = alumnoVotador;
        this.alumnosVotados = alumnosVotados;
    }

    public Ejercicio4Alumno getAlumnoVotador() {
        return alumnoVotador;
    }

    public void setAlumnoVotador(Ejercicio4Alumno alumnoVotador) {
        this.alumnoVotador = alumnoVotador;
    }

    public ArrayList<Ejercicio4Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Ejercicio4Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

}
