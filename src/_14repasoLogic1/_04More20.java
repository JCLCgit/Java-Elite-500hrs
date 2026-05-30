package _14repasoLogic1;

public class _04More20 {
    /*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true
     */
    static boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }
    public static void main(String[] args){
        System.out.println("more20(20) = " + more20(20));
        System.out.println("more20(21) = " + more20(21));
        System.out.println("more20(22) = " + more20(22));
    }
}
