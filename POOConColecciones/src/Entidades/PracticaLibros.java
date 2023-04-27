package Entidades;

public class PracticaLibros {

    public String libro;

    public PracticaLibros() {
    }

    public PracticaLibros(String libro) {
        this.libro = libro;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "PracticaLibros{" + "Libro= " + libro + '}';
    }
    
}
