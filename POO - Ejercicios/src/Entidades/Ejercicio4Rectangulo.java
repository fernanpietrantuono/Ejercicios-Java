package Entidades;

public class Ejercicio4Rectangulo {

    private int base;
    private int altura;

    public int superficie() {
        int superficie = base * altura;
        return superficie;
    }

    public int perimetro() {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == base) {
                    System.out.println(" * ");
                } else if (i == 0 || i == altura - 1) {
                    System.out.print(" * ");
                } else if (j > 0 && j < base - 1) {
                    System.out.print("   ");
                } else if (j == 0 || j == base - 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }

    public Ejercicio4Rectangulo() {
    }

    public Ejercicio4Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Ejercicio4Rectangulo{" + "base= " + base + ", altura= " + altura + ", superficie= " + superficie()
                + ", perímetro= " + perimetro() + '}';
    }

}
