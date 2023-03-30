package poo.ejercicios.extra;

import Entidades.Ejercicio5Cuenta;
import java.util.Scanner;

public class Ejercicio5OperacionBancaria {

    public static void main(String[] args) throws InterruptedException {
        Ejercicio5Cuenta s1 = new Ejercicio5Cuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        s1.setSaldo(Math.random() * 500000);
        s1.setTitular("Fernán");
        String resp = "";
        int opc, intentos = 0;
        System.out.println("Hola, ingrese el PIN de tu cuenta");
        int pin = leer.nextInt();
        while (pin != 8945 && intentos < 3) {
            Thread.sleep(1500);
            System.out.println("Error, PIN incorrecto. Ingréselo nuevamente");
            pin = leer.nextInt();
            intentos++;
        }
        if (pin == 8945) {
            Thread.sleep(1500);
            System.out.println("Saldo disponible: $" + s1.getSaldo());
            System.out.println("Bienvenido, " + s1.getTitular());
        } else {
            System.out.println("Cuenta bloqueada");
        }
        if (pin == 8945) {
            do {
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("1. Transferencia y depósito");
                System.out.println("2. Extracción/adelanto");
                System.out.println("3. Claves");
                System.out.println("4. Consulta de saldos");
                System.out.println("5. Pago mis cuentas");
                System.out.println("6. Extracción rápida");
                System.out.println("7. Recargas");
                System.out.println("8. Otras operaciones");
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        s1.TransferenciaYDeposito();
                        break;
                    case 2:
                        s1.RetirarDinero();
                        break;
                    case 3:
                        s1.Claves();
                        break;
                    case 4:
                        s1.ConsultaDeSaldos();
                        break;
                    case 5:
                        s1.PagoMisCuentas();
                        break;
                    case 6:
                        s1.ExtraccionRapida();
                        break;
                    case 7:
                        s1.Recargas();
                        break;
                    case 8:
                        s1.OtrasOperaciones();
                        break;
                    default:
                        System.out.println("La opción ingresada es incorrecta");
                }
                System.out.println("Desea realizar otra operación?");
                resp = leer.next();
                if (resp.equalsIgnoreCase("No")) {
                    System.out.println("Cerrando operación. Por favor, retire su tarjeta");
                    break;
                }
            } while (!resp.equalsIgnoreCase("No"));
        }
    }

}
