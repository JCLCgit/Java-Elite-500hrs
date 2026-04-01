package _05operadores;

import java.util.Scanner;

public class _08EjercicioRango {
    public static void main(String[] args) {
        int a = 8,b = 3 , solicitado;
        boolean resultado;
        var scanner = new Scanner(System.in);
        System.out.println("***Verificar Rango del número***");
        System.out.print("Ingresa un número entero: ");
        solicitado =  Integer.parseInt(scanner.nextLine());
        resultado = (solicitado <= a) && (solicitado >= b);
        System.out.printf("(%d-%d) -> %d = %b",b,a,solicitado, resultado);



    }
}
