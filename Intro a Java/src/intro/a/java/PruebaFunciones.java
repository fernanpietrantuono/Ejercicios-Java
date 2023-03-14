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
public class PruebaFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine(), fraseConvertida = "";
        for (int i = 0; i < frase.length(); i++) {
            fraseConvertida=fraseConvertida+caracter(frase.charAt(i));
        }
        System.out.println("\n\n");
        System.out.println(fraseConvertida);
    }
    
    public static char caracter (char letra){
        char l;
        switch (letra){
            case'a':
                l='@';
                break;
            case'e':
                l='#';
                break;
            case'i':
                l='$';
                break;
            case'o':
                l='%';
                break;
            case'u':
                l='*';
                break;
            default:
                l=letra;
        }
        return l;
    }
}
