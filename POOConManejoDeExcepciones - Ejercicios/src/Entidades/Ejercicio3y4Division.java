package Entidades;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3y4Division {

    private int num1;
    private int num2;
    private Scanner leer = new Scanner(System.in);

    public Ejercicio3y4Division() {
    }

    public Ejercicio3y4Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void Dividir() {
        int n1;
        String n2;
        try {
            System.out.println("Ingresa el primer numero (Entero)");
            n1 = leer.nextInt();
            System.out.println("Ingresa el segundo numero (Entero)");
            n2 = leer.next();
            int n4 = parseInt(n2);
            double resultado = n1 / n4;
            System.out.println("resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("No estas ingresando un entero");
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("No se puede transformar a numero entero");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            System.out.println(e);
        }
    }

}
