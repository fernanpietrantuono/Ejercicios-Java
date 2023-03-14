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
public class PruebaCondiciónSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción entre 1 y 4");
        int Motor = leer.nextInt();
        switch (Motor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de combustible");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta "
                        + "alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para un tipo de "
                + "bomba");
        }
        
    }
    
}
