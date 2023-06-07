package Servicios;

import Entidades.Ejercicio3Persona;
import java.util.Scanner;

public class Ejercicio3PersonaServicio {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Ejercicio3Persona p) {
        return p.getEdad() >= 18;
    }

    public Ejercicio3Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona");
        String sexo = leer.next();
        System.out.println("Ingrese el peso de la persona");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona");
        double altura = leer.nextDouble();
        if ("h".equals(sexo) || "m".equals(sexo) || "o".equals(sexo)) {
            System.out.println("El sexo introducido es correcto");
        } else {
            System.out.println("El sexo introducido es incorrecto");
        }
        return new Ejercicio3Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Ejercicio3Persona p) {
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public void porcentaje(boolean[] mayores, int[] imc) {
        int contMay = 0;
        int contMen = 0;
        int contDebajoPeso = 0;
        int contPesoIdeal = 0;
        int contSobrepeso = 0;
        for (int i = 0; i < 4; i++) {
            if (mayores[i]) {
                contMay++;
            } else {
                contMen++;
            }
            if (imc[i] < 0) {
                contDebajoPeso++;
            } else if (imc[i] == 0) {
                contPesoIdeal++;
            } else {
                contSobrepeso++;
            }
        }
        System.out.println("El porcentaje de personas debajo de su peso ideal es del " + ((float)contDebajoPeso/4)*100);
        System.out.println("El porcentaje de personas en su peso ideal es del " + ((float)contPesoIdeal/4)*100);
        System.out.println("El porcentaje de personas sobre de su peso ideal es del " + ((float)contSobrepeso/4)*100);
        System.out.println("El porcentaje de personas mayores de edad es del " + ((float)contMay/4)*100);
        System.out.println("El porcentaje de personas menores de edad es del " + ((float)contMen/4)*100);
    }

}
