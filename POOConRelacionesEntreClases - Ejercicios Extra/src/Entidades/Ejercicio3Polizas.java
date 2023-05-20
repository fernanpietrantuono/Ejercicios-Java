package Entidades;

import Enumeradores.Ejercicio3Cobertura;
import Enumeradores.Ejercicio3FormaDePago;
import java.util.ArrayList;
import java.util.Date;

public class Ejercicio3Polizas {

    private int numPoliza, cantCuotas;
    private Date inicioPoliza, finPoliza;
    private Ejercicio3FormaDePago formaDePago;
    private boolean granizo;
    private double montoMaxGranizo, montoTotalAsegurado;
    private Ejercicio3Cobertura cobertura;
    private Ejercicio3Vehiculos vehiculo;
    private ArrayList<Ejercicio3Cuotas> cuotas = new ArrayList();

    public Ejercicio3Polizas() {
    }

    public Ejercicio3Polizas(int numPoliza, int cantCuotas, Date inicioPoliza, Date finPoliza, Ejercicio3FormaDePago formaDePago, boolean granizo, double montoMaxGranizo, double montoTotalAsegurado, Ejercicio3Cobertura cobertura, Ejercicio3Vehiculos vehiculo, ArrayList<Ejercicio3Cuotas> cuotas) {
        this.numPoliza = numPoliza;
        this.cantCuotas = cantCuotas;
        this.inicioPoliza = inicioPoliza;
        this.finPoliza = finPoliza;
        this.formaDePago = formaDePago;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.cobertura = cobertura;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
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

    public Ejercicio3FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(Ejercicio3FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
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

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Ejercicio3Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Ejercicio3Cobertura cobertura) {
        this.cobertura = cobertura;
    }

    public Ejercicio3Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Ejercicio3Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Ejercicio3Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Ejercicio3Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Ejercicio3Polizas{\n" + "numPoliza=" + numPoliza + ", cantCuotas=" + cantCuotas + ", inicioPoliza=" + inicioPoliza + ", finPoliza=" + finPoliza + ", formaDePago=" + formaDePago + ",\n granizo=" + granizo + ", montoMaxGranizo=" + montoMaxGranizo + ", montoTotalAsegurado=" + montoTotalAsegurado + ", cobertura=" + cobertura + ",\n vehiculo=" + vehiculo + ",\n cuotas=" + cuotas + '}';
    }
    
}
