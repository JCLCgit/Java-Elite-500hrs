package _04manejoConsola;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args){
        System.out.println("***Generación números aleatorios***");
        var aleatorio = new Random();

        var numeroAleatorio = aleatorio.nextInt(10);
        System.out.println("numeroAleatorio 0-9 = " + numeroAleatorio);
        var numeroAleatorio2 = aleatorio.nextInt(10)+1;
        System.out.println("numeroAleatorio2 1-10 = " + numeroAleatorio2);
        var numeroFloat = aleatorio.nextFloat();
        System.out.println("numeroFloat = " + numeroFloat);
        var dadoAletorio = aleatorio.nextInt(6)+1;
        System.out.println("Lanzamiento DADO = " + dadoAletorio);
    }
}
