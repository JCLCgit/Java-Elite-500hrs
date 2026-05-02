package _11repaso;

public class _21LastDigit {
    /*
Given two non-negative int values, return true if
they have the same last digit, such as with 27 and 57.
 Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
     */
    static boolean lastDigit(int a, int b) {
        boolean result = true;
        if (a >= 0 && b >= 0){
            System.out.println("a, b = " + (a % 10) +" "+ (b % 10));
            if ((a % 10) == (b % 10)){

                result = true;
            }
            else
                result = false;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("lastDigit(7, 17) = " + lastDigit(7, 17));
        System.out.println("lastDigit(6, 17) = " + lastDigit(6, 17));
        System.out.println("lastDigit(3, 113) = " + lastDigit(3, 113));
    }
}
