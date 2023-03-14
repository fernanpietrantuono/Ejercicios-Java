package ejerciciosextra;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        System.out.println("Ingrese un resultado para adivinar la multiplicación "
                + "de ambos números");
        int multiplicacion = leer.nextInt();
        int respCorrecta = num1 * num2;
        while (multiplicacion != respCorrecta) {
            System.out.println("Fallaste. Ingrese nuevamente un resultado para "
                    + "adivinar la multiplicación");
            multiplicacion = leer.nextInt();
        }
        System.out.println("Acertaste! La respuesta correcta de la "
                + "multiplicación es "+respCorrecta);
    }

}
