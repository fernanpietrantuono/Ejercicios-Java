package masejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida en metros");
        int m = leer.nextInt();
        int cm = m*100;
        int mm = m*1000;
        double in = (m*100)/2.54;
        System.out.println(m+" metros son "+cm+" cm");
        System.out.println(m+" metros son "+mm+" mm");
        System.out.println(m+" metros son "+in+" pulgadas");
    }

}
