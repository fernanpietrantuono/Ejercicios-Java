package Entidades;

public class Ejercicio6Empleado {

    public String nombre;
    public int edad;
    public double salario;

    public Ejercicio6Empleado() {
    }

    public Ejercicio6Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void CalcularAumento() {
        double aumento;
        if (edad >= 30) {
            aumento = salario * 1.1;
        } else {
            aumento = salario * 1.05;
        }
        System.out.println("El aumento salarial de " + nombre + " es de $" + aumento);
    }
}
