package Entidades;

public class Ejercicios2y3Lavadora extends Ejercicios2y3Electrodomestico {

    protected int carga;

    public Ejercicios2y3Lavadora() {
    }

    public Ejercicios2y3Lavadora(int carga) {
        this.carga = carga;
    }

    public Ejercicios2y3Lavadora(int carga, float precio, float peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Ejercicios2y3Lavadora crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Introduzca la carga de la lavadora en kilogramos [10-80]");
        carga = leer.nextInt();
        return new Ejercicios2y3Lavadora(carga, precio, peso, color, consumoEnergetico);
    }

    @Override
    public float precioFinal() {
        float pf = super.precioFinal();
        if (carga > 30) {
            pf += 500;
        }
        return pf;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "Carga: " + carga + ", Precio: " + precio + ", Color: " + color + ", Consumo Energético: " + consumoEnergetico + ", Peso: " + peso + '}';
    }

}
