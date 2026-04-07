package _07ciclos;

import java.util.Scanner;

public class _10CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("**Cajero automático**");
        var saldoCuenta = 1200.50;

        var sistemaCajero = false;
        var scanner = new Scanner(System.in);
        var opcion = 0;
        var monto = 0.0;
        while (!sistemaCajero){
            System.out.printf("""
                    \nOperaciones que puede realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);
            System.out.print("Escoge una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1 -> System.out.printf("\nSu saldo es: %.3f",saldoCuenta);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    monto = Float.parseFloat(scanner.nextLine());
                    saldoCuenta -= monto;
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    monto = Float.parseFloat(scanner.nextLine());
                    saldoCuenta += monto;
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema...");
                    sistemaCajero = true;
                }
                default -> System.out.println("Ingresa una opción válida");

            }

        }
    }
}
