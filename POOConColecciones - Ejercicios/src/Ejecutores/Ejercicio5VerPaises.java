package Ejecutores;

import Servicios.Ejercicio5PaisesServicio;

public class Ejercicio5VerPaises {

    public static void main(String[] args) {
        Ejercicio5PaisesServicio ps = new Ejercicio5PaisesServicio();
        ps.cargarpais();
        ps.ordenarpais();
        ps.eliminarpais();
    }

}
