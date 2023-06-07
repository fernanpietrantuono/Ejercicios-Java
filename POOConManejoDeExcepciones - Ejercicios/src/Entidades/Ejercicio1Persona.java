package Entidades;

import java.util.Scanner;

public class Ejercicio1Persona {

    private String nombre;
    private int edad;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejercicio1Persona() {
    }

    public Ejercicio1Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public void esMayorDeEdad() {
        int edaad;
        boolean opc = true;
        do {
            try {
                System.out.println("Ingresa la edad de " + this.nombre);
                edaad = leer.nextInt();

                if (edaad >= 18) {
                    System.out.println("Es mayor de edad");
                    this.edad = edaad;
                    opc = false;
                } else {
                    System.out.println("Es menor de edad");
                    this.edad = edaad;
                    opc = false;
                }
            } catch (Exception ex) {
                System.out.println("Error los datos ingresados no coinciden, ingrese un numero,\nTipo de error: " + ex);
                leer.next();
            } finally {
                System.out.println("\nEl programa siempre ejecutará este mensaje");
            }
            System.out.println("\nEstá en la continuación del código");
        } while (opc);
    }

}
