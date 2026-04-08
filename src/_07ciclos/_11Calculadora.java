package _07ciclos;

import java.util.Scanner;

public class _11Calculadora {
    public static void main(String[] args) {
        System.out.println("**Calculadora**");
        var scanner = new Scanner(System.in);
        var opcion = 0;
        var encendidoCalculadora = false;

        while (!encendidoCalculadora){
            System.out.printf("""
                    \n1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    %n""");
            System.out.print("Ingresa una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){

            }
        }
    }
}
