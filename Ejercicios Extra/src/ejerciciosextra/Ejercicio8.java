package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;
        int suma1 = 0;
        int suma2 = 0;
        do{
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if(num%5==0){
                break;
            }
            if(num%2==0 && num>0){
                cont1=cont1+1;
                suma1=suma1+num;
            }else{
                cont2=cont2+1;
                suma2=suma2+num;
            }
            cont=cont+1;
        }while(num%5!=0);
        System.out.println("Cantidad total de números leídos: "+cont);
        System.out.println("Cantidad de números pares: "+cont1);
        System.out.println("El resultado de la suma de los números pares es "
        +suma1);
        System.out.println("Cantidad de números impares: "+cont2);
        System.out.println("El resultado de la suma de los números impares es "
        +suma2);
    }
}
