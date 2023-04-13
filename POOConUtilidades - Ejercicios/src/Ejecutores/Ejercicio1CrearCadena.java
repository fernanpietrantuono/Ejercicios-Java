package Ejecutores;

import Servicios.Ejercicio1CadenaServicio;
import java.util.Scanner;

public class Ejercicio1CrearCadena {

    public static void main(String[] args) {
        Ejercicio1CadenaServicio cas = new Ejercicio1CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        int opcion;
        cas.IngresarFrase();
        while (!salir) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("MENU");
            System.out.println("1. MOSTRAR VOCALES");
            System.out.println("2. INVERTIR FRASE");
            System.out.println("3. LETRA REPETIDA");
            System.out.println("4. COMPARAR LONGITUD");
            System.out.println("5. UNIR FRASES");
            System.out.println("6. REEMPLAZAR LETRA A");
            System.out.println("7. CONTIENE LETRA?");
            System.out.println("8. SALIR");
            System.out.println("Elija una Opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cas.MostrarVocales();
                    break;
                case 2:
                    cas.InvertirFrase();
                    break;
                case 3:
                    cas.vecesRepetidos();
                    break;
                case 4:
                    cas.CompararLongitud();
                    break;
                case 5:
                    cas.UnirFrases();
                    break;
                case 6:
                    cas.ReemplazarLetra();
                    break;
                case 7:
                    boolean resp = cas.ContieneChar();
                    if (resp == true) {
                        System.out.println("La Frase contiene ese Caracter");
                    } else {
                        System.out.println("La Frase NO contiene ese Caracter");
                    }
                    break;
                case 8:
                    System.out.println("Desea Salir de la Aplicación? S/N");
                    String res = leer.next().toLowerCase();
                    if ("s".equals(res)) {
                        salir = true;
                        break;
                    }
                default:
                    System.out.println("Solo Números entre 1 y 8");
            }
        }
    }

}
