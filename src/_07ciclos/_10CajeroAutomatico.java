package _07ciclos;

import java.util.Scanner;

public class _10CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("**Cajero automático**");
        final var SALDO_CUENTA = 1200.50;

        var sistemaCajero = false;
        var scanner = new Scanner(System.in);

        while (!sistemaCajero){
            System.out.printf("""
                    \nOperaciones que puede realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    """);
            System.out.print("Escoge una opción: ");

        }
    }
}
