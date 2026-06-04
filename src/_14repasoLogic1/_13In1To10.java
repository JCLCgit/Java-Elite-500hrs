package _14repasoLogic1;

public class _13In1To10 {
    /*
Given a number n, return true if n is in the range 1..10, inclusive.
Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
     */
    static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode && (n >= 10 || n <= 1))
            return true;
        if(!outsideMode && n <= 10 && n >= 1)
            return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println("in1To10(5, false) = " + in1To10(5, false));
        System.out.println("in1To10(11, false) = " + in1To10(11, false));
        System.out.println("in1To10(11, true) = " + in1To10(11, true));
    }
}
