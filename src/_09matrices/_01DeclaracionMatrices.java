package _09matrices;

public class _01DeclaracionMatrices {
    public static void main(String[] args) {
        int[][] matrizUno = new int[2][3];

        matrizUno[0][0] = 100;
        matrizUno[0][1] = 200;
        matrizUno[0][2] = 300;
        matrizUno[1][0] = 400;
        matrizUno[1][1] = 500;
        matrizUno[1][2] = 600;

        System.out.println("Valor [0][2] = "+ matrizUno[0][2]);
    }
}
