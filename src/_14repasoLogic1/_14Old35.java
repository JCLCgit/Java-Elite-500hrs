package _14repasoLogic1;

public class _14Old35 {
    /*
Return true if the given non-negative number is a multiple of 3 or 5, but not both.
Use the % "mod" operator -- see Introduction to Mod

old35(3) → true
old35(10) → true
old35(15) → false
     */
    static boolean old35(int n) {
        boolean a = n % 3 == 0 ;
        boolean b = n % 5 == 0;
        return a && b ? false : a || b ? true : false;
    }
    public static void main(String[] args) {
        System.out.println("old35(3) = " + old35(3));
        System.out.println("old35(10) = " + old35(10));
        System.out.println("old35(15) = " + old35(15));
    }
}
