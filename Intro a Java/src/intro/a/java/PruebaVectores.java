/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.a.java;

import java.util.Scanner;

/**
 *
 * @author Daniel Pietrantuono
 */
public class PruebaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese un nombre de tu compañero/a para "
            +"la casilla "+i);
            Equipo[i]=leer.nextLine();
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.print("["+Equipo[i]+"]");
        }
        System.out.println("");
    }
}
