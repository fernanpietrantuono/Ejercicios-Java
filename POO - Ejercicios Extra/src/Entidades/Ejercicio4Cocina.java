package Entidades;

import java.util.Scanner;

public class Ejercicio4Cocina {

    public String[][] receta;

    public Ejercicio4Cocina() {
    }

    public Ejercicio4Cocina(String[][] receta) {
        this.receta = receta;
    }

    public String[][] getReceta() {
        return receta;
    }

    public void setReceta(String[][] receta) {
        this.receta = receta;
    }

    public void CrearRecetas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.receta = receta;
        receta = new String[20][20];
        String resp;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                receta[i][j] = " ";
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j == 0) {
                    System.out.println("Ingrese el nombre de su receta");
                    receta[i][j] = leer.next();
                }
                if (j > 0) {
                    System.out.println("Ingrese el ingrediente " + j + " de su receta");
                    receta[i][j] = leer.next();
                    System.out.println("¿Quiere seguir ingresando ingredientes?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("no")) {
                        break;
                    }

                }
            }
            System.out.println(" ");
            resp = "si";
            System.out.println("¿Quiere seguir ingresando recetas?");
            resp = leer.next();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println(" ");
        }
    }

    public void ActualizarRecetas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.receta = receta;
        String resp;
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            cont = 0;
            for (int j = 0; j < 20; j++) {
                if (!" ".equals(receta[i][j])) {
                    cont = 1;
                    break;
                }
                if (j == 0) {
                    System.out.println("Ingrese el nombre de su receta");
                    receta[i][j] = leer.next();
                }
                if (j > 0) {
                    System.out.println("Ingrese el ingrediente " + j + " de su receta");
                    receta[i][j] = leer.next();
                    System.out.println("¿Quiere seguir ingresando ingredientes?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("no")) {
                        break;
                    }
                }
            }
            if (cont != 1) {
                System.out.println(" ");
                resp = "si";
                System.out.println("¿Quiere seguir ingresando recetas?");
                resp = leer.next();
                if (resp.equalsIgnoreCase("no")) {
                    break;
                }
                System.out.println(" ");
            }
        }
    }

    public void BuscarIngrediente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.receta = receta;
        String ingrediente;
        System.out.println("Ingrese un ingrediente");
        ingrediente = leer.next();
        int[] recetas = new int[20];
        int aux;
        for (int i = 0; i < 20; i++) {
            recetas[i] = -1;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (ingrediente.equals(receta[i][j])) {
                    recetas[i] = i;
                }
            }
        }
        System.out.println("El ingrediente se encuentra presente en las siguentes recetas: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                aux = recetas[i];
                if (j == 0 && aux != -1) {
                    System.out.println(receta[aux][j].toUpperCase());
                }
            }
        }
    }

    public void MostrarRecetas() {
        this.receta = receta;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!(receta[i][j] == " ")) {
                    if (j == 0) {
                        System.out.println(receta[i][j].toUpperCase() + ":");
                    } else {
                        System.out.println(j + ". " + receta[i][j]);
                    }
                }
            }
        }
    }
}
