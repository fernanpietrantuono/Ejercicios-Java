package Entidades;

import Enumeradores.Ejercicio3TipoDeVehiculo;

public class Ejercicio3Vehiculos {

    private String marca, modelo, patente, numMotor, numChasis, color;
    private int anio;
    private Ejercicio3TipoDeVehiculo tipo;

    public Ejercicio3Vehiculos() {
    }

    public Ejercicio3Vehiculos(String marca, String modelo, String patente, String numMotor, String numChasis, String color, int anio, Ejercicio3TipoDeVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Ejercicio3TipoDeVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(Ejercicio3TipoDeVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ejercicio3Vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", numMotor=" + numMotor + ", numChasis=" + numChasis + ", color=" + color + ", anio=" + anio + ", tipo=" + tipo + '}';
    }
        
}
