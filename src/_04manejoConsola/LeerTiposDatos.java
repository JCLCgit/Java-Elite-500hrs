package _04manejoConsola;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args){
        //Leer y limpiar consola
        var consola = new Scanner(System.in);
        int edad = 0;
        float altura = 0;
        System.out.println("edad = " + edad);
        System.out.println("altura = " + altura);
        System.out.print("Ingresa tu edad: ");
        edad = consola.nextInt();
        System.out.print("Ingresa tu altura: ");
        altura = consola.nextFloat();
        consola.nextLine();
        System.out.print("Dame tu nomnbre: ");
        var nombre = consola.nextLine();
        System.out.println("edad = " + edad);
        System.out.println("altura = " + altura);
        System.out.println("nombre = " + nombre);

    }
}
