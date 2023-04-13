package Servicios;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio4FechaServicio {

    private static Scanner leer = new Scanner(System.in);

    public static Date fechaDeNacimiento(int dia, int mes, int anio) {
        System.out.println("Ingrese su fecha de nacimiento. DD/MM/AAAA");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        return fecha;
    }

    public static Date fechaActual(int dia, int mes, int anio) {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public static void diferencia(Date fecha, Date fechaActual) {
        int a = fecha.getYear();
        int b = fechaActual.getYear();
        System.out.println("Usted tiene " + ((b - a) + 1900) + " años");
    }
}
