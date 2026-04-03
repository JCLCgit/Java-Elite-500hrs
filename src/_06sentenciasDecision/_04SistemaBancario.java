package _06sentenciasDecision;

import java.util.Scanner;

public class _04SistemaBancario {
    public static void main(String[] args) {
        System.out.println("**Sistema Bancario**");

        var scanner = new Scanner(System.in);
        System.out.print("Deseas salir del sistema: ");
        var isSalir = Boolean.parseBoolean(scanner.nextLine());

        if (!isSalir){
            System.out.println("Continuamos dentro del Sistema...");
        }else {
            System.out.println("¡Hasta luego!");
        }
    }
}
