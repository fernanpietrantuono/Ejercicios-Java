package Entidades;

import java.util.Date;

public class Ejercicio3Cuotas {

    private int numCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private Date vencimiento;
    private String formaDePago;

    public Ejercicio3Cuotas() {
    }

    public Ejercicio3Cuotas(int numCuota, double montoTotalCuota, boolean pagada, Date vencimiento, String formaDePago) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
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

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Ejercicio3Cuotas{" + "numCuota=" + numCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", vencimiento=" + vencimiento + ", formaDePago=" + formaDePago + '}';
    }
    
}
