package Entidades;

import java.util.Scanner;

public class Ejercicio5NumeroSecreto {

    private int numIngresado, numSecreto;
    private Scanner leer = new Scanner(System.in);

    public Ejercicio5NumeroSecreto() {
    }

    public Ejercicio5NumeroSecreto(int numIngresado, int numSecreto) {
        this.numIngresado = numIngresado;
        this.numSecreto = numSecreto;
    }

    public int getNumIngresado() {
        return numIngresado;
    }

    public void setNumIngresado(int numIngresado) {
        this.numIngresado = numIngresado;
    }

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public void adivinarNumSecreto() {
        int cont = 0;
        numSecreto = (int) ((Math.random() * 500) + 1);
        do {
            try {
                System.out.println("Ingrese un número a adivinar");
                numIngresado = leer.nextInt();
                if (numIngresado > numSecreto) {
                    System.out.println("El número secreto es menor que el número ingresado");
                } else if (numIngresado < numSecreto) {
                    System.out.println("El número secreto es mayor que el número ingresado");
                } else {
                    System.out.println("ACERTASTE!!! El número secreto es " + numSecreto);
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("TE PEDÍ UN NÚMERO, NO UN CARÁCTER, NI UNA LETRA");
                leer.nextLine();
            }
            cont++;
        } while (numIngresado != numSecreto);
        System.out.println("Cantidad de intentos realizados: " + cont);
    }

}
