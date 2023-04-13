package Entidades;

public class Ejercicio4Estudiantes {

    public String nombre;
    public int edad;
    public int notaMedia;

    public Ejercicio4Estudiantes() {
    }

    public Ejercicio4Estudiantes(String nombre, int edad, int notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }
    
}
