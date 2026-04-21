package _11repaso;

public class _09Close10 {
    static int close10(int a, int b) {

        return (Math.abs(10-a) > Math.abs(10-b) ? b : (Math.abs(10-a) == Math.abs(10-b) ? 0 : a));

    }

    public static void main(String[] args) {

        System.out.println("close10() = " + close10(8, 13));
        System.out.println("close10() = " + close10(13, 8));
        System.out.println("close10() = " + close10(13, 7));
        System.out.println("close10() = " + close10(11, 10));

    }
}
