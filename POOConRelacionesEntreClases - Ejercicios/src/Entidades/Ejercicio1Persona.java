package Entidades;

public class Ejercicio1Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Long DNI;
    private Ejercicio1Perro mascota;

    public Ejercicio1Persona() {
    }

    public Ejercicio1Persona(String nombre, String apellido, Integer edad, Long DNI, Ejercicio1Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Ejercicio1Perro getMascota() {
        return mascota;
    }

    public void setMascota(Ejercicio1Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "{Nombre= " + nombre + ", Apellido= " + apellido + ", Edad= " + edad + ", DNI= " + DNI + ", Mascota= " + mascota + '}';
    }
    
}
