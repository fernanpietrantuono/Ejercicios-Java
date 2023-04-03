package Servicios;

import Entidades.Ejercicio2Cafetera;
import java.util.Scanner;

public class Ejercicio2CafeteraServicio {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio2Cafetera t1 = new Ejercicio2Cafetera();
    
    public Ejercicio2Cafetera crearCafetera() {
        System.out.println("Ingrese la capacidad máxima");
        int cm = leer.nextInt();
        System.out.println("Ingrese la cantidad actual");
        int ca = leer.nextInt();
        while (cm < ca) {            
            System.out.println("La cantidad actual de café supera la capacidad máxima. \n Ingrese nuevamente");
            ca = leer.nextInt();
        }
        return new Ejercicio2Cafetera (cm, ca);
    }
    
    public void llenarCafetera(Ejercicio2Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMax());
    }
    
    public void servirTaza(Ejercicio2Cafetera cafetera, int taza) throws InterruptedException {
        if (cafetera.getCantidadActual() < taza) {
            System.out.println("Sirviendo café");
            Thread.sleep(30000);
            System.out.println("La taza no se llenó");
            System.out.println("El contenido es igual a " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Sirviendo café");
            Thread.sleep(30000);
            System.out.println("La taza se llenó");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
    }
    
    public void vaciarCafetera(Ejercicio2Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Ejercicio2Cafetera cafetera, int cantidad) {
        if (cafetera.getCantidadActual() + cantidad > cafetera.getCapacidadMax()) {
            System.out.println("La cafetera se llenó");
            cafetera.setCantidadActual(cafetera.getCapacidadMax());
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cantidad);
            System.out.println("La cafetera quedó con " + cafetera.getCantidadActual());
        }
    }
}
