package _07ciclos;

import java.util.Random;
import java.util.Scanner;

public class _13AdivinanzaNumero {
    public static void main(String[] args) {
        System.out.println("**Juego de adivinar número**");
        final int MAXIMO = 50;
        var random = new Random();
        var scanner = new Scanner(System.in);
        var numeroMagico = random.nextInt(MAXIMO) + 1;
        int intentosDisponibles = 7, numeroIngresado, intentosRealizados = 0;
        var ganador = false;


        System.out.printf("Adivina el número secreto desde 1 hasta %d, tienes %d intentos%n", MAXIMO,intentosDisponibles);
        while (intentosDisponibles > 0 && !ganador){
            System.out.printf("Ingresa tu número: ");
            numeroIngresado = Integer.parseInt(scanner.nextLine());
            intentosDisponibles--;
            intentosRealizados++;
            if (numeroIngresado == numeroMagico){
                System.out.printf("\nFelicidades has ganado y lo hiciste  en %d%n",intentosRealizados);
                ganador = true;
            } else if (numeroIngresado > numeroMagico) {
                System.out.println("El número mágico es Menor");
            }else
                System.out.println("El número mágico es Mayor");

        }
        System.out.println("El número mágico fue: "+ numeroMagico);




    }
}
