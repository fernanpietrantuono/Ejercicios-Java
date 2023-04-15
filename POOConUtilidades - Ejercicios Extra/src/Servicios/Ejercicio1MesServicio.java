package Servicios;

import Entidades.Ejercicio1Mes;
import java.util.Scanner;

public class Ejercicio1MesServicio {

    public static void adivinarMes(Ejercicio1Mes m) {
        Scanner leer = new Scanner(System.in);
        int cont = 1;
        System.out.println("Ingrese un mes en minúsculas para adivinar");
        String adivinanza = leer.next();

        while (!adivinanza.equals(m.getMesSecreto()) && cont < 9) {
            System.out.println("Incorrecto. Ingrese nuevamente otro mes");
            adivinanza = leer.next();
            cont++;
        }
        if (!adivinanza.equals(m.getMesSecreto()) && cont == 9) {
            System.out.println("Cometiste muchos fallos. No lograste acertar. \nEl mes era " + m.getMesSecreto());
        } else {
            System.out.println("Acertaste! El mes correcto es " + m.getMesSecreto());
        }
    }
}
