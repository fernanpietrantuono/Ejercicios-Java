package Ejecutores;

import Entidades.Ejercicios2y3Electrodomestico;
import Entidades.Ejercicios2y3Lavadora;
import Entidades.Ejercicios2y3Televisor;
import java.util.ArrayList;

public class Ejercicios2y3ComprarElectros {

    public static void main(String[] args) {
        Ejercicios2y3Lavadora lavadora = new Ejercicios2y3Lavadora(25, 6500, 150, "negro", 'c');
        Ejercicios2y3Televisor televisor = new Ejercicios2y3Televisor(55, true, 8000, 30, "negro", 'a');
        Ejercicios2y3Lavadora lavadora1 = new Ejercicios2y3Lavadora(40, 8000, 290, "gris", 'b');
        Ejercicios2y3Televisor televisor1 = new Ejercicios2y3Televisor(75, true, 10000, 50, "negro", 'a');
        Ejercicios2y3Lavadora lavadora2 = new Ejercicios2y3Lavadora(60, 10000, 500, "blanco", 'a');
        Ejercicios2y3Televisor televisor2 = new Ejercicios2y3Televisor(80, true, 11000, 55, "negro", 'a');
        System.out.println(lavadora.toString());
        System.out.println(lavadora.precioFinal());
        System.out.println(televisor.toString());
        System.out.println(televisor.precioFinal());
        ArrayList<Ejercicios2y3Electrodomestico> electros = new ArrayList();
        electros.add(lavadora);
        electros.add(televisor);
        electros.add(lavadora1);
        electros.add(televisor1);
        electros.add(lavadora2);
        electros.add(televisor2);
        double aux1 = 0;
        double aux2 = 0;
        int cont1 = 0;
        int cont2 = 0;
        for (Ejercicios2y3Electrodomestico electro : electros) {
            electro.precioFinal();
            if (electro.getClass().equals(lavadora.getClass())) {
                aux1 += electro.precioFinal();
                cont1++;
            }
            if (electro.getClass().equals(televisor.getClass())) {
                aux2 += electro.precioFinal();
                cont2++;
            }
        }
        System.out.println("El precio subtotal de las " + cont1 + " lavadoras es de $" + aux1);
        System.out.println("El precio subtotal de los " + cont2 + " televisores es de $" + aux2);
        System.out.println("El precio total es de $" + (aux1 + aux2));
    }

}
