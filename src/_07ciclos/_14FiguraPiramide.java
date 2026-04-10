package _07ciclos;

import java.util.Scanner;

public class _14FiguraPiramide {
    public static void main(String[] args) {
        System.out.println("**Figura Pirámide**");
        var scanner = new Scanner(System.in);
        int numeroFilas;
        String numeroEspacios;
        String numeroFiguras;
        System.out.printf("Ingresa el número de filas de tu pirámide: ");
        numeroFilas = scanner. nextInt();
        
        for (int i=1; i <= numeroFilas; i++){
            numeroEspacios = " ".repeat(numeroFilas-i);
            numeroFiguras = "*".repeat(2*i-1);
            System.out.println(numeroEspacios + numeroFiguras);
        }
    }
}
