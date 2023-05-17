package Entidades;

import java.util.Objects;

public class Ejercicio1Persona {

    private String nombre;
    private String apellido;
    private Integer edad;
    private Long DNI;
    private Ejercicio1Perro mascota;

    public Ejercicio1Persona() {
    }

    public Ejercicio1Persona(String nombre, String apellido, Integer edad, Long DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.edad);
        hash = 67 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejercicio1Persona other = (Ejercicio1Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return Objects.equals(this.DNI, other.DNI);
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
