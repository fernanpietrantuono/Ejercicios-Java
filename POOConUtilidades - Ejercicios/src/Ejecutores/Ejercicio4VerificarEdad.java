package Ejecutores;

import Servicios.Ejercicio4FechaServicio;
import java.util.Date;

public class Ejercicio4VerificarEdad {

    public static void main(String[] args) {
        Date d1 = Ejercicio4FechaServicio.fechaDeNacimiento(0, 0, 0);
        Date d2 = Ejercicio4FechaServicio.fechaActual(0, 0, 0);
        Ejercicio4FechaServicio.diferencia(d1, d2);
    }

}
