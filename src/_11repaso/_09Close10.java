package _11repaso;

public class _09Close10 {
    static int close10(int a, int b) {

        return (Math.abs(10-a) > Math.abs(10-b) ? a : (Math.abs(10-a) == Math.abs(10-b) ? 0 : b));

    }

    public static void main(String[] args) {

        close10(8, 13);
        close10(13, 8);
        close10(13, 7);
    }
}
