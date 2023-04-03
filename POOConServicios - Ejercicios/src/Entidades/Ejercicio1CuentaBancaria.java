package Entidades;

public class Ejercicio1CuentaBancaria {

    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public Ejercicio1CuentaBancaria() {
    }

    public Ejercicio1CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "\n\nSu numero de Cuenta es:" + numeroCuenta + "\nSu DNI es: " + dniCliente + "\nY su saldo actual es de: " + saldoActual + "\n\n";
    }
    
}
