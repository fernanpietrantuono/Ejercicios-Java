package Entidades;

import Enumeradores.Ejercicio3FormaDePago;
import java.time.LocalDate;

public class Ejercicio3Cuotas {

    private int numCuota;
    private double montoTotalCuota;
    private boolean pagada = false;
    private LocalDate vencimiento;
    private Ejercicio3FormaDePago formaDePago;

    public Ejercicio3Cuotas() {
    }

    public Ejercicio3Cuotas(int numCuota, double montoTotalCuota, LocalDate vencimiento, Ejercicio3FormaDePago formaDePago) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.vencimiento = vencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Ejercicio3FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(Ejercicio3FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Ejercicio3Cuotas{" + "numCuota=" + numCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", vencimiento=" + vencimiento + ", formaDePago=" + formaDePago + "}\n";
    }
    
}
