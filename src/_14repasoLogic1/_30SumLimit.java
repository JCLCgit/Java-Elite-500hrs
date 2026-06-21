package _14repasoLogic1;

public class _30SumLimit {
    /*
Given 2 non-negative ints, a and b, return their sum,
so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.
(Note: one way to compute the number of digits of a
non-negative int n is to convert it to a string with String.valueOf(n)
and then check the length of the string.)

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
     */
    static int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        int sum = a + b;
        String sumString = String.valueOf(sum);
        if(sumString.length() > aString.length()){
            return a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sumLimit(2, 3) = " + sumLimit(2, 3));
        System.out.println("sumLimit(8, 3) = " + sumLimit(8, 3));
        System.out.println("sumLimit(8, 1) = " + sumLimit(8, 1));
    }
}
