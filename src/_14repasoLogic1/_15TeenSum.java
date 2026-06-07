package _14repasoLogic1;

public class _15TeenSum {
    /*
Given 2 ints, a and b, return their sum. However, "teen" values
in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
     */
    static int teenSum(int a, int b) {
        int result = (( a <= 19 && a >= 13) || (b <= 19 && b >= 13 )) ? 19 : a + b;
        return result;
    }
    public static void main(String[] args){
        System.out.println("teenSum(3, 4) = " + teenSum(3, 4));
        System.out.println("teenSum(10, 13) = " + teenSum(10, 13));
        System.out.println("teenSum(13, 2) = " + teenSum(13, 2));

    }
}
