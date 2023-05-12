package Entidades;

public class Ejercicio2Jugador {

    private Integer ID;
    private String nombre;
    private Boolean mojado;

    public Ejercicio2Jugador() {
    }

    public Ejercicio2Jugador(Integer ID, String nombre, Boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Ejercicio2Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public boolean disparo(Ejercicio2RevolverDeAgua r) {
        r.mojar();
        r.siguienteChorro();
        if (r.mojar()) {
            return mojado = true;
        } else {
            mojado = false;
            r.siguienteChorro();
            return mojado;
        }
    }

}
