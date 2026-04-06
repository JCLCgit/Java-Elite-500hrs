package _07ciclos;

public class _01CicloWhile {
    public static void main(String[] args) {
        System.out.println("**CICLO WHILE**");
        //impresión de números del 1 al 5
        int contador = 1;

        while (contador < 6) {
            System.out.println("contador = " + contador++);
        }
    }
}
