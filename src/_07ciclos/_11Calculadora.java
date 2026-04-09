package _07ciclos;

import java.util.Scanner;

public class _11Calculadora {
    public static void main(String[] args) {
        System.out.println("**Calculadora**");
        var scanner = new Scanner(System.in);
        var opcion = 0;
        var encendidoCalculadora = false;
        var numeroA = 0.0;
        var numeroB = 0.0;
        var resultado = 0.0;
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
            if(opcion >= 1 && opcion <= 4){
                System.out.printf("Ingresa tu primer número: ");
                numeroA = Float.parseFloat(scanner.nextLine());
                System.out.printf("Ingresa tu segundo número: ");
                numeroB = Float.parseFloat(scanner.nextLine());
            }
            switch (opcion){
                case 1 -> {
                    resultado = numeroA + numeroB;
                    System.out.println("resultado SUMA= " + resultado);
                }
                case 2 -> {
                    resultado = numeroA - numeroB;
                    System.out.println("resultado RESTA= " + resultado);
                }
                case 3 -> {
                    resultado = numeroA * numeroB;
                    System.out.println("resultado MULTIPLICACIÓN= " + resultado);
                }
                case 4 -> {
                    if (numeroB != 0){
                        resultado = numeroA / numeroB;
                        System.out.println("resultado DIVISIÓN = " + resultado);
                    }
                    else
                        System.out.println("Error: División entre CERO");

                }
                case 5 -> {
                    System.out.printf("Saliendo del sistema...");
                    encendidoCalculadora = true;
                }
                default -> System.out.println("¡Opción inválida!");
            }
        }
    }
}
