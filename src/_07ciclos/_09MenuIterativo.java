package _07ciclos;

import java.util.Scanner;

public class _09MenuIterativo {
    public static void main(String[] args) {
        System.out.println("**Menú Iterativo**");
        var opcion = 1;
        var scanner = new Scanner(System.in);

        do {
            System.out.printf("""
                    \nMenú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    """);
            System.out.print("\nIngrese su opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("Creando cuenta...");
                }
                case 2 ->{
                    System.out.println("Eliminando cuenta...");
                }
                case 3 ->{
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Ingresa un número válido");
            }

        }while (opcion != 3);
    }
}
