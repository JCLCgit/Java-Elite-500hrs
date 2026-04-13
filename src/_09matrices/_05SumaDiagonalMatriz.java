package _09matrices;

import java.util.Scanner;

public class _05SumaDiagonalMatriz {
    public static void main(String[] args) {
        int renglones, columnas;
        float suma = 0.0F;
        System.out.println("**Suma diagonal de una matriz cuadrada");
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de tu matriz cuadrada: ");
        renglones = Integer.parseInt(consola.nextLine());
        columnas = renglones;

        var matriz = new int[renglones][columnas];
        System.out.println();
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el valor de ["+i+"]"+"["+j+"]: ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
                if (i == j){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("\nMatriz ["+i+"]"+"["+j+"]= "+ matriz[i][j]);
            }
        }
        System.out.println("\nsuma = " + suma);

    }
}
