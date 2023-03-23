package ejerciciosextra;

public class Ejercicio12 {

    public static void main(String[] args) {
        String letra1, letra2, letra3;
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                letra1 = "E";
            } else {
                letra1 = String.valueOf(i);
            }
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    letra2 = "E";
                } else {
                    letra2 = String.valueOf(j);
                }
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        letra3 = "E";
                    } else {
                        letra3 = String.valueOf(k);
                    }
                    System.out.println(letra1 + " - " + letra2 + " - " + letra3);
                }
                System.out.println("");
            }
        }
    }

}
