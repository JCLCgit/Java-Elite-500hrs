package _07ciclos;

public class _07ParesFor {
    public static void main(String[] args) {
        System.out.println("**Números Pares con For**");

        for (int contador = 0; contador <= 20; contador++) {
            if (contador %2 == 0)
            System.out.print(contador+ ", ");
        }
        System.out.println();
        for (int contador = 0; contador <= 20; contador+=2) {
            System.out.print(contador+ ", ");
        }
    }
}
