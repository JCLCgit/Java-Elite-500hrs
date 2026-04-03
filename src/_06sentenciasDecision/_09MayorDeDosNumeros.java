package _06sentenciasDecision;

import java.util.Scanner;

public class _09MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("**Mayor de Dos Números**");

        var scanner = new Scanner(System.in);
        int a,b;

        System.out.print("Ingresa tu primer número: ");
        a = scanner.nextInt();
        System.out.print("Ingresa tu segundo número: ");
        b = scanner.nextInt();

        var respuesta = (a > b) ? "Tu primer número es mayor" : "Tu segundo número es el mayor";
        System.out.println("respuesta = " + respuesta);
    }
}
