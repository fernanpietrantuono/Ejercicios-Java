package Entidades;

import java.util.Scanner;

public class Ejercicios2y3Electrodomestico {

    protected float precio, peso;
    protected String color;
    protected char consumoEnergetico;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ejercicios2y3Electrodomestico() {
    }

    public Ejercicios2y3Electrodomestico(float precio, float peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Ejercicio2Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + '}';
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra != consumoEnergetico) {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase(this.color)) {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        this.peso = (float) Math.random() * 100 + 1;
        String listaValorEner = "ABCDEF";
        int indice = (int) (Math.random() * 6);
        char valorEnerRand = listaValorEner.charAt(indice);
        this.consumoEnergetico = valorEnerRand;
        String[] colores = new String[]{"Blanco", "Rojo", "Negro", "Azul", "Gris"};
        this.color = colores[(int) (Math.random() * 5)];
        this.precio = 1000;
        System.out.println("Por favor introduzca el color [Blanco/Negro/Rojo/Azul/Gris]");
        String colo = leer.next();
        comprobarColor(colo);
        System.out.println("Por favor introduzca el consumo energético [A/B/C/D/E/F]");
        char consEner = leer.next().charAt(0);
        comprobarConsumoEnergetico(consEner);
    }

    public float precioFinal() {
        float price = this.precio;
        char ce = this.consumoEnergetico;
        switch (ce) {
            case 'A':
                price += 1000;
                break;
            case 'B':
                price += 800;
                break;
            case 'C':
                price += 600;
                break;
            case 'D':
                price += 500;
                break;
            case 'E':
                price += 300;
                break;
            case 'F':
                price += 100;
                break;
        }
        if (this.peso >= 80f) {
            price += 1000;
        } else if (this.peso >= 50f && this.peso < 80f) {
            price += 800;
        } else if (this.peso >= 20f && this.peso < 50f) {
            price += 500;
        } else if (this.peso < 20f) {
            price += 100;
        }
        return price;
    }

}
