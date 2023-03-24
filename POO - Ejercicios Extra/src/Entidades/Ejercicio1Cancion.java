package Entidades;

public class Ejercicio1Cancion {
    public String titulo;
    public String autor;

    public Ejercicio1Cancion() {
        titulo = "";
        autor = "";
    }

    public Ejercicio1Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ejercicio1Cancion{" + "titulo= " + titulo + ", autor= " + autor + '}';
    }
    
}
