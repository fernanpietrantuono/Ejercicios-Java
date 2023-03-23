/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Entidad.Persona;

/**
 *
 * @author Daniel Pietrantuono
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona director = new Persona("Fernan", 43156494, "Pietrantuono");
        System.out.print(director.getNombre() + " ");
        System.out.print(director.getApellido() + " ");
        System.out.print(director.getDni());
        System.out.println("");
        director.setNombre("Armando");
        director.setApellido("Bernel");
        director.setDni(34215701);
        System.out.print(director.getNombre() + " ");
        System.out.print(director.getApellido() + " ");
        System.out.print(director.getDni());
        System.out.println("");

    }

}
