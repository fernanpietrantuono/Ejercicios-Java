package Ejecutores;

import Entidades.Saludo1;
import Entidades.Saludo2;

public class PracticaInterfaz {

    public static void main(String[] args) {
        Saludo1 saludar1 = new Saludo1();
        Saludo2 saludar2 = new Saludo2();
        saludar1.saludar();
        System.out.println("-------------------------------------");
        saludar2.saludar();
    }

}
