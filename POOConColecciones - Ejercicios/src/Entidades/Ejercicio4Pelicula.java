package Entidades;

import java.util.Comparator;

public class Ejercicio4Pelicula {

    public String titulo;
    public String director;
    public Integer duracion;

    public Ejercicio4Pelicula() {
    }

    public Ejercicio4Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Ejercicio4Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Ejercicio4Pelicula> compararPelisDuracionDescendente = new Comparator<Ejercicio4Pelicula>() {
        @Override
        public int compare(Ejercicio4Pelicula p, Ejercicio4Pelicula p1) {
            return p1.getDuracion().compareTo(p.getDuracion());
        }
    };

    public static Comparator<Ejercicio4Pelicula> compararPelisDuracionAscendente = new Comparator<Ejercicio4Pelicula>() {
        @Override
        public int compare(Ejercicio4Pelicula p, Ejercicio4Pelicula p1) {
            return p.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Ejercicio4Pelicula> compararPelisTitulo = new Comparator<Ejercicio4Pelicula>() {
        @Override
        public int compare(Ejercicio4Pelicula p, Ejercicio4Pelicula p1) {
            return p.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
    public static Comparator<Ejercicio4Pelicula> compararPelisDirector = new Comparator<Ejercicio4Pelicula>() {
        @Override
        public int compare(Ejercicio4Pelicula p, Ejercicio4Pelicula p1) {
            return p.getDirector().compareTo(p1.getDirector());
        }
    };

}
