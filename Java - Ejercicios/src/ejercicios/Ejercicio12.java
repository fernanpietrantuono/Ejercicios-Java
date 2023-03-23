package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contCorrectas = 0;
        int contIncorrectas = 0;
        String cadena = "";
        System.out.println("Ingrese una cadena");
        do {
            cadena = leer.nextLine();
            if (cadena.equals("&&&&&")) {
                break;
            } else if ("x".equals(cadena.substring(0, 1))
                    && "o".equals(cadena.substring(cadena.length() - 1, cadena.length()))
                    && cadena.length() < 6) {
                System.out.println("La cadena es correcta");
                contCorrectas++;
                System.out.println("Ingrese otra cadena nueva");
            } else {
                System.out.println("La cadena es incorrecta");
                contIncorrectas++;
                System.out.println("Ingrese otra cadena nueva");
            }
        } while (!("&&&&&".equalsIgnoreCase(cadena)));
        System.out.println("Cantidad de cadenas correctas leídas: " + contCorrectas);
        System.out.println("Cantidad de cadenas incorrectas leídas: " + contIncorrectas);
    }

}
