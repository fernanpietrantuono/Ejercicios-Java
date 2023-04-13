package Servicios;

import Entidades.Ejercicio1Cadena;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1CadenaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final Ejercicio1Cadena ca = new Ejercicio1Cadena();

    public void IngresarFrase() {
        System.out.println("Ingresar una frase:");
        String fraseIng = leer.next();
        ca.setFrase(fraseIng);
    }

    public void MostrarVocales() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);
        for (int x = 0; x < ca.getFrase().length(); x++) {
            char letraActual = ca.getFrase().charAt(x);
            if (esVocal(letraActual)) {
                String clave = String.valueOf(letraActual).toLowerCase();
                hashMap.put(clave, hashMap.get(clave) + 1);
            }
        }
        System.out.printf("Resultados para '%s':\n", ca.getFrase());
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Vocal: %s. Conteo: %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println("");
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }

    public void InvertirFrase() {
        StringBuilder stringBuilder = new StringBuilder(ca.getFrase());
        String invertida = stringBuilder.reverse().toString();
        System.out.println("Cadena original: " + ca.getFrase());
        System.out.println("Cadena invertida: " + invertida);
    }

    public void vecesRepetidos() {
        String caracter;
        int numeroDeVeces = 0;
        System.out.print("Introduce un carácter: ");
        caracter = leer.next();
        numeroDeVeces = contarCaracteres(ca.getFrase(), caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
    }

    public static int contarCaracteres(String cadena, String caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

    public void CompararLongitud() {
        System.out.println("Ingresar una nueva frase:");
        String fraseIng2 = leer.next();
        if (ca.getFrase().length() == fraseIng2.length()) {
            System.out.println("Las Frases tienen la misma Longitud");
        } else {
            System.out.println("Las Frases NO tienen la misma Longitud");
        }
    }

    public void UnirFrases() {
        System.out.println("Ingresar una nueva frase:");
        String fraseI = leer.next();
        String nuevaF = ca.getFrase().concat(" " + fraseI);
        System.out.println("Frases Unidas: " + nuevaF);
    }

    public void ReemplazarLetra() {
        String nuevaFrase = ca.getFrase().replace("a", "&");
        System.out.println("La nueva Frase sería:");
        System.out.println(nuevaFrase);
    }

    public boolean ContieneChar() {
        boolean resultado;
        System.out.println("Ingresar una letra:");
        String fraseIc = leer.next();
        if (ca.getFrase().contains(fraseIc)) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
