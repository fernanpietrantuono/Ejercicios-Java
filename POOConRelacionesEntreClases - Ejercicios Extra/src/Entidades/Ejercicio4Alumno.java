package Entidades;

public class Ejercicio4Alumno {

    private String nombre, DNI;
    private Integer cantVotos;

    public Ejercicio4Alumno() {
    }

    public Ejercicio4Alumno(String nombre, String DNI, Integer cantVotos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "{Nombre y Apellido: " + nombre + ", DNI: " + DNI + ", Cantidad de Votos: " + cantVotos + '}';
    }

}
