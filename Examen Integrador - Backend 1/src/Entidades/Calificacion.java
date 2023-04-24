package Entidades;

public class Calificacion {

    private String[] estudiante;
    private String nombre;
    private int nota;

    public Calificacion() {
    }

    public Calificacion(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String[] estudiante) {
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
