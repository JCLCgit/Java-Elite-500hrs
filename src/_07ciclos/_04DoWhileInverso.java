package _07ciclos;

public class _04DoWhileInverso {
    public static void main(String[] args) {
        System.out.println("**Números Inversos con Do while");

        var contador = 10;

        do {
            System.out.println("contador = " + contador--);
        }while (contador >= 0);


    }
}
