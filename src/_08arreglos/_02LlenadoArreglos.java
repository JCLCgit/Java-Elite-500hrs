package _08arreglos;

import java.util.Scanner;

public class _02LlenadoArreglos {
    public static void main(String[] args) {
        System.out.println("**Llenado de un arreglo");

        var consola = new Scanner(System.in);
        System.out.print("Introduce la longitud del vector: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var arregloEnteros = new int[largoArreglo];

        //Asignación valores del arreglo
        for (int i = 0; i < largoArreglo; i++) {
            System.out.print("Introduce valores enteros en [" + i +"]: ");
            arregloEnteros[i] = Integer.parseInt(consola.nextLine());
        }

        System.out.println("Impresión de datos");
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("Sus valores son [" + i +"] " + "= " + arregloEnteros[i]);
        }

    }
}
