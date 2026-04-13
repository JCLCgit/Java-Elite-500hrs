package _09matrices;

import java.util.Scanner;

public class _04MatrizDinamica {
    public static void main(String[] args) {
        System.out.println("**Matriz dinámica**");
        int renglones, columnas;
        var consola =  new Scanner(System.in);
        System.out.print("Ingresa el número de renglones de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el número de columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());

        System.out.println();
        int[][] matriz = new int[renglones][columnas];
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el valor de ["+i+"]"+"["+j+"]: ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }
        System.out.println();
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("\nMatriz ["+i+"]"+"["+j+"]= "+ matriz[i][j]);
            }
        }
    }
}
