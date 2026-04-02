package _06sentenciasDecision;

import java.util.Scanner;

public class _02NumeroPositivo {
    public static void main(String[] args) {
        System.out.println("***Número Positivo");

        var scanner = new Scanner(System.in);
        System.out.print("Introduce el número a verificar: ");
        var numero = Integer.parseInt(scanner.nextLine());

        if(numero > 0){
            System.out.println("POSITIVO");
        } else if (numero == 0) {
            System.out.println("CERO");
        } else
            System.out.println("NEGATIVO");


    }
}
