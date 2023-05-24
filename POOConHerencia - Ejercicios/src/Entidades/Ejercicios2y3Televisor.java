package Entidades;

public class Ejercicios2y3Televisor extends Ejercicios2y3Electrodomestico {

    protected float resolucion;
    protected boolean sintonizadorTDT;

    public Ejercicios2y3Televisor() {
    }

    public Ejercicios2y3Televisor(float resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Ejercicios2y3Televisor(float resolucion, boolean sintonizadorTDT, float precio, float peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Ejercicios2y3Televisor crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("¿El televisor tiene sintonizador TDT?");
        String resp = leer.next();
        sintonizadorTDT = "si".equals(resp);
        System.out.println("Ingrese el tamaño de la pantalla");
        resolucion = leer.nextFloat();
        return new Ejercicios2y3Televisor(resolucion, sintonizadorTDT, precio, peso, color, consumoEnergetico);
    }

    @Override
    public float precioFinal() {
        float pf = super.precioFinal();
        if (resolucion > 40) {
            pf *= 1.3;
        }
        if (sintonizadorTDT == true) {
            pf += 500;
        }
        return pf;
    }

    @Override
    public String toString() {
        return "Televisor{" + "Resolución: " + resolucion + ", Sintonizador TDT: " + sintonizadorTDT + ", Precio: " + precio + ", Color: " + color + ", Consumo Energético: " + consumoEnergetico + ", Peso: " + peso + '}';
    }
    
    

}
