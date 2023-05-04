package Ejecutores;

import Servicios.Ejercicio5PaísesServicio;

public class Ejercicio5VerPaíses {

    public static void main(String[] args) {
        Ejercicio5PaísesServicio ps = new Ejercicio5PaísesServicio();
        ps.cargarpais();
        ps.ordenarpais();
        ps.eliminarpais();
    }

}
