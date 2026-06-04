package _14repasoLogic1;

public class _12SortaSum {
    /*
Given 2 ints, a and b, return their sum.
However, sums in the range 10..19 inclusive,
are forbidden, so in that case just return 20.

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
     */
    static int sortaSum(int a, int b) {
        int sum = 0;
        sum = a + b;
        if(sum >= 10 && sum <= 19)
            return 20;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("sortaSum(3, 4) = " + sortaSum(3, 4));
        System.out.println("sortaSum(9, 4) = " + sortaSum(9, 4));
        System.out.println("sortaSum(10, 11) = " + sortaSum(10, 11));
    }
}
