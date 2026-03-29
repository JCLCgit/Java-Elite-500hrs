package _04manejoConsola;

import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Dame tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Dame tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Dame tu salario: ");
        var salario = Double.parseDouble(consola.nextLine());
        System.out.print("Es jefe de departamento: ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.printf("salario = %.3f%n",salario);
        System.out.println("esJefe = " + esJefe);
    }
}
