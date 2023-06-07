package Practica;

import Servicio.PersonaServicio;

public class RegistroPersonas {
    
    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        ps.crearPersona();
        ps.mostrarPersona();
        
    }

}
