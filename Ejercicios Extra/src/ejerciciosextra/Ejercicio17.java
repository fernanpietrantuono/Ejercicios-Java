package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        boolean retorno = numPrimo(num);
        System.out.println("El "+num+" es un número primo? "+retorno);
    }
    public static boolean numPrimo(int num){
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                cont=cont+1;
            }
        }
        boolean primos = (cont==2);
        return primos;
    }
}
