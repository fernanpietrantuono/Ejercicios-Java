package Entidades;

public class Ejercicio2Pelicula {

    private String nombre;
    private Integer duracion;
    private Integer edadMinima;
    private String director;

    public Ejercicio2Pelicula() {
    }

    public Ejercicio2Pelicula(String nombre, Integer duracion, Integer edadMinima, String director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Ejercicio2Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
}
