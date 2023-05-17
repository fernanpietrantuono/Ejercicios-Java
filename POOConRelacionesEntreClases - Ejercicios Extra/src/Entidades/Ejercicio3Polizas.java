package Entidades;

import java.util.Date;

public class Ejercicio3Polizas {

    private int numPoliza;
    private Date inicioPoliza;
    private Date finPoliza;
    private int cantCuotas;
    private String formaDePago;
    private double montoTotalAsegurado;
    private boolean granizo;
    private double montoMaxGranizo;
    private String cobertura;

    public Ejercicio3Polizas() {
    }

    public Ejercicio3Polizas(int numPoliza, Date inicioPoliza, Date finPoliza, int cantCuotas, String formaDePago, double montoTotalAsegurado, boolean granizo, double montoMaxGranizo, String cobertura) {
        this.numPoliza = numPoliza;
        this.inicioPoliza = inicioPoliza;
        this.finPoliza = finPoliza;
        this.cantCuotas = cantCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.cobertura = cobertura;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getInicioPoliza() {
        return inicioPoliza;
    }

    public void setInicioPoliza(Date inicioPoliza) {
        this.inicioPoliza = inicioPoliza;
    }

    public Date getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(Date finPoliza) {
        this.finPoliza = finPoliza;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Ejercicio3Polizas{" + "numPoliza=" + numPoliza + ", inicioPoliza=" + inicioPoliza + ", finPoliza=" + finPoliza + ", cantCuotas=" + cantCuotas + ", formaDePago=" + formaDePago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", cobertura=" + cobertura + '}';
    }
    
}
