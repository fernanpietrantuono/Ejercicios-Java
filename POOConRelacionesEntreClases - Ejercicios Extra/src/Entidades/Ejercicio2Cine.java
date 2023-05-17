package Entidades;

public class Ejercicio2Cine {

    private Ejercicio2Pelicula pelicula;
    private Integer sala;
    private Double precio;
    private Ejercicio2Asiento[][] asientos;

    public Ejercicio2Cine() {
    }

    public Ejercicio2Cine(Ejercicio2Pelicula pelicula, Integer sala, Double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
        asientos = new Ejercicio2Asiento[8][6];
        String[] letra = {"a", "b", "c", "d", "e", "f"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = new Ejercicio2Asiento(null, 8 - i, letra[j]);
            }
        }
    }

    public Ejercicio2Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Ejercicio2Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Ejercicio2Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Ejercicio2Asiento[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Ejercicio2Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precio=" + precio + '}';
    }

}
