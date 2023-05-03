package Servicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6TiendaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final HashMap<String, Double> producto = new HashMap();

    public void introducirElemento() {
        System.out.println("Introduzca el nombre del producto");
        String nombre = leer.next();
        System.out.println("Ahora el precio por favor");
        double precio = leer.nextDouble();
        producto.put(nombre, precio);
    }

    public void modificarPrecio() {
        System.out.println("Introduzca el nombre del producto al cual modificarle el precio");
        String busqueda = leer.next();
        System.out.println("Introduzca el valor nuevo del producto");
        double precio = leer.nextDouble();
        producto.put(busqueda, precio);
    }

    public void eliminarProducto() {
        System.out.println("Introduzca un producto a borrar");
        String busqueda = leer.next();
        if (producto.containsKey(busqueda)) {
            producto.remove(busqueda);
            System.out.println("Producto eliminado");
        } else {
            System.out.println("El producto no existe");
        }
    }

    public void mostrarProductos() {
        producto.entrySet().forEach((aux) -> {
            System.out.println("Nombre: " + aux.getKey() + "\nPrecio: $" + aux.getValue());
        });
    }

    public void menu() {
        boolean salir = false;
        System.out.println("¡Bienvenido!");
        while (!salir) {
            System.out.println("MENÚ: ");
            System.out.println("\t° 1 - Introducir Producto");
            System.out.println("\t° 2 - Modificar Precio");
            System.out.println("\t° 3 - Eliminar Producto");
            System.out.println("\t° 4 - Mostrar Productos");
            System.out.println("\t° 5 - Salir");
            System.out.println("Ingrese una opción");
            int choice = leer.nextInt();
            switch (choice) {
                case 1:
                    introducirElemento();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("¡Hasta Luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción Inválida");
            }
        }
    }

}
