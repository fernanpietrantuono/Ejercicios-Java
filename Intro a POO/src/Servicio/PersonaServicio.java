package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Persona p1 = new Persona();
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public void crearPersona(){
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        p1.setNombre(nombre);
        System.out.println("Ingrese el apellido de la persona");
        String apellido = leer.next();
        p1.setApellido(apellido);
        System.out.println("Ingrese el DNI de la persona");
        long dni = leer.nextLong();
        p1.setDni(dni);
        
    }
    
    public void mostrarPersona(){
        System.out.println(p1);
    }
}
