package Ejecutores;

import Servicios.Ejercicio1CuentaBancariaServicios;
import java.util.Scanner;

public class Ejercicio1EjecutarCuentaBancaria {

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        Ejercicio1CuentaBancariaServicios cuenta = new Ejercicio1CuentaBancariaServicios();
        boolean menu = true;
        int intentos = 0;
        System.out.println("Hola, ingrese el PIN de tu cuenta");
        int pin = leer.nextInt();
        while (pin != 9072 && intentos < 3) {
            Thread.sleep(1500);
            System.out.println("Error, PIN incorrecto. Ingréselo nuevamente");
            pin = leer.nextInt();
            intentos++;
        }
        if (pin == 9072) {
            Thread.sleep(1500);
            System.out.println("Bienvenido al Banco Fernán");
        } else {
            System.out.println("Cuenta bloqueada");
        }
        if (pin == 9072) {
            do {
                System.out.println("Ingrese una opción");
                System.out.println(" ");
                System.out.println("MENÚ");
                System.out.println("1. Ingreso de datos");
                System.out.println("2. Depósito");
                System.out.println("3. Extracción");
                System.out.println("4. Retiro Express");
                System.out.println("5. Muestra de datos");
                System.out.println("6. Salir");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        cuenta.crearCuenta();
                        break;
                    case 2:
                        cuenta.ingresar();
                        break;
                    case 3:
                        cuenta.retirar();
                        break;
                    case 4:
                        cuenta.extraccionRapida();
                        break;
                    case 5:
                        cuenta.consultarDatos();
                        break;
                    case 6:
                        System.out.println("Desea realmente salir? S/N");
                        String salir = leer.next().toLowerCase();
                        if ("s".equals(salir)) {
                            System.out.println("Hasta luego!");
                            menu = false;
                        }
                        break;
                    default:
                        System.out.println("Opción inválida, ponele onda hermano");
                }

            } while (menu);
        }
    }

}
