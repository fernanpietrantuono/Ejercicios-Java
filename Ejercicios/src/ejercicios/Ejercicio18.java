package ejercicios;

public class Ejercicio18 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 15);
            }
        }
        int[][] matrizTraspuesta = new int[4][4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matrizTraspuesta[j][i] + "  ");
            }
            System.out.println("");
        }
    }

}
