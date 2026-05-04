package _11repaso;

public class _29IntMax {
    /*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
     */
    static int intMax(int a, int b, int c) {

        if (a > b){
            if (a > c)
                return a;
            else
                return c;
        } else if (b > c) {
            return b;
        }else
            return c;
    }
    public static void main(String[] args) {
        System.out.println("intMax(1, 2, 3) = " + intMax(1, 2, 3));
        System.out.println("intMax(1, 3, 2) = " + intMax(1, 3, 2));
        System.out.println("intMax(3, 2, 1) = " + intMax(3, 2, 1));
    }
}
