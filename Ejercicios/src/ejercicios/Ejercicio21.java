package ejercicios;

public class Ejercicio21 {

    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] retornoMatrizM = DimensionYLlenadoDeMatrizM(matrizM);
        matrizM = retornoMatrizM;
        int[][] matrizP = new int[3][3];
        int[][] retornoMatrizP = DimensionYLlenadoDeMatrizP(matrizM, matrizP);
        matrizP = retornoMatrizP;
        boolean retornoContencion = CheckContencion(matrizM, matrizP);
        System.out.println("La matriz P está contenida dentro de la matriz M? "
                + retornoContencion);
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizP[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static int[][] DimensionYLlenadoDeMatrizM(int[][] matrizM) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 99);
            }
        }
        return matrizM;
    }

    public static int[][] DimensionYLlenadoDeMatrizP(int[][] matrizM, int[][] matrizP) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                matrizP[i][j] = matrizM[i=(int) (Math.random() * 9)][j=(int) (Math.random() * 9)];
            }
        }
        System.out.println("");
        return matrizP;
    }

    public static boolean CheckContencion(int[][] matrizM, int[][] matrizP) {
        boolean contencion = false;
        for (int i = 0; i < matrizM.length - 2; i++) {
            for (int j = 0; j < matrizM[i].length - 2; j++) {
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]
                        && matrizM[i + 1][j] == matrizP[1][0] && matrizM[i + 1][j + 1] == matrizP[1][1] && matrizM[i + 1][j + 2] == matrizP[1][2]
                        && matrizM[i + 2][j] == matrizP[2][0] && matrizM[i + 2][j + 1] == matrizP[2][1] && matrizM[i + 2][j + 2] == matrizP[2][2]) {
                    System.out.println("Matriz P encontrada en la fila " + (i + 1) + " y columna " + (j + 1));
                    contencion = true;
                    break;
                }
            }
            if (contencion) {
                break;
            }
        }
        return contencion;
    }
}
