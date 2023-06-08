package Entidades;

public class Ejercicio8PruebasDeCodigo {

    public int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W"); //Class Uno: "42" - Class Dos: "W" - Class Tres: "W"
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W"); //Class Uno: "42" - Class Dos: "42" - Class Tres: "W"
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
    
}
