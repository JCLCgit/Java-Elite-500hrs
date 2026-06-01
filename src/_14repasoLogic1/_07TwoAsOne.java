package _14repasoLogic1;

public class _07TwoAsOne {
    /*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
     */
    static boolean twoAsOne(int a, int b, int c) {
        if(a + b == c)
            return true;
        else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("twoAsOne(1, 2, 3) = " + twoAsOne(1, 2, 3));
        System.out.println("twoAsOne(3, 1, 2) = " + twoAsOne(3, 1, 2));
        System.out.println("twoAsOne(3, 2, 2) = " + twoAsOne(3, 2, 2));
    }
}
