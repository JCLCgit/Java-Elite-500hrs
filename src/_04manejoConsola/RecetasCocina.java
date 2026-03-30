package _04manejoConsola;

import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("***RECETAS***");

        var consola = new Scanner(System.in);
        System.out.print("Dame el nombre de tu receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Dame los ingredienetes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Introduce el tiempo de preparación: ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Dificultad: ");
        var dificicultad = consola.nextLine();
        System.out.println("\tnombreReceta = " + nombreReceta);
        System.out.println("\tingredientes = " + ingredientes);
        System.out.println("\ttiempo = " + tiempo+" min");
        System.out.println("\tdificicultad = " + dificicultad);
    }
}
