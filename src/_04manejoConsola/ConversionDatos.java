package _04manejoConsola;

import java.util.Scanner;

public class ConversionDatos {
    public static void main(String[] args){
        System.out.println("***Conversion de DATOS***");
        var consola = new Scanner(System.in);
        System.out.print("Dame tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Dame tu altura: ");
        var altura = Float.parseFloat(consola.nextLine());
        System.out.print("Dame tu nombre: ");
        var nombre = consola.nextLine();

        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("altura = " + altura);

    }
}
