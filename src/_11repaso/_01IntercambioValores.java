package _11repaso;

public class _01IntercambioValores {
    public static void main(String[] args) {
        System.out.println("**Intercambio valores con variable temporal**");
        int a = 199, b = 500, c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
