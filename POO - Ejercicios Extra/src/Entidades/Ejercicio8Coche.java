package Entidades;

public class Ejercicio8Coche {

    public String marca;
    public String modelo;
    public long precio;

    public Ejercicio8Coche() {
    }

    public Ejercicio8Coche(String marca, String modelo, long precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ejercicio8Coche{" + "marca = " + marca + ", modelo = " + modelo + ", precio = $" + precio + '}';
    }
    
}
