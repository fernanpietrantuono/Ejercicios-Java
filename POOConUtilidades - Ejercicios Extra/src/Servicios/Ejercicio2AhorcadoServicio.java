package Servicios;

import Entidades.Ejercicio2Ahorcado;
import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2AhorcadoServicio {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ejercicio2Ahorcado crearJuego() {
        System.out.println("Ingrese una palabra a adivinar");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos que quiera desafiar");
        int intentos = leer.nextInt();
        return new Ejercicio2Ahorcado(palabra, intentos);
    }
    
    public void limpiarANT(Ejercicio2Ahorcado p1) {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(KeyEvent.VK_CONTROL);
            pressbot.keyPress(KeyEvent.VK_L);
            pressbot.keyRelease(KeyEvent.VK_CONTROL);
            pressbot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
            System.out.println("" + ex.getMessage());
        }
    }
    
    public void longitud(Ejercicio2Ahorcado p1) {
        System.out.println("La palabra contiene " + p1.getPalabra().length);
    }
    
    public boolean buscar(Ejercicio2Ahorcado p1, char letraIngresada) {
        int cont = 0;
        boolean buscado = false;
        while (!buscado && cont < p1.getPalabra().length) {
            if (letraIngresada == p1.getPalabra()[cont]) {
                buscado = true;
            } else {
                cont++;
            }
        }
        if (buscado == true) {
            System.out.println("La letra está en la palabra");
        } else {
            System.out.println("La letra no está en la palabra");
        }
        return buscado;
    }
    
    public void encontradas(Ejercicio2Ahorcado p1, char letraIngresada) {
        if (this.buscar(p1, letraIngresada)) {
            int cont = 0;
            for (int i = 0; i < p1.getPalabra().length; i++) {
                if (p1.getPalabra()[i] == letraIngresada) {
                    cont++;
                    p1.getDescubierta()[i] = letraIngresada;
                }
            }
            p1.setLetras(p1.getLetras() + cont);
        } else {
            p1.setIntentos(p1.getIntentos() - 1);
        }
        System.out.println("Números de letras (encontradas, faltantes): " + p1.getLetras() + "," + (p1.getPalabra().length - p1.getLetras()));
    }
    
    public void intentos(Ejercicio2Ahorcado p1) {
        System.out.println("Cantidad de intentos restantes: " + p1.getIntentos());
    }
    
    public void juego() {
        Ejercicio2Ahorcado p1;
        p1 = this.crearJuego();
        this.limpiarANT(p1);
        do {
            System.out.println("------------------------------------------------");
            System.out.println(Arrays.toString(p1.getDescubierta()));
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            this.longitud(p1);
            this.encontradas(p1, letra.charAt(0));
            this.intentos(p1);
        } while (p1.getIntentos() > 0 && p1.getLetras() < p1.getPalabra().length);
        if (p1.getIntentos() == 0) {
            System.out.println("Lo sentimos, no hay más chances");
        } else {
            System.out.println("Felicitaciones, acertaste la palabra!!!!!!");
        }
        System.out.println("La palabra era " + Arrays.toString(p1.getPalabra()));
    }
    
}
