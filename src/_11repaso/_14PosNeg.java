package _11repaso;

public class _14PosNeg {
    /*

Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
     */
    static boolean posNeg(int a, int b, boolean negative) {

        if( a < 0 && b < 0 && negative == true )
            return true;
        else if (a > 0 || b > 0 ) {
            return false;
        }
        else
            return  true;
    }
    public static void main(String[] args) {

        System.out.println("posNeg(1, -1, false) = " + posNeg(1, -1, false));
        System.out.println("posNeg(-1, 1, false) = " + posNeg(-1, 1, false));
        System.out.println("posNeg(-4, -5, true) = " + posNeg(-4, -5, true));
    }
}
