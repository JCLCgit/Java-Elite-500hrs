package _14repasoLogic1;

public class _20ShareDigit {
    /*
Given two ints, each in the range 10..99, return true
if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (
Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
     */
    static boolean shareDigit(int a, int b) {
        int digit1, digit2;
        digit1 = a / 10;
        digit2 = a % 10;

        return digit1 == b / 10 || digit1 == b % 10 || digit2 == b / 10 || digit2 == b % 10;
    }
    public static void main(String[] args) {
        System.out.println("shareDigit(12, 23) = " + shareDigit(12, 23));
        System.out.println("shareDigit(12, 43)  = " + shareDigit(12, 43) );
        System.out.println("shareDigit(12, 44) = " + shareDigit(12, 44));
    }
}
