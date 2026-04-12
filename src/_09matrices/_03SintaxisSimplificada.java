package _09matrices;

public class _03SintaxisSimplificada {
    public static void main(String[] args) {
        System.out.println("**Sintaxis simplificada Matriz**");

        var matriz = new int[][]{{100,150,190},{200,234,280}};

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.printf("matrizUno [%d][%d] = %d%n ",i,j,matriz[i][j]);
            }
        }
    }
}
