package _07ciclos;

public class _05ImparesDoWhile {
    public static void main(String[] args) {
        System.out.println("**Impares**");

        var contador = 0;
        do {
            if ( !((contador % 2) == 0))
                System.out.println("Impar = " + contador);
            contador++;
        }while (contador <= 20);

    }
}
