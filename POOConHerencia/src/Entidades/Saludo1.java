package Entidades;

import Interfaces.Interfaz;

public class Saludo1 implements Interfaz {

    @Override
    public void saludar() {
        System.out.println("Hello world!!!!");
    }

}
