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
public class PruebaProcedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        MostrarMultiplos(num1, num2);
    }
    
    public static void MostrarMultiplos(int num1, int num2){
        boolean multiplo = (num1%num2==0);
        System.out.println("¿"+num1+" es múltiplo de "+num2+"? "+multiplo);
    }
}
