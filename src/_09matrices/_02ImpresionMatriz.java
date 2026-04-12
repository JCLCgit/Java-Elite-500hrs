package _09matrices;

public class _02ImpresionMatriz {
    public static void main(String[] args) {
        final int RENGLON = 2;
        final int COLUMNA = 3;
        int[][] matrizUno = new int[RENGLON][COLUMNA];
        System.out.println("**Impresión valores de matriz**");
        matrizUno[0][0] = 100;
        matrizUno[0][1] = 200;
        matrizUno[0][2] = 300;
        matrizUno[1][0] = 400;
        matrizUno[1][1] = 500;
        matrizUno[1][2] = 600;

        for (int i = 0; i < RENGLON ; i++) {
            for (int j = 0; j < COLUMNA ; j++) {
                System.out.printf("matrizUno [%d][%d] = %d%n ",i,j,matrizUno[i][j]);
            }
        }
    }
}
