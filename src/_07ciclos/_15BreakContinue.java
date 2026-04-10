package _07ciclos;

import java.util.Scanner;

public class _15BreakContinue {
    public static void main(String[] args) {
        System.out.println("**Uso de Break y Continue**");
        var scanner = new Scanner(System.in);
        System.out.print("Ingresa un número limite: ");
        int limite = scanner.nextInt();
        //Imprimir únicamente el primer número par
        for (int numero = 1; numero <= limite ; numero++) {
            if(numero % 2 == 0){
                System.out.printf("Número antes de romper el ciclo: %d%n",numero);
                break;
            }
        }
        System.out.println("Números pares con continue");
        for (int numeroDos = 1; numeroDos <= limite; numeroDos++) {
            if(numeroDos % 2 == 1 ){
                continue;
            }
            System.out.print(" "+ numeroDos);

        }

    }
}
