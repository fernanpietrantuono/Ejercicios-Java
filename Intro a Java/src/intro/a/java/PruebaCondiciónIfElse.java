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
public class PruebaCondiciónIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1>25 && num2<25) {
            System.out.println("El número "+num1+" es mayor a 25");
        } else if(num2>25 && num1<25) {
            System.out.println("El número "+num2+" es mayor a 25");
        } else if(num1>25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        }
        
    }
    
}
