package _05operadores;

import java.util.Scanner;

public class _09EjercicioDescuento {
    public static void main(String[] args) {
        System.out.println("***Ejercicio descuento en tienda***");
        var scanner = new Scanner(System.in);
        System.out.print("¿Cuántos productos ha comprado: ");
        var productosComprado = Integer.parseInt(scanner.nextLine());
        System.out.print("¿Es miembro VIP? (true/false): ");
        var isMiembro = Boolean.parseBoolean(scanner.nextLine());
        var descuento = (productosComprado >=10) && isMiembro;
        System.out.printf("El cliente es acreedor a descuento: %b",descuento);
    }
}
