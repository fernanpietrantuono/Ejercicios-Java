package Entidades;

import java.util.ArrayList;

public class Ejercicio3Clientes {

    private String nombre, apellido, mail, domicilio;
    private long dni, telefono;
    private ArrayList<Ejercicio3Polizas> polizaCliente;

    public Ejercicio3Clientes() {
    }

    public Ejercicio3Clientes(String nombre, String apellido, String mail, String domicilio, long dni, long telefono, ArrayList<Ejercicio3Polizas> polizaCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.polizaCliente = polizaCliente;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Ejercicio3Polizas> getPolizaCliente() {
        return polizaCliente;
    }

    public void setPolizaCliente(ArrayList<Ejercicio3Polizas> polizaCliente) {
        this.polizaCliente = polizaCliente;
    }

    @Override
    public String toString() {
        return "Ejercicio3Clientes{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Mail: " + mail + ", Domicilio: " + domicilio + ", DNI: " + dni + ", Teléfono: " + telefono + ",\n Póliza Cliente: " + polizaCliente + '}';
    }
    
}
