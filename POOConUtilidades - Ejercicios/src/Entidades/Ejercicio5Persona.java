package Entidades;

import java.util.Date;

public class Ejercicio5Persona {

    private String nombre;
    private Date fechaDeNacimiento;

    public Ejercicio5Persona() {
    }

    public Ejercicio5Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "{" + "Nombre = " + nombre + "\nFecha De Nacimiento = " + fechaDeNacimiento + '}';
    }
    
}
