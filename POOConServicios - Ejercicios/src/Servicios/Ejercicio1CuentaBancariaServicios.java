package Servicios;

import Entidades.Ejercicio1CuentaBancaria;
import java.util.Scanner;

public class Ejercicio1CuentaBancariaServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ejercicio1CuentaBancaria cuenta = new Ejercicio1CuentaBancaria();

    public void crearCuenta() {
        System.out.println("Por favor introduzca su Número de cuenta: ");
        int nc = leer.nextInt();
        cuenta.setNumeroCuenta(nc);
        System.out.println("Por favor introduzca su DNI: ");
        long dni = leer.nextLong();
        cuenta.setDniCliente(dni);
        System.out.println("Por favor introduzca su Saldo Actual: ");
        double sa = leer.nextDouble();
        cuenta.setSaldoActual(sa);        
    }

    public double ingresar() {
        System.out.println("Por favor introduzca la cantidad a depositar");
        double ingreso = leer.nextDouble();
        double saldo = cuenta.getSaldoActual();
        return saldo += ingreso;
    }

    public double retirar() {
        System.out.println("Por favor introduzca la cantidad a retirar");
        double egreso = leer.nextDouble();
        double saldo = cuenta.getSaldoActual();

        if (saldo > egreso) {
            cuenta.setSaldoActual(saldo - egreso);
            return saldo;
        } else {
            cuenta.setSaldoActual(0);
            System.out.println("Ustéd retiró:\n $" + saldo + " Dólares");
            return saldo;
        }

    }

    public void extraccionRapida() {
        double saldo = cuenta.getSaldoActual();
        System.out.println("Introduzca un monto a retirar express.\nRecuerde que utilizando este método ustéd solo podrá extraer hasta un 20% de su saldo.\nActualmente su saldo es de: $" + saldo + " y lo máximo que puede retirar ahora mismo es: " + saldo * 0.2 + " Dólares");
        System.out.println("Introduzca el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > saldo * 0.2) {
            System.out.println("Su extracción excede el máximo permitido para este tipo de operación");
        } else {
            cuenta.setSaldoActual(saldo - retiro);
            System.out.println("Gracias! su saldo actual es de: " + cuenta.getSaldoActual());
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: ");
        System.out.println(cuenta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("Sus datos son:");
        System.out.println(cuenta);
    }
}
