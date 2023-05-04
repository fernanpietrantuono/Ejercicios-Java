package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1NúmerosServicio {

    public ArrayList<Integer> listaNum = new ArrayList();
    public Scanner leer = new Scanner(System.in);

    public void rellenoConNúmeros() {
        int i = 0, num = 0;
        do {
            System.out.println("Ingrese el número n° " + (i + 1));
            num = leer.nextInt();
            listaNum.add(num);
            if (num == -99) {
                System.out.println("El número que ingresó no es válido");
                break;
            }
            i++;
        } while (num != -99);
    }

    public void mostrarNúmeros() {
        Collections.sort(listaNum);
        System.out.println("Lista ordenada de los números ingresados: \n" + listaNum);
    }

    public void sumaYPromedioDeNúmeros() {
        int suma = 0;
        suma = listaNum.stream().map((num) -> num).reduce(suma, Integer::sum);
        double promedio = suma / listaNum.size();
        System.out.println("La suma de todos los números de la lista es " + suma + ".\nEl promedio de los números de la lista es " + Math.round(promedio) + ".");
    }
}
