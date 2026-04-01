package _05operadores;

import java.util.Scanner;

public class _10EjercicioPrestamo {
    public static void main(String[] args) {
        final int DISTANCIA_MINIMA = 3;
        System.out.println("**Ejercicio de Préstamos de Libros**");
        var scanner = new Scanner(System.in);

        System.out.print("¿A Cuántos km de la biblioteca vives: ");
        var distancia = Integer.parseInt(scanner.nextLine());
        System.out.print("¿Cuenta con credencial de la Biblioteca? (true/false): ");
        var isMiembro = Boolean.parseBoolean(scanner.nextLine());
        var prestamos = (distancia <=DISTANCIA_MINIMA) || isMiembro;
        System.out.printf("El estatus del préstamo es: %b",prestamos);
    }
}
