package Entidades;

public class Ejercicio2Array {

    private String titulo;
    private int[] numeros = new int[5];

    public Ejercicio2Array() {
    }

    public Ejercicio2Array(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void llenar() {
        int num;
        try {
            for (int i = 0; i < numeros.length; i++) {
                num = (int) (Math.random() * 10);
                System.out.println("Numero de posicion creado: " + num);
                numeros[num] = (int) (Math.random() * 10);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nEl número de posición solicitado está fuera de rango \nEl error es " + e);
        }
        System.out.println("");
        System.out.println("Array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
